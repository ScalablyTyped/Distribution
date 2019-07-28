package typings.ionic.libHttpMod

import typings.ionic.definitionsMod.APIResponse
import typings.ionic.definitionsMod.SuperAgentError
import typings.ionic.ionicStrings.UNKNOWN_CONTENT_TYPE
import typings.ionic.ionicStrings.UNKNOWN_RESPONSE_FORMAT
import typings.ionic.ionicStrings.`application/json`
import typings.ionic.libErrorsMod.FatalException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CONTENT_TYPE_JSON: `application/json` = js.native
  val ERROR_UNKNOWN_CONTENT_TYPE: UNKNOWN_CONTENT_TYPE = js.native
  val ERROR_UNKNOWN_RESPONSE_FORMAT: UNKNOWN_RESPONSE_FORMAT = js.native
  def createFatalAPIFormat(req: SuperAgentRequest, res: APIResponse): FatalException = js.native
  def formatResponseError(req: SuperAgentRequest): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: Double): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: Double, body: String): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: Double, body: js.Object): String = js.native
  def formatSuperAgentError(e: SuperAgentError): String = js.native
  def transformAPIResponse(r: SuperAgentResponse): APIResponse = js.native
}

