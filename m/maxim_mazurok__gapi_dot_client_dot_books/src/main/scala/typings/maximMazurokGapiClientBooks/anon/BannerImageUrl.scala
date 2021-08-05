package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BannerImageUrl extends StObject {
  
  var bannerImageUrl: js.UndefOr[String] = js.undefined
  
  var eligibleForSubscription: js.UndefOr[Boolean] = js.undefined
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var isComplete: js.UndefOr[Boolean] = js.undefined
  
  var seriesFormatType: js.UndefOr[String] = js.undefined
  
  var seriesId: js.UndefOr[String] = js.undefined
  
  var seriesSubscriptionReleaseInfo: js.UndefOr[CancelTime] = js.undefined
  
  var seriesType: js.UndefOr[String] = js.undefined
  
  var subscriptionId: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object BannerImageUrl {
  
  inline def apply(): BannerImageUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerImageUrl]
  }
  
  extension [Self <: BannerImageUrl](x: Self) {
    
    inline def setBannerImageUrl(value: String): Self = StObject.set(x, "bannerImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerImageUrlUndefined: Self = StObject.set(x, "bannerImageUrl", js.undefined)
    
    inline def setEligibleForSubscription(value: Boolean): Self = StObject.set(x, "eligibleForSubscription", value.asInstanceOf[js.Any])
    
    inline def setEligibleForSubscriptionUndefined: Self = StObject.set(x, "eligibleForSubscription", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
    
    inline def setIsCompleteUndefined: Self = StObject.set(x, "isComplete", js.undefined)
    
    inline def setSeriesFormatType(value: String): Self = StObject.set(x, "seriesFormatType", value.asInstanceOf[js.Any])
    
    inline def setSeriesFormatTypeUndefined: Self = StObject.set(x, "seriesFormatType", js.undefined)
    
    inline def setSeriesId(value: String): Self = StObject.set(x, "seriesId", value.asInstanceOf[js.Any])
    
    inline def setSeriesIdUndefined: Self = StObject.set(x, "seriesId", js.undefined)
    
    inline def setSeriesSubscriptionReleaseInfo(value: CancelTime): Self = StObject.set(x, "seriesSubscriptionReleaseInfo", value.asInstanceOf[js.Any])
    
    inline def setSeriesSubscriptionReleaseInfoUndefined: Self = StObject.set(x, "seriesSubscriptionReleaseInfo", js.undefined)
    
    inline def setSeriesType(value: String): Self = StObject.set(x, "seriesType", value.asInstanceOf[js.Any])
    
    inline def setSeriesTypeUndefined: Self = StObject.set(x, "seriesType", js.undefined)
    
    inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
