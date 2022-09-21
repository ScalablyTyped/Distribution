package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImageSettings extends StObject {
  
  /**
    * The URL for the background image shown on the video watch page. The image should be 1200px by 615px, with a maximum file size of 128k.
    */
  var backgroundImageUrl: js.UndefOr[SchemaLocalizedProperty] = js.undefined
  
  /**
    * This is generated when a ChannelBanner.Insert request has succeeded for the given channel.
    */
  var bannerExternalUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. Desktop size (1060x175).
    */
  var bannerImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. Mobile size high resolution (1440x395).
    */
  var bannerMobileExtraHdImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. Mobile size high resolution (1280x360).
    */
  var bannerMobileHdImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. Mobile size (640x175).
    */
  var bannerMobileImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. Mobile size low resolution (320x88).
    */
  var bannerMobileLowImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. Mobile size medium/high resolution (960x263).
    */
  var bannerMobileMediumHdImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. Tablet size extra high resolution (2560x424).
    */
  var bannerTabletExtraHdImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. Tablet size high resolution (2276x377).
    */
  var bannerTabletHdImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. Tablet size (1707x283).
    */
  var bannerTabletImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. Tablet size low resolution (1138x188).
    */
  var bannerTabletLowImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. TV size high resolution (1920x1080).
    */
  var bannerTvHighImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. TV size extra high resolution (2120x1192).
    */
  var bannerTvImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. TV size low resolution (854x480).
    */
  var bannerTvLowImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Banner image. TV size medium resolution (1280x720).
    */
  var bannerTvMediumImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The image map script for the large banner image.
    */
  var largeBrandedBannerImageImapScript: js.UndefOr[SchemaLocalizedProperty] = js.undefined
  
  /**
    * The URL for the 854px by 70px image that appears below the video player in the expanded video view of the video watch page.
    */
  var largeBrandedBannerImageUrl: js.UndefOr[SchemaLocalizedProperty] = js.undefined
  
  /**
    * The image map script for the small banner image.
    */
  var smallBrandedBannerImageImapScript: js.UndefOr[SchemaLocalizedProperty] = js.undefined
  
  /**
    * The URL for the 640px by 70px banner image that appears below the video player in the default view of the video watch page. The URL for the image that appears above the top-left corner of the video player. This is a 25-pixel-high image with a flexible width that cannot exceed 170 pixels.
    */
  var smallBrandedBannerImageUrl: js.UndefOr[SchemaLocalizedProperty] = js.undefined
  
  /**
    * The URL for a 1px by 1px tracking pixel that can be used to collect statistics for views of the channel or video pages.
    */
  var trackingImageUrl: js.UndefOr[String | Null] = js.undefined
  
  var watchIconImageUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaImageSettings {
  
  inline def apply(): SchemaImageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageSettings]
  }
  
  extension [Self <: SchemaImageSettings](x: Self) {
    
    inline def setBackgroundImageUrl(value: SchemaLocalizedProperty): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
    
    inline def setBannerExternalUrl(value: String): Self = StObject.set(x, "bannerExternalUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerExternalUrlNull: Self = StObject.set(x, "bannerExternalUrl", null)
    
    inline def setBannerExternalUrlUndefined: Self = StObject.set(x, "bannerExternalUrl", js.undefined)
    
    inline def setBannerImageUrl(value: String): Self = StObject.set(x, "bannerImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerImageUrlNull: Self = StObject.set(x, "bannerImageUrl", null)
    
    inline def setBannerImageUrlUndefined: Self = StObject.set(x, "bannerImageUrl", js.undefined)
    
    inline def setBannerMobileExtraHdImageUrl(value: String): Self = StObject.set(x, "bannerMobileExtraHdImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerMobileExtraHdImageUrlNull: Self = StObject.set(x, "bannerMobileExtraHdImageUrl", null)
    
    inline def setBannerMobileExtraHdImageUrlUndefined: Self = StObject.set(x, "bannerMobileExtraHdImageUrl", js.undefined)
    
    inline def setBannerMobileHdImageUrl(value: String): Self = StObject.set(x, "bannerMobileHdImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerMobileHdImageUrlNull: Self = StObject.set(x, "bannerMobileHdImageUrl", null)
    
    inline def setBannerMobileHdImageUrlUndefined: Self = StObject.set(x, "bannerMobileHdImageUrl", js.undefined)
    
    inline def setBannerMobileImageUrl(value: String): Self = StObject.set(x, "bannerMobileImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerMobileImageUrlNull: Self = StObject.set(x, "bannerMobileImageUrl", null)
    
    inline def setBannerMobileImageUrlUndefined: Self = StObject.set(x, "bannerMobileImageUrl", js.undefined)
    
    inline def setBannerMobileLowImageUrl(value: String): Self = StObject.set(x, "bannerMobileLowImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerMobileLowImageUrlNull: Self = StObject.set(x, "bannerMobileLowImageUrl", null)
    
    inline def setBannerMobileLowImageUrlUndefined: Self = StObject.set(x, "bannerMobileLowImageUrl", js.undefined)
    
    inline def setBannerMobileMediumHdImageUrl(value: String): Self = StObject.set(x, "bannerMobileMediumHdImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerMobileMediumHdImageUrlNull: Self = StObject.set(x, "bannerMobileMediumHdImageUrl", null)
    
    inline def setBannerMobileMediumHdImageUrlUndefined: Self = StObject.set(x, "bannerMobileMediumHdImageUrl", js.undefined)
    
    inline def setBannerTabletExtraHdImageUrl(value: String): Self = StObject.set(x, "bannerTabletExtraHdImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTabletExtraHdImageUrlNull: Self = StObject.set(x, "bannerTabletExtraHdImageUrl", null)
    
    inline def setBannerTabletExtraHdImageUrlUndefined: Self = StObject.set(x, "bannerTabletExtraHdImageUrl", js.undefined)
    
    inline def setBannerTabletHdImageUrl(value: String): Self = StObject.set(x, "bannerTabletHdImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTabletHdImageUrlNull: Self = StObject.set(x, "bannerTabletHdImageUrl", null)
    
    inline def setBannerTabletHdImageUrlUndefined: Self = StObject.set(x, "bannerTabletHdImageUrl", js.undefined)
    
    inline def setBannerTabletImageUrl(value: String): Self = StObject.set(x, "bannerTabletImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTabletImageUrlNull: Self = StObject.set(x, "bannerTabletImageUrl", null)
    
    inline def setBannerTabletImageUrlUndefined: Self = StObject.set(x, "bannerTabletImageUrl", js.undefined)
    
    inline def setBannerTabletLowImageUrl(value: String): Self = StObject.set(x, "bannerTabletLowImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTabletLowImageUrlNull: Self = StObject.set(x, "bannerTabletLowImageUrl", null)
    
    inline def setBannerTabletLowImageUrlUndefined: Self = StObject.set(x, "bannerTabletLowImageUrl", js.undefined)
    
    inline def setBannerTvHighImageUrl(value: String): Self = StObject.set(x, "bannerTvHighImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTvHighImageUrlNull: Self = StObject.set(x, "bannerTvHighImageUrl", null)
    
    inline def setBannerTvHighImageUrlUndefined: Self = StObject.set(x, "bannerTvHighImageUrl", js.undefined)
    
    inline def setBannerTvImageUrl(value: String): Self = StObject.set(x, "bannerTvImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTvImageUrlNull: Self = StObject.set(x, "bannerTvImageUrl", null)
    
    inline def setBannerTvImageUrlUndefined: Self = StObject.set(x, "bannerTvImageUrl", js.undefined)
    
    inline def setBannerTvLowImageUrl(value: String): Self = StObject.set(x, "bannerTvLowImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTvLowImageUrlNull: Self = StObject.set(x, "bannerTvLowImageUrl", null)
    
    inline def setBannerTvLowImageUrlUndefined: Self = StObject.set(x, "bannerTvLowImageUrl", js.undefined)
    
    inline def setBannerTvMediumImageUrl(value: String): Self = StObject.set(x, "bannerTvMediumImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerTvMediumImageUrlNull: Self = StObject.set(x, "bannerTvMediumImageUrl", null)
    
    inline def setBannerTvMediumImageUrlUndefined: Self = StObject.set(x, "bannerTvMediumImageUrl", js.undefined)
    
    inline def setLargeBrandedBannerImageImapScript(value: SchemaLocalizedProperty): Self = StObject.set(x, "largeBrandedBannerImageImapScript", value.asInstanceOf[js.Any])
    
    inline def setLargeBrandedBannerImageImapScriptUndefined: Self = StObject.set(x, "largeBrandedBannerImageImapScript", js.undefined)
    
    inline def setLargeBrandedBannerImageUrl(value: SchemaLocalizedProperty): Self = StObject.set(x, "largeBrandedBannerImageUrl", value.asInstanceOf[js.Any])
    
    inline def setLargeBrandedBannerImageUrlUndefined: Self = StObject.set(x, "largeBrandedBannerImageUrl", js.undefined)
    
    inline def setSmallBrandedBannerImageImapScript(value: SchemaLocalizedProperty): Self = StObject.set(x, "smallBrandedBannerImageImapScript", value.asInstanceOf[js.Any])
    
    inline def setSmallBrandedBannerImageImapScriptUndefined: Self = StObject.set(x, "smallBrandedBannerImageImapScript", js.undefined)
    
    inline def setSmallBrandedBannerImageUrl(value: SchemaLocalizedProperty): Self = StObject.set(x, "smallBrandedBannerImageUrl", value.asInstanceOf[js.Any])
    
    inline def setSmallBrandedBannerImageUrlUndefined: Self = StObject.set(x, "smallBrandedBannerImageUrl", js.undefined)
    
    inline def setTrackingImageUrl(value: String): Self = StObject.set(x, "trackingImageUrl", value.asInstanceOf[js.Any])
    
    inline def setTrackingImageUrlNull: Self = StObject.set(x, "trackingImageUrl", null)
    
    inline def setTrackingImageUrlUndefined: Self = StObject.set(x, "trackingImageUrl", js.undefined)
    
    inline def setWatchIconImageUrl(value: String): Self = StObject.set(x, "watchIconImageUrl", value.asInstanceOf[js.Any])
    
    inline def setWatchIconImageUrlNull: Self = StObject.set(x, "watchIconImageUrl", null)
    
    inline def setWatchIconImageUrlUndefined: Self = StObject.set(x, "watchIconImageUrl", js.undefined)
  }
}
