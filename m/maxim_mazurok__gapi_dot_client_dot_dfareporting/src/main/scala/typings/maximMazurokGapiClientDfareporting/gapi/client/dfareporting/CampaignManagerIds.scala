package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignManagerIds extends js.Object {
  
  /** Ad ID for Campaign Manager. */
  var adId: js.UndefOr[String] = js.native
  
  /** Campaign ID for Campaign Manager. */
  var campaignId: js.UndefOr[String] = js.native
  
  /** Creative ID for Campaign Manager. */
  var creativeId: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaignManagerIds". */
  var kind: js.UndefOr[String] = js.native
  
  /** Placement ID for Campaign Manager. */
  var placementId: js.UndefOr[String] = js.native
  
  /** Site ID for Campaign Manager. */
  var siteId: js.UndefOr[String] = js.native
}
object CampaignManagerIds {
  
  @scala.inline
  def apply(): CampaignManagerIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignManagerIds]
  }
  
  @scala.inline
  implicit class CampaignManagerIdsOps[Self <: CampaignManagerIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdId(value: String): Self = this.set("adId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdId: Self = this.set("adId", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    
    @scala.inline
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPlacementId(value: String): Self = this.set("placementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementId: Self = this.set("placementId", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
  }
}
