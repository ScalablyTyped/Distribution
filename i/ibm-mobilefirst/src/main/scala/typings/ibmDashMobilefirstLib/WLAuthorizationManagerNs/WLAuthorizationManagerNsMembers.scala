package typings
package ibmDashMobilefirstLib.WLAuthorizationManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WLAuthorizationManager")
@js.native
object WLAuthorizationManagerNsMembers extends js.Object {
  /**
    * AuthorizationPersistencePolicy possible values
    */
  var ALWAYS: java.lang.String = js.native
  var NEVER: java.lang.String = js.native
  def addCachedAuthorizationHeader(request: RequestObject): jqueryLib.JQueryDeferred[RequestObject] = js.native
  def getAppIdentity(): jqueryLib.JQueryDeferred[_] = js.native
  def getAuthorizationScope(responseAuthenticationHeader: java.lang.String): java.lang.String = js.native
  /**
    * TODO: Set Promise types. Should be something like: JQueryDeferred<data, error>()
    */
  def getCachedAuthorizationHeader(): jqueryLib.JQueryDeferred[_] = js.native
  /**
    * TODO: Set Promise types. Should be something like: JQueryDeferred<data, error>()
    */
  def getDeviceIdentity(): jqueryLib.JQueryDeferred[_] = js.native
  /**
    * TODO: Set Promise types. Should be something like: JQueryDeferred<data, error>()
    */
  def getUserIdentity(): jqueryLib.JQueryDeferred[_] = js.native
  def isAuthorizationRequired(responseStatus: scala.Double, responseAuthenticationHeader: java.lang.String): scala.Boolean = js.native
  /**
    * TODO: Set Promise types. Should be something like: JQueryDeferred<header, error>()
    */
  def obtainAuthorizationHeader(scope: java.lang.String): jqueryLib.JQueryDeferred[_] = js.native
  /**
    * See WLAuthorizarionManager.NEVER and WLAuthorizarionManager.ALWAYS
    */
  def setAuthorizationPersistencePolicy(authorizationPersistencePolicy: java.lang.String): scala.Unit = js.native
}

