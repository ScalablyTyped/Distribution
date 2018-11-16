package typings
package loopbackLib.loopbackMod

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
@JSImport("loopback", "AccessRequest")
@js.native
class AccessRequest protected ()
  extends loopbackLib.loopbackMod.lNs.AccessRequest {
  def this(model: java.lang.String, property: java.lang.String, accessType: java.lang.String, permission: java.lang.String) = this()
  /**
               * Does the given `ACL` apply to this `AccessRequest`
               * @param {ACL} acl
               */
  /* CompleteClass */
  override def exactlyMatches(acl: loopbackLib.loopbackMod.lNs.ACL): scala.Unit = js.native
  /**
               * Is the request for access allowed
               * @returns {boolean}
               */
  /* CompleteClass */
  override def isAllowed(): scala.Boolean = js.native
  /**
               * Does the request contain any wildcards
               * @returns {boolean}
               */
  /* CompleteClass */
  override def isWildcard(): scala.Boolean = js.native
}

