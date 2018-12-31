package typings
package loopbackLib.loopbackMod.lNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access context represents the context for a request to access protected
  * resource
  * @class
  * @options {Context} context The context object
  * @constructor
  */
@js.native
trait AccessContext extends js.Object {
  /**
    * Add a principal to the context
    * @param {string} principalType The principal type
    * @param {*} principalId The principal id
    * @param {string} [principalName] The principal name
    * @returns {boolean}
    */
  def addPrincipal(principalType: java.lang.String, principalId: js.Any): scala.Boolean = js.native
  def addPrincipal(principalType: java.lang.String, principalId: js.Any, principalName: java.lang.String): scala.Boolean = js.native
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
  def isAuthenticated(): scala.Boolean = js.native
}

