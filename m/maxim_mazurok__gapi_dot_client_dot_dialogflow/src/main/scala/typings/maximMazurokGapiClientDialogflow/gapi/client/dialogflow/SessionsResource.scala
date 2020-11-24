package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Alt
import typings.maximMazurokGapiClientDialogflow.anon.AltCallback
import typings.maximMazurokGapiClientDialogflow.anon.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionsResource extends js.Object {
  
  var contexts: ContextsResource = js.native
  
  /** Deletes all active contexts in the specified session. */
  def deleteContexts(): Request[js.Object] = js.native
  def deleteContexts(request: Alt): Request[js.Object] = js.native
  
  def detectIntent(request: AltCallback, body: GoogleCloudDialogflowV2DetectIntentRequest): Request[GoogleCloudDialogflowV2DetectIntentResponse] = js.native
  /**
    * Processes a natural language query and returns structured, actionable data as a result. This method is not idempotent, because it may cause contexts and session entity types to be
    * updated, which in turn might affect results of future queries.
    */
  def detectIntent(request: Session): Request[GoogleCloudDialogflowV2DetectIntentResponse] = js.native
  
  var entityTypes: EntityTypesResource = js.native
}
