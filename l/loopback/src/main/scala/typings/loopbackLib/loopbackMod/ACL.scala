package typings
package loopbackLib.loopbackMod

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
class ACL ()
  extends loopbackLib.loopbackMod.lNs.ACL {
  /** Contains additional model settings. */
  /* CompleteClass */
  override var settings: loopbackLib.loopbackMod.lNs.Settings = js.native
  /* CompleteClass */
  override def afterRemote(
    method: java.lang.String,
    callback: js.Function3[
      /* ctx */ loopbackLib.loopbackMod.lNs.Context, 
      /* modelInstanceOrNext */ this.type | expressLib.expressMod.eNs.NextFunction, 
      /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def afterRemoteError(method: java.lang.String, callback: expressLib.expressMod.eNs.NextFunction): scala.Unit = js.native
  /**
    * loopback 3.x Remote hooks
    * http://loopback.io/doc/en/lb3/Remote-hooks.html
    * @param method
    * @param backback
    */
  /* CompleteClass */
  override def beforeRemote(
    method: java.lang.String,
    callback: js.Function3[
      /* ctx */ loopbackLib.loopbackMod.lNs.Context, 
      /* modelInstanceOrNext */ this.type | expressLib.expressMod.eNs.NextFunction, 
      /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

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
  def checkAccessForContext(context: loopbackLib.Anon_AccessType, callback: js.Function0[scala.Unit]): scala.Unit = js.native
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
    token: loopbackLib.loopbackMod.lNs.AccessToken,
    model: java.lang.String,
    modelId: js.Any,
    method: java.lang.String,
    callback: js.Function2[/* err */ java.lang.String | nodeLib.Error, /* allowed */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
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
    principalType: java.lang.String,
    principalId: java.lang.String,
    model: java.lang.String,
    property: java.lang.String,
    accessType: java.lang.String,
    callback: js.Function2[
      /* err */ java.lang.String | nodeLib.Error, 
      /* result */ loopbackLib.loopbackMod.lNs.AccessRequest, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Calculate the matching score for the given rule and request
    * @param {ACL} rule The ACL entry
    * @param {AccessRequest} req The request
    * @returns {number}
    */
  def getMatchingScore(rule: loopbackLib.loopbackMod.lNs.ACL, req: loopbackLib.loopbackMod.lNs.AccessRequest): scala.Double = js.native
  /**
    * Check if the given principal is mapped to the role
    * @param {string} principalType Principal type
    * @param {string|*} principalId Principal id/name
    * @param {string|*} role Role id/name
    * @param {() => void} cb Callback functio
    */
  def isMappedToRole(
    principalType: java.lang.String,
    principalId: java.lang.String,
    role: java.lang.String,
    cb: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def isMappedToRole(
    principalType: java.lang.String,
    principalId: java.lang.String,
    role: js.Any,
    cb: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def isMappedToRole(
    principalType: java.lang.String,
    principalId: js.Any,
    role: java.lang.String,
    cb: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def isMappedToRole(principalType: java.lang.String, principalId: js.Any, role: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Resolve a principal by type/id
    * @param {string} type Principal type - ROLE/APP/USER
    * @param {string|number} id Principal id or name
    * @param {() => void} cb Callback function
    */
  def resolvePrincipal(`type`: java.lang.String, id: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def resolvePrincipal(`type`: java.lang.String, id: scala.Double, cb: js.Function0[scala.Unit]): scala.Unit = js.native
}

