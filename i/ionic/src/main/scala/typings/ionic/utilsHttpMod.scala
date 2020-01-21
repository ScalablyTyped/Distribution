package typings.ionic

import typings.ionic.definitionsMod.CreateRequestOptions
import typings.ionic.definitionsMod.HttpMethod
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/utils/http", JSImport.Namespace)
@js.native
object utilsHttpMod extends js.Object {
  val PROXY_ENVIRONMENT_VARIABLES: js.Array[String] = js.native
  def createRequest(method: HttpMethod, url: String, hasProxySsl: CreateRequestOptions): js.Promise[AnonReqSuperAgentRequest1305225833] = js.native
  def download(req: SuperAgentRequest, ws: WritableStream, hasProgress: AnonLoaded): js.Promise[Unit] = js.native
  type SuperAgentRequest = typings.superagent.mod.SuperAgentRequest
}

