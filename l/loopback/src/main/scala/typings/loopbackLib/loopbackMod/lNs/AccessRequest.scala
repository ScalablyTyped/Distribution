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

