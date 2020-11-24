package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Download response.
  */
@js.native
trait SchemaDownloadResponse extends js.Object {
  
  /**
    * Retrieved ad groups in SDF format.
    */
  var adGroups: js.UndefOr[String] = js.native
  
  /**
    * Retrieved ads in SDF format.
    */
  var ads: js.UndefOr[String] = js.native
  
  /**
    * Retrieved campaigns in SDF format.
    */
  var campaigns: js.UndefOr[String] = js.native
  
  /**
    * Retrieved insertion orders in SDF format.
    */
  var insertionOrders: js.UndefOr[String] = js.native
  
  var inventorySources: js.UndefOr[String] = js.native
  
  /**
    * Retrieved line items in SDF format.
    */
  var lineItems: js.UndefOr[String] = js.native
}
object SchemaDownloadResponse {
  
  @scala.inline
  def apply(): SchemaDownloadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadResponse]
  }
  
  @scala.inline
  implicit class SchemaDownloadResponseOps[Self <: SchemaDownloadResponse] (val x: Self) extends AnyVal {
    
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
    def setAdGroups(value: String): Self = this.set("adGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdGroups: Self = this.set("adGroups", js.undefined)
    
    @scala.inline
    def setAds(value: String): Self = this.set("ads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAds: Self = this.set("ads", js.undefined)
    
    @scala.inline
    def setCampaigns(value: String): Self = this.set("campaigns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaigns: Self = this.set("campaigns", js.undefined)
    
    @scala.inline
    def setInsertionOrders(value: String): Self = this.set("insertionOrders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertionOrders: Self = this.set("insertionOrders", js.undefined)
    
    @scala.inline
    def setInventorySources(value: String): Self = this.set("inventorySources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySources: Self = this.set("inventorySources", js.undefined)
    
    @scala.inline
    def setLineItems(value: String): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
  }
}
