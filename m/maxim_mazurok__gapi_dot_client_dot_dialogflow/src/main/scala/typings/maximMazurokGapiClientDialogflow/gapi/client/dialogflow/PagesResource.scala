package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Fields
import typings.maximMazurokGapiClientDialogflow.anon.Force
import typings.maximMazurokGapiClientDialogflow.anon.Key
import typings.maximMazurokGapiClientDialogflow.anon.KeyLanguageCode
import typings.maximMazurokGapiClientDialogflow.anon.LanguageCode
import typings.maximMazurokGapiClientDialogflow.anon.LanguageCodeName
import typings.maximMazurokGapiClientDialogflow.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagesResource extends StObject {
  
  def create(request: Fields, body: GoogleCloudDialogflowCxV3Page): Request[GoogleCloudDialogflowCxV3Page] = js.native
  /**
    * Creates a page in the specified flow. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def create(request: KeyLanguageCode): Request[GoogleCloudDialogflowCxV3Page] = js.native
  
  /**
    * Deletes the specified page. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  /** Retrieves the specified page. */
  def get(): Request[GoogleCloudDialogflowCxV3Page] = js.native
  def get(request: Key): Request[GoogleCloudDialogflowCxV3Page] = js.native
  
  /** Returns the list of all pages in the specified flow. */
  def list(): Request[GoogleCloudDialogflowCxV3ListPagesResponse] = js.native
  def list(request: LanguageCode): Request[GoogleCloudDialogflowCxV3ListPagesResponse] = js.native
  
  /**
    * Updates the specified page. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def patch(request: LanguageCodeName): Request[GoogleCloudDialogflowCxV3Page] = js.native
  def patch(request: Oauthtoken, body: GoogleCloudDialogflowCxV3Page): Request[GoogleCloudDialogflowCxV3Page] = js.native
}
