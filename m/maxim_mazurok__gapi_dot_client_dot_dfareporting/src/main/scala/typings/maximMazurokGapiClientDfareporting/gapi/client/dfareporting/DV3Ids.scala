package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DV3Ids extends js.Object {
  
  /** Campaign ID for DV360. */
  var dvCampaignId: js.UndefOr[String] = js.native
  
  /** Creative ID for DV360. */
  var dvCreativeId: js.UndefOr[String] = js.native
  
  /** Insertion Order ID for DV360. */
  var dvInsertionOrderId: js.UndefOr[String] = js.native
  
  /** Line Item ID for DV360. */
  var dvLineItemId: js.UndefOr[String] = js.native
  
  /** Site ID for DV360. */
  var dvSiteId: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#dV3Ids". */
  var kind: js.UndefOr[String] = js.native
}
object DV3Ids {
  
  @scala.inline
  def apply(): DV3Ids = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DV3Ids]
  }
  
  @scala.inline
  implicit class DV3IdsOps[Self <: DV3Ids] (val x: Self) extends AnyVal {
    
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
    def setDvCampaignId(value: String): Self = this.set("dvCampaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvCampaignId: Self = this.set("dvCampaignId", js.undefined)
    
    @scala.inline
    def setDvCreativeId(value: String): Self = this.set("dvCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvCreativeId: Self = this.set("dvCreativeId", js.undefined)
    
    @scala.inline
    def setDvInsertionOrderId(value: String): Self = this.set("dvInsertionOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvInsertionOrderId: Self = this.set("dvInsertionOrderId", js.undefined)
    
    @scala.inline
    def setDvLineItemId(value: String): Self = this.set("dvLineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvLineItemId: Self = this.set("dvLineItemId", js.undefined)
    
    @scala.inline
    def setDvSiteId(value: String): Self = this.set("dvSiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvSiteId: Self = this.set("dvSiteId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
