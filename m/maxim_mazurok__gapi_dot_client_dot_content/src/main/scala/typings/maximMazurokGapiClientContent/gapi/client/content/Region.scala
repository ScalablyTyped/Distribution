package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Region extends js.Object {
  
  /** The display name of the region. */
  var displayName: js.UndefOr[String] = js.native
  
  /** A list of geotargets that defines the region area. */
  var geotargetArea: js.UndefOr[RegionGeoTargetArea] = js.native
  
  /** Output only. Immutable. Merchant that owns the region. */
  var merchantId: js.UndefOr[String] = js.native
  
  /** A list of postal codes that defines the region area. */
  var postalCodeArea: js.UndefOr[RegionPostalCodeArea] = js.native
  
  /** Output only. Immutable. The ID uniquely identifying each region. */
  var regionId: js.UndefOr[String] = js.native
  
  /** Output only. Indicates if the region is eligible to use in the Regional Inventory configuration. */
  var regionalInventoryEligible: js.UndefOr[Boolean] = js.native
  
  /** Output only. Indicates if the region is eligible to use in the Shipping Services configuration. */
  var shippingEligible: js.UndefOr[Boolean] = js.native
}
object Region {
  
  @scala.inline
  def apply(): Region = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setGeotargetArea(value: RegionGeoTargetArea): Self = this.set("geotargetArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeotargetArea: Self = this.set("geotargetArea", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    
    @scala.inline
    def setPostalCodeArea(value: RegionPostalCodeArea): Self = this.set("postalCodeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCodeArea: Self = this.set("postalCodeArea", js.undefined)
    
    @scala.inline
    def setRegionId(value: String): Self = this.set("regionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionId: Self = this.set("regionId", js.undefined)
    
    @scala.inline
    def setRegionalInventoryEligible(value: Boolean): Self = this.set("regionalInventoryEligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalInventoryEligible: Self = this.set("regionalInventoryEligible", js.undefined)
    
    @scala.inline
    def setShippingEligible(value: Boolean): Self = this.set("shippingEligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingEligible: Self = this.set("shippingEligible", js.undefined)
  }
}
