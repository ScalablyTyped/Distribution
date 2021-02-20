package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Alt
import typings.maximMazurokGapiClientDialogflow.anon.Key
import typings.maximMazurokGapiClientDialogflow.anon.LanguageCode
import typings.maximMazurokGapiClientDialogflow.anon.Name
import typings.maximMazurokGapiClientDialogflow.anon.Oauthtoken
import typings.maximMazurokGapiClientDialogflow.anon.PageSize
import typings.maximMazurokGapiClientDialogflow.anon.PageToken
import typings.maximMazurokGapiClientDialogflow.anon.Parent
import typings.maximMazurokGapiClientDialogflow.anon.PrettyPrint
import typings.maximMazurokGapiClientDialogflow.anon.QuotaUser
import typings.maximMazurokGapiClientDialogflow.anon.Resource
import typings.maximMazurokGapiClientDialogflow.anon.UpdateMask
import typings.maximMazurokGapiClientDialogflow.anon.UploadType
import typings.maximMazurokGapiClientDialogflow.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityTypesResource extends StObject {
  
  def batchDelete(request: Alt, body: GoogleCloudDialogflowV2BatchDeleteEntityTypesRequest): Request[GoogleLongrunningOperation] = js.native
  /** Deletes entity types in the specified agent. Operation */
  def batchDelete(request: Key): Request[GoogleLongrunningOperation] = js.native
  
  def batchUpdate(request: Alt, body: GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest): Request[GoogleLongrunningOperation] = js.native
  /** Updates/Creates multiple entity types in the specified agent. Operation */
  def batchUpdate(request: Oauthtoken): Request[GoogleLongrunningOperation] = js.native
  
  def create(request: Alt, body: GoogleCloudDialogflowV2SessionEntityType): Request[GoogleCloudDialogflowV2SessionEntityType] = js.native
  /** Creates an entity type in the specified agent. */
  def create(request: LanguageCode): Request[GoogleCloudDialogflowV2EntityType] = js.native
  def create(request: Parent, body: GoogleCloudDialogflowV2EntityType): Request[GoogleCloudDialogflowV2EntityType] = js.native
  /**
    * Creates a session entity type. If the specified session entity type already exists, overrides the session entity type. This method doesn't work with Google Assistant integration.
    * Contact Dialogflow support if you need to use session entities with Google Assistant integration.
    */
  def create(request: Resource): Request[GoogleCloudDialogflowV2SessionEntityType] = js.native
  
  /** Deletes the specified entity type. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  var entities: EntitiesResource = js.native
  
  /** Retrieves the specified entity type. */
  /**
    * Retrieves the specified session entity type. This method doesn't work with Google Assistant integration. Contact Dialogflow support if you need to use session entities with Google
    * Assistant integration.
    */
  def get(): Request[GoogleCloudDialogflowV2EntityType] = js.native
  def get(request: Name): Request[GoogleCloudDialogflowV2SessionEntityType] = js.native
  def get(request: PrettyPrint): Request[GoogleCloudDialogflowV2EntityType] = js.native
  
  /** Returns the list of all entity types in the specified agent. */
  /**
    * Returns the list of all session entity types in the specified session. This method doesn't work with Google Assistant integration. Contact Dialogflow support if you need to use
    * session entities with Google Assistant integration.
    */
  def list(): Request[GoogleCloudDialogflowV2ListEntityTypesResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDialogflowV2ListEntityTypesResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudDialogflowV2ListSessionEntityTypesResponse] = js.native
  
  /** Updates the specified entity type. */
  def patch(request: QuotaUser): Request[GoogleCloudDialogflowV2EntityType] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDialogflowV2EntityType): Request[GoogleCloudDialogflowV2EntityType] = js.native
  /**
    * Updates the specified session entity type. This method doesn't work with Google Assistant integration. Contact Dialogflow support if you need to use session entities with Google
    * Assistant integration.
    */
  def patch(request: UploadType): Request[GoogleCloudDialogflowV2SessionEntityType] = js.native
  def patch(request: Uploadprotocol, body: GoogleCloudDialogflowV2SessionEntityType): Request[GoogleCloudDialogflowV2SessionEntityType] = js.native
}
