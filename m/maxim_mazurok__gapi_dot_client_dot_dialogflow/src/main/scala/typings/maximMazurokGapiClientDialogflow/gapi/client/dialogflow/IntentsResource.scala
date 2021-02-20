package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Alt
import typings.maximMazurokGapiClientDialogflow.anon.CallbackFields
import typings.maximMazurokGapiClientDialogflow.anon.FieldsIntentView
import typings.maximMazurokGapiClientDialogflow.anon.FieldsKey
import typings.maximMazurokGapiClientDialogflow.anon.IntentView
import typings.maximMazurokGapiClientDialogflow.anon.IntentViewKey
import typings.maximMazurokGapiClientDialogflow.anon.KeyLanguageCode
import typings.maximMazurokGapiClientDialogflow.anon.LanguageCodeName
import typings.maximMazurokGapiClientDialogflow.anon.Name
import typings.maximMazurokGapiClientDialogflow.anon.NameOauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentsResource extends StObject {
  
  def batchDelete(request: Alt, body: GoogleCloudDialogflowV2BatchDeleteIntentsRequest): Request[GoogleLongrunningOperation] = js.native
  /** Deletes intents in the specified agent. Operation */
  def batchDelete(request: CallbackFields): Request[GoogleLongrunningOperation] = js.native
  
  def batchUpdate(request: Alt, body: GoogleCloudDialogflowV2BatchUpdateIntentsRequest): Request[GoogleLongrunningOperation] = js.native
  /** Updates/Creates multiple intents in the specified agent. Operation */
  def batchUpdate(request: FieldsKey): Request[GoogleLongrunningOperation] = js.native
  
  def create(request: FieldsIntentView, body: GoogleCloudDialogflowV2Intent): Request[GoogleCloudDialogflowV2Intent] = js.native
  /** Creates an intent in the specified agent. */
  def create(request: IntentView): Request[GoogleCloudDialogflowV2Intent] = js.native
  
  /** Deletes the specified intent and its direct or indirect followup intents. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Retrieves the specified intent. */
  def get(): Request[GoogleCloudDialogflowV2Intent] = js.native
  def get(request: IntentViewKey): Request[GoogleCloudDialogflowV2Intent] = js.native
  
  /** Returns the list of all intents in the specified agent. */
  def list(): Request[GoogleCloudDialogflowV2ListIntentsResponse] = js.native
  def list(request: KeyLanguageCode): Request[GoogleCloudDialogflowV2ListIntentsResponse] = js.native
  
  /** Updates the specified intent. */
  def patch(request: LanguageCodeName): Request[GoogleCloudDialogflowV2Intent] = js.native
  def patch(request: NameOauthtoken, body: GoogleCloudDialogflowV2Intent): Request[GoogleCloudDialogflowV2Intent] = js.native
}
