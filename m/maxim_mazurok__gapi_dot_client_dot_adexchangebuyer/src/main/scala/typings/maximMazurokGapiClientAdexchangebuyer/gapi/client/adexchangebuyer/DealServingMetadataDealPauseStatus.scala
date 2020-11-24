package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealServingMetadataDealPauseStatus extends js.Object {
  
  var buyerPauseReason: js.UndefOr[String] = js.native
  
  /** If the deal is paused, records which party paused the deal first. */
  var firstPausedBy: js.UndefOr[String] = js.native
  
  var hasBuyerPaused: js.UndefOr[Boolean] = js.native
  
  var hasSellerPaused: js.UndefOr[Boolean] = js.native
  
  var sellerPauseReason: js.UndefOr[String] = js.native
}
object DealServingMetadataDealPauseStatus {
  
  @scala.inline
  def apply(): DealServingMetadataDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealServingMetadataDealPauseStatus]
  }
  
  @scala.inline
  implicit class DealServingMetadataDealPauseStatusOps[Self <: DealServingMetadataDealPauseStatus] (val x: Self) extends AnyVal {
    
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
    def setBuyerPauseReason(value: String): Self = this.set("buyerPauseReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyerPauseReason: Self = this.set("buyerPauseReason", js.undefined)
    
    @scala.inline
    def setFirstPausedBy(value: String): Self = this.set("firstPausedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPausedBy: Self = this.set("firstPausedBy", js.undefined)
    
    @scala.inline
    def setHasBuyerPaused(value: Boolean): Self = this.set("hasBuyerPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasBuyerPaused: Self = this.set("hasBuyerPaused", js.undefined)
    
    @scala.inline
    def setHasSellerPaused(value: Boolean): Self = this.set("hasSellerPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasSellerPaused: Self = this.set("hasSellerPaused", js.undefined)
    
    @scala.inline
    def setSellerPauseReason(value: String): Self = this.set("sellerPauseReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellerPauseReason: Self = this.set("sellerPauseReason", js.undefined)
  }
}
