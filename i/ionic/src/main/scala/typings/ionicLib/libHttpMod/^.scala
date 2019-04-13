package typings
package ionicLib.libHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CONTENT_TYPE_JSON: ionicLib.ionicLibStrings.`application/json` = js.native
  val ERROR_UNKNOWN_CONTENT_TYPE: ionicLib.ionicLibStrings.UNKNOWN_CONTENT_TYPE = js.native
  val ERROR_UNKNOWN_RESPONSE_FORMAT: ionicLib.ionicLibStrings.UNKNOWN_RESPONSE_FORMAT = js.native
  def createFatalAPIFormat(req: superagentLib.superagentMod.SuperAgentRequest, res: ionicLib.definitionsMod.APIResponse): ionicLib.libErrorsMod.FatalException = js.native
  def formatResponseError(req: superagentLib.superagentMod.SuperAgentRequest): java.lang.String = js.native
  def formatResponseError(req: superagentLib.superagentMod.SuperAgentRequest, status: scala.Double): java.lang.String = js.native
  def formatResponseError(req: superagentLib.superagentMod.SuperAgentRequest, status: scala.Double, body: java.lang.String): java.lang.String = js.native
  def formatResponseError(req: superagentLib.superagentMod.SuperAgentRequest, status: scala.Double, body: js.Object): java.lang.String = js.native
  def formatSuperAgentError(e: ionicLib.definitionsMod.SuperAgentError): java.lang.String = js.native
  def transformAPIResponse(r: superagentLib.superagentMod.Response): ionicLib.definitionsMod.APIResponse = js.native
}

