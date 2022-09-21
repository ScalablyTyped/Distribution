package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Fields
import typings.maximMazurokGapiClientDialogflow.anon.Force
import typings.maximMazurokGapiClientDialogflow.anon.Key
import typings.maximMazurokGapiClientDialogflow.anon.LanguageCode
import typings.maximMazurokGapiClientDialogflow.anon.LanguageCodeOauthtoken
import typings.maximMazurokGapiClientDialogflow.anon.NameOauthtoken
import typings.maximMazurokGapiClientDialogflow.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionRouteGroupsResource extends StObject {
  
  def create(request: Fields, body: GoogleCloudDialogflowCxV3TransitionRouteGroup): Request[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  /**
    * Creates an TransitionRouteGroup in the specified flow. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def create(request: LanguageCodeOauthtoken): Request[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  
  /**
    * Deletes the specified TransitionRouteGroup. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  /** Retrieves the specified TransitionRouteGroup. */
  def get(): Request[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def get(request: Key): Request[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  
  /** Returns the list of all transition route groups in the specified flow. */
  def list(): Request[GoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse] = js.native
  def list(request: LanguageCode): Request[GoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse] = js.native
  
  /**
    * Updates the specified TransitionRouteGroup. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def patch(request: NameOauthtoken): Request[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def patch(request: Oauthtoken, body: GoogleCloudDialogflowCxV3TransitionRouteGroup): Request[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
}
