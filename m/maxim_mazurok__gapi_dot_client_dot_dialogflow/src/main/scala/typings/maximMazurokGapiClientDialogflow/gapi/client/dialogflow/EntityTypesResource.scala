package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typings.maximMazurokGapiClientDialogflow.anon.Callback
import typings.maximMazurokGapiClientDialogflow.anon.Fields
import typings.maximMazurokGapiClientDialogflow.anon.Force
import typings.maximMazurokGapiClientDialogflow.anon.Key
import typings.maximMazurokGapiClientDialogflow.anon.LanguageCode
import typings.maximMazurokGapiClientDialogflow.anon.Name
import typings.maximMazurokGapiClientDialogflow.anon.Oauthtoken
import typings.maximMazurokGapiClientDialogflow.anon.PageSize
import typings.maximMazurokGapiClientDialogflow.anon.Parent
import typings.maximMazurokGapiClientDialogflow.anon.PrettyPrint
import typings.maximMazurokGapiClientDialogflow.anon.QuotaUser
import typings.maximMazurokGapiClientDialogflow.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityTypesResource extends StObject {
  
  /**
    * Creates an entity type in the specified agent. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def create(request: Callback): Request[GoogleCloudDialogflowCxV3EntityType] = js.native
  def create(request: Fields, body: GoogleCloudDialogflowCxV3EntityType): Request[GoogleCloudDialogflowCxV3EntityType] = js.native
  /** Creates a session entity type. */
  def create(request: Parent): Request[GoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def create(request: PrettyPrint, body: GoogleCloudDialogflowCxV3SessionEntityType): Request[GoogleCloudDialogflowCxV3SessionEntityType] = js.native
  
  /**
    * Deletes the specified entity type. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  /** Retrieves the specified entity type. */
  /** Retrieves the specified session entity type. */
  def get(): Request[GoogleCloudDialogflowCxV3EntityType] = js.native
  def get(request: Accesstoken): Request[GoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def get(request: Key): Request[GoogleCloudDialogflowCxV3EntityType] = js.native
  
  /** Returns the list of all entity types in the specified agent. */
  /** Returns the list of all session entity types in the specified session. */
  def list(): Request[GoogleCloudDialogflowCxV3ListEntityTypesResponse] = js.native
  def list(request: LanguageCode): Request[GoogleCloudDialogflowCxV3ListEntityTypesResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDialogflowCxV3ListSessionEntityTypesResponse] = js.native
  
  /**
    * Updates the specified entity type. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def patch(request: Name): Request[GoogleCloudDialogflowCxV3EntityType] = js.native
  def patch(request: Oauthtoken, body: GoogleCloudDialogflowCxV3EntityType): Request[GoogleCloudDialogflowCxV3EntityType] = js.native
  /** Updates the specified session entity type. */
  def patch(request: QuotaUser): Request[GoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDialogflowCxV3SessionEntityType): Request[GoogleCloudDialogflowCxV3SessionEntityType] = js.native
}
