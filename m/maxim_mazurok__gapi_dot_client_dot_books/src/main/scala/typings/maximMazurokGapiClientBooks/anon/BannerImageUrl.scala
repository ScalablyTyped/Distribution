package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BannerImageUrl extends StObject {
  
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
  implicit class BannerImageUrlMutableBuilder[Self <: BannerImageUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBannerImageUrl(value: String): Self = StObject.set(x, "bannerImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannerImageUrlUndefined: Self = StObject.set(x, "bannerImageUrl", js.undefined)
    
    @scala.inline
    def setEligibleForSubscription(value: Boolean): Self = StObject.set(x, "eligibleForSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligibleForSubscriptionUndefined: Self = StObject.set(x, "eligibleForSubscription", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCompleteUndefined: Self = StObject.set(x, "isComplete", js.undefined)
    
    @scala.inline
    def setSeriesFormatType(value: String): Self = StObject.set(x, "seriesFormatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesFormatTypeUndefined: Self = StObject.set(x, "seriesFormatType", js.undefined)
    
    @scala.inline
    def setSeriesId(value: String): Self = StObject.set(x, "seriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesIdUndefined: Self = StObject.set(x, "seriesId", js.undefined)
    
    @scala.inline
    def setSeriesSubscriptionReleaseInfo(value: CancelTime): Self = StObject.set(x, "seriesSubscriptionReleaseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesSubscriptionReleaseInfoUndefined: Self = StObject.set(x, "seriesSubscriptionReleaseInfo", js.undefined)
    
    @scala.inline
    def setSeriesType(value: String): Self = StObject.set(x, "seriesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesTypeUndefined: Self = StObject.set(x, "seriesType", js.undefined)
    
    @scala.inline
    def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
