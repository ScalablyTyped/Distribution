package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.CallbackCampaignId
import typings.maximMazurokGapiClientDfareporting.anon.CampaignId
import typings.maximMazurokGapiClientDfareporting.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignCreativeAssociationsResource extends StObject {
  
  def insert(request: CallbackCampaignId, body: CampaignCreativeAssociation): Request[CampaignCreativeAssociation] = js.native
  /**
    * Associates a creative with the specified campaign. This method creates a default ad with dimensions matching the creative in the campaign if such a default ad does not exist
    * already.
    */
  def insert(request: CampaignId): Request[CampaignCreativeAssociation] = js.native
  
  /** Retrieves the list of creative IDs associated with the specified campaign. This method supports paging. */
  def list(): Request[CampaignCreativeAssociationsListResponse] = js.native
  def list(request: PageToken): Request[CampaignCreativeAssociationsListResponse] = js.native
}
