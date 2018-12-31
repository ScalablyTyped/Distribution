package typings
package loopbackLib.loopbackMod.lNs

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
@js.native
trait ACL extends PersistedModel {
  /** accessType Type of access being granted: one of READ, WRITE, or EXECUTE. */
  var accesType: loopbackLib.loopbackLibStrings.READ | loopbackLib.loopbackLibStrings.WRITE | loopbackLib.loopbackLibStrings.EXECUTE = js.native
  /** model Name of the model. */
  var model: java.lang.String = js.native
  /**permission Type of permission granted  One of:
    *  - ALARM: Generate an alarm, in a system-dependent way, the access specified in the permissions component of the ACL entry.
    *  - ALLOW: Explicitly grants access to the resource.
    *  - AUDIT: Log, in a system-dependent way, the access specified in the permissions component of the ACL entry.
    *  - DENY: Explicitly denies access to the resource.
    */
  var permission: loopbackLib.loopbackLibStrings.ALARM | loopbackLib.loopbackLibStrings.ALLOW | loopbackLib.loopbackLibStrings.AUDIT | loopbackLib.loopbackLibStrings.DENY = js.native
  /** principalId ID of the principal - such as appId, userId or roleId. */
  var principalId: java.lang.String = js.native
  /** principalType Type of the principal; one of: Application, Use, Role. */
  var principalType: loopbackLib.loopbackLibStrings.Aplication | loopbackLib.loopbackLibStrings.User | loopbackLib.loopbackLibStrings.Role | java.lang.String = js.native
  /** property Name of the property, method, scope, or relation. */
  var property: java.lang.String = js.native
  /** settings Extends the `Model.settings` object. */
  @JSName("settings")
  var settings_ACL: loopbackLib.Anon_Acls = js.native
  /**
    * Get matching score for the given `AccessRequest`.
    * @param {AccessRequest} req The request
    * @returns {number} scor
    */
  def score(req: AccessRequest): scala.Double = js.native
}

