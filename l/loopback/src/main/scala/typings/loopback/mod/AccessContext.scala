package typings.loopback.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access context represents the context for a request to access protected
  * resource
  * @class
  * @options {Context} context The context object
  * @constructor
  */
@JSImport("loopback", "AccessContext")
@js.native
class AccessContext protected () extends js.Object {
  /** context The context object */
  def this(context: Context) = this()
  
  /**
    * Add a principal to the context
    * @param {string} principalType The principal type
    * @param {*} principalId The principal id
    * @param {string} [principalName] The principal name
    * @returns {boolean}
    */
  def addPrincipal(principalType: String, principalId: js.Any): Boolean = js.native
  def addPrincipal(principalType: String, principalId: js.Any, principalName: String): Boolean = js.native
  
  /**
    * Get the application id
    * @returns {*}
    */
  def getAppId(): js.Any = js.native
  
  /**
    * Get the user id
    * @returns {*}
    */
  def getUserId(): js.Any = js.native
  
  /**
    * Check if the access context has authenticated principals
    * @returns {boolean}
    */
  def isAuthenticated(): Boolean = js.native
}
