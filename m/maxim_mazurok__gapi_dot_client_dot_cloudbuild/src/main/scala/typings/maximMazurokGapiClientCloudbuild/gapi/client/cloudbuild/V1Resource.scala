package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudbuild.anon.QuotaUserUploadType
import typings.maximMazurokGapiClientCloudbuild.anon.WebhookKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Resource extends StObject {
  
  def webhook(request: QuotaUserUploadType, body: HttpBody): Request[js.Object] = js.native
  /** ReceiveWebhook is called when the API receives a GitHub webhook. */
  def webhook(request: WebhookKey): Request[js.Object] = js.native
}
