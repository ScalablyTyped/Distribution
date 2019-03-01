package typings
package loopbackLib.loopbackMod.lNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to access protected resources.
  * @param {string} model The model name
  * @param {string} property
  * @param {string} accessType The access type
  * @param {string} permission The requested permission
  * @returns {AccessRequest}
  * @class
  * @constructor
  */
trait AccessRequest extends js.Object {
  /**
    * Does the given `ACL` apply to this `AccessRequest`
    * @param {ACL} acl
    */
  def exactlyMatches(acl: ACL): scala.Unit
  /**
    * Is the request for access allowed
    * @returns {boolean}
    */
  def isAllowed(): scala.Boolean
  /**
    * Does the request contain any wildcards
    * @returns {boolean}
    */
  def isWildcard(): scala.Boolean
}

object AccessRequest {
  @scala.inline
  def apply(
    exactlyMatches: js.Function1[ACL, scala.Unit],
    isAllowed: js.Function0[scala.Boolean],
    isWildcard: js.Function0[scala.Boolean]
  ): AccessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exactlyMatches")(exactlyMatches)
    __obj.updateDynamic("isAllowed")(isAllowed)
    __obj.updateDynamic("isWildcard")(isWildcard)
    __obj.asInstanceOf[AccessRequest]
  }
}

