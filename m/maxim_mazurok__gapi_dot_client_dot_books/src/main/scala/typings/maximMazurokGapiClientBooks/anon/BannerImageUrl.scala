package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BannerImageUrl extends js.Object {
  
  var bannerImageUrl: js.UndefOr[String] = js.native
  
  var eligibleForSubscription: js.UndefOr[Boolean] = js.native
  
  var imageUrl: js.UndefOr[String] = js.native
  
  var isComplete: js.UndefOr[Boolean] = js.native
  
  var seriesFormatType: js.UndefOr[String] = js.native
  
  var seriesId: js.UndefOr[String] = js.native
  
  var seriesSubscriptionReleaseInfo: js.UndefOr[CancelTime] = js.native
  
  var seriesType: js.UndefOr[String] = js.native
  
  var subscriptionId: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object BannerImageUrl {
  
  @scala.inline
  def apply(): BannerImageUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerImageUrl]
  }
  
  @scala.inline
  implicit class BannerImageUrlOps[Self <: BannerImageUrl] (val x: Self) extends AnyVal {
    
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
    def setBannerImageUrl(value: String): Self = this.set("bannerImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerImageUrl: Self = this.set("bannerImageUrl", js.undefined)
    
    @scala.inline
    def setEligibleForSubscription(value: Boolean): Self = this.set("eligibleForSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEligibleForSubscription: Self = this.set("eligibleForSubscription", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setIsComplete(value: Boolean): Self = this.set("isComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsComplete: Self = this.set("isComplete", js.undefined)
    
    @scala.inline
    def setSeriesFormatType(value: String): Self = this.set("seriesFormatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesFormatType: Self = this.set("seriesFormatType", js.undefined)
    
    @scala.inline
    def setSeriesId(value: String): Self = this.set("seriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesId: Self = this.set("seriesId", js.undefined)
    
    @scala.inline
    def setSeriesSubscriptionReleaseInfo(value: CancelTime): Self = this.set("seriesSubscriptionReleaseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesSubscriptionReleaseInfo: Self = this.set("seriesSubscriptionReleaseInfo", js.undefined)
    
    @scala.inline
    def setSeriesType(value: String): Self = this.set("seriesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesType: Self = this.set("seriesType", js.undefined)
    
    @scala.inline
    def setSubscriptionId(value: String): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionId: Self = this.set("subscriptionId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
