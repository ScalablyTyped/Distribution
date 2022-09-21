package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.AccesstokenAlt
import typings.maximMazurokGapiClientDialogflow.anon.AltCallback
import typings.maximMazurokGapiClientDialogflow.anon.CallbackFields
import typings.maximMazurokGapiClientDialogflow.anon.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionsResource extends StObject {
  
  def detectIntent(request: AccesstokenAlt, body: GoogleCloudDialogflowCxV3DetectIntentRequest): Request[GoogleCloudDialogflowCxV3DetectIntentResponse] = js.native
  /**
    * Processes a natural language query and returns structured, actionable data as a result. This method is not idempotent, because it may cause session entity types to be updated, which
    * in turn might affect results of future queries. Note: Always use agent versions for production traffic. See [Versions and
    * environments](https://cloud.google.com/dialogflow/cx/docs/concept/version).
    */
  def detectIntent(request: Session): Request[GoogleCloudDialogflowCxV3DetectIntentResponse] = js.native
  
  var entityTypes: EntityTypesResource = js.native
  
  def fulfillIntent(request: AccesstokenAlt, body: GoogleCloudDialogflowCxV3FulfillIntentRequest): Request[GoogleCloudDialogflowCxV3FulfillIntentResponse] = js.native
  /** Fulfills a matched intent returned by MatchIntent. Must be called after MatchIntent, with input from MatchIntentResponse. Otherwise, the behavior is undefined. */
  def fulfillIntent(request: AltCallback): Request[GoogleCloudDialogflowCxV3FulfillIntentResponse] = js.native
  
  def matchIntent(request: AccesstokenAlt, body: GoogleCloudDialogflowCxV3MatchIntentRequest): Request[GoogleCloudDialogflowCxV3MatchIntentResponse] = js.native
  /** Returns preliminary intent match results, doesn't change the session status. */
  def matchIntent(request: CallbackFields): Request[GoogleCloudDialogflowCxV3MatchIntentResponse] = js.native
}
