package typings.loopback.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
open class AccessRequest protected () extends StObject {
  def this(model: String, property: String, accessType: String, permission: String) = this()
  
  /**
    * Does the given `ACL` apply to this `AccessRequest`
    * @param {ACL} acl
    */
  def exactlyMatches(acl: ACL): Unit = js.native
  
  /**
    * Is the request for access allowed
    * @returns {boolean}
    */
  def isAllowed(): Boolean = js.native
  
  /**
    * Does the request contain any wildcards
    * @returns {boolean}
    */
  def isWildcard(): Boolean = js.native
}
