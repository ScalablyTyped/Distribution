package typings.loopback.mod

import typings.loopback.anon.AccessType
import typings.loopback.anon.Acls
import typings.loopback.loopbackStrings.ALARM
import typings.loopback.loopbackStrings.ALLOW
import typings.loopback.loopbackStrings.AUDIT
import typings.loopback.loopbackStrings.Aplication
import typings.loopback.loopbackStrings.DENY
import typings.loopback.loopbackStrings.EXECUTE
import typings.loopback.loopbackStrings.READ
import typings.loopback.loopbackStrings.WRITE
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Model for access control meta data
  * System grants permissions to principals (users/applications, can be grouped
  * into roles)
  * Protected resource: the model data and operations
  * (model/property/method/relation/…
  * For a given principal, such as client application and/or user, is it allowed
  * to access (read/write/execute)
  * the protected resource
  * @header ACL
  * @property {string} model Name of the model.
  * @property {string} property Name of the property, method, scope, or relation.
  * @property {string} accessType Type of access being granted: one of READ, WRITE, or EXECUTE.
  * @property {string} permission Type of permission granted. One of
  *  - ALARM: Generate an alarm, in a system-dependent way, the access specified in the permissions component of the ACL entry.
  *  - ALLOW: Explicitly grants access to the resource.
  *  - AUDIT: Log, in a system-dependent way, the access specified in the permissions component of the ACL entry.
  *  - DENY: Explicitly denies access to the resource.
  * @property {string} principalType Type of the principal; one of: Application, Use, Role.
  * @property {string} principalId ID of the principal - such as appId, userId or roleId.
  * @property {any} settings Extends the `Model.settings` object.
  * @property {string} settings.defaultPermission Default permission setting: ALLOW, DENY, ALARM, or AUDIT. Default is ALLOW.
  * Set to DENY to prohibit all API access by default
  * @class ACL
  * @inherits PersistedMode
  */
@JSImport("loopback", "ACL")
@js.native
class ACL () extends PersistedModel {
  /** accessType Type of access being granted: one of READ, WRITE, or EXECUTE. */
  var accesType: READ | WRITE | EXECUTE = js.native
  /** model Name of the model. */
  var model: String = js.native
  /**permission Type of permission granted  One of:
    *  - ALARM: Generate an alarm, in a system-dependent way, the access specified in the permissions component of the ACL entry.
    *  - ALLOW: Explicitly grants access to the resource.
    *  - AUDIT: Log, in a system-dependent way, the access specified in the permissions component of the ACL entry.
    *  - DENY: Explicitly denies access to the resource.
    */
  var permission: ALARM | ALLOW | AUDIT | DENY = js.native
  /** principalId ID of the principal - such as appId, userId or roleId. */
  var principalId: String = js.native
  /** principalType Type of the principal; one of: Application, Use, Role. */
  var principalType: Aplication | typings.loopback.loopbackStrings.User | typings.loopback.loopbackStrings.Role | String = js.native
  /** property Name of the property, method, scope, or relation. */
  var property: String = js.native
  /** settings Extends the `Model.settings` object. */
  @JSName("settings")
  var settings_ACL: Acls = js.native
  /**
    * Get matching score for the given `AccessRequest`.
    * @param {AccessRequest} req The request
    * @returns {number} scor
    */
  def score(req: AccessRequest): Double = js.native
}

/* static members */
@JSImport("loopback", "ACL")
@js.native
object ACL extends js.Object {
  /**
    * Check if the request has the permission to access.
    * @options {any} context See below.
    * @property {any[]} principals An Array of principals.
    * @property {string|Model} model The model name or model class.
    * @property {*} id The model instance ID.
    * @property {string} property The property/method/relation name.
    * @property {string} accessType The access type:
    *   READ, REPLICATE, WRITE, or EXECUTE.
    * @param {() => void} callback Callback functio
    */
  def checkAccessForContext(context: AccessType, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Check if the given access token can invoke the method
    * @param {AccessToken} token The access token
    * @param {string} model The model name
    * @param {*} modelId The model id
    * @param {string} method The method name
    * @callback {() => void} callback Callback function
    * @param {string|Error} err The error object
    * @param {boolean} allowed is the request allow
    */
  def checkAccessForToken(
    token: AccessToken,
    model: String,
    modelId: js.Any,
    method: String,
    callback: js.Function2[/* err */ String | Error, /* allowed */ Boolean, Unit]
  ): Unit = js.native
  /**
    * Check if the given principal is allowed to access the model/property
    * @param {string} principalType The principal type.
    * @param {string} principalId The principal ID.
    * @param {string} model The model name.
    * @param {string} property The property/method/relation name.
    * @param {string} accessType The access type.
    * @callback {() => void} callback Callback function.
    * @param {string|Error} err The error object
    * @param {AccessRequest} result The access permissio
    */
  def checkPermission(
    principalType: String,
    principalId: String,
    model: String,
    property: String,
    accessType: String,
    callback: js.Function2[/* err */ String | Error, /* result */ AccessRequest, Unit]
  ): Unit = js.native
  /**
    * Calculate the matching score for the given rule and request
    * @param {ACL} rule The ACL entry
    * @param {AccessRequest} req The request
    * @returns {number}
    */
  def getMatchingScore(rule: ACL, req: AccessRequest): Double = js.native
  /**
    * Check if the given principal is mapped to the role
    * @param {string} principalType Principal type
    * @param {string|*} principalId Principal id/name
    * @param {string|*} role Role id/name
    * @param {() => void} cb Callback functio
    */
  def isMappedToRole(principalType: String, principalId: String, role: String, cb: js.Function0[Unit]): Unit = js.native
  def isMappedToRole(principalType: String, principalId: String, role: js.Any, cb: js.Function0[Unit]): Unit = js.native
  def isMappedToRole(principalType: String, principalId: js.Any, role: String, cb: js.Function0[Unit]): Unit = js.native
  def isMappedToRole(principalType: String, principalId: js.Any, role: js.Any, cb: js.Function0[Unit]): Unit = js.native
  /**
    * Resolve a principal by type/id
    * @param {string} type Principal type - ROLE/APP/USER
    * @param {string|number} id Principal id or name
    * @param {() => void} cb Callback function
    */
  def resolvePrincipal(`type`: String, id: String, cb: js.Function0[Unit]): Unit = js.native
  def resolvePrincipal(`type`: String, id: Double, cb: js.Function0[Unit]): Unit = js.native
}

