package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Branding properties for images associated with the channel.
  */
@js.native
trait SchemaImageSettings extends js.Object {
  
  /**
    * The URL for the background image shown on the video watch page. The image
    * should be 1200px by 615px, with a maximum file size of 128k.
    */
  var backgroundImageUrl: js.UndefOr[SchemaLocalizedProperty] = js.native
  
  /**
    * This is used only in update requests; if it&#39;s set, we use this URL to
    * generate all of the above banner URLs.
    */
  var bannerExternalUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. Desktop size (1060x175).
    */
  var bannerImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. Mobile size high resolution (1440x395).
    */
  var bannerMobileExtraHdImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. Mobile size high resolution (1280x360).
    */
  var bannerMobileHdImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. Mobile size (640x175).
    */
  var bannerMobileImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. Mobile size low resolution (320x88).
    */
  var bannerMobileLowImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. Mobile size medium/high resolution (960x263).
    */
  var bannerMobileMediumHdImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. Tablet size extra high resolution (2560x424).
    */
  var bannerTabletExtraHdImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. Tablet size high resolution (2276x377).
    */
  var bannerTabletHdImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. Tablet size (1707x283).
    */
  var bannerTabletImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. Tablet size low resolution (1138x188).
    */
  var bannerTabletLowImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. TV size high resolution (1920x1080).
    */
  var bannerTvHighImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. TV size extra high resolution (2120x1192).
    */
  var bannerTvImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. TV size low resolution (854x480).
    */
  var bannerTvLowImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Banner image. TV size medium resolution (1280x720).
    */
  var bannerTvMediumImageUrl: js.UndefOr[String] = js.native
  
  /**
    * The image map script for the large banner image.
    */
  var largeBrandedBannerImageImapScript: js.UndefOr[SchemaLocalizedProperty] = js.native
  
  /**
    * The URL for the 854px by 70px image that appears below the video player
    * in the expanded video view of the video watch page.
    */
  var largeBrandedBannerImageUrl: js.UndefOr[SchemaLocalizedProperty] = js.native
  
  /**
    * The image map script for the small banner image.
    */
  var smallBrandedBannerImageImapScript: js.UndefOr[SchemaLocalizedProperty] = js.native
  
  /**
    * The URL for the 640px by 70px banner image that appears below the video
    * player in the default view of the video watch page.
    */
  var smallBrandedBannerImageUrl: js.UndefOr[SchemaLocalizedProperty] = js.native
  
  /**
    * The URL for a 1px by 1px tracking pixel that can be used to collect
    * statistics for views of the channel or video pages.
    */
  var trackingImageUrl: js.UndefOr[String] = js.native
  
  /**
    * The URL for the image that appears above the top-left corner of the video
    * player. This is a 25-pixel-high image with a flexible width that cannot
    * exceed 170 pixels.
    */
  var watchIconImageUrl: js.UndefOr[String] = js.native
}
object SchemaImageSettings {
  
  @scala.inline
  def apply(): SchemaImageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageSettings]
  }
  
  @scala.inline
  implicit class SchemaImageSettingsOps[Self <: SchemaImageSettings] (val x: Self) extends AnyVal {
    
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
    def setBackgroundImageUrl(value: SchemaLocalizedProperty): Self = this.set("backgroundImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundImageUrl: Self = this.set("backgroundImageUrl", js.undefined)
    
    @scala.inline
    def setBannerExternalUrl(value: String): Self = this.set("bannerExternalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerExternalUrl: Self = this.set("bannerExternalUrl", js.undefined)
    
    @scala.inline
    def setBannerImageUrl(value: String): Self = this.set("bannerImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerImageUrl: Self = this.set("bannerImageUrl", js.undefined)
    
    @scala.inline
    def setBannerMobileExtraHdImageUrl(value: String): Self = this.set("bannerMobileExtraHdImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerMobileExtraHdImageUrl: Self = this.set("bannerMobileExtraHdImageUrl", js.undefined)
    
    @scala.inline
    def setBannerMobileHdImageUrl(value: String): Self = this.set("bannerMobileHdImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerMobileHdImageUrl: Self = this.set("bannerMobileHdImageUrl", js.undefined)
    
    @scala.inline
    def setBannerMobileImageUrl(value: String): Self = this.set("bannerMobileImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerMobileImageUrl: Self = this.set("bannerMobileImageUrl", js.undefined)
    
    @scala.inline
    def setBannerMobileLowImageUrl(value: String): Self = this.set("bannerMobileLowImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerMobileLowImageUrl: Self = this.set("bannerMobileLowImageUrl", js.undefined)
    
    @scala.inline
    def setBannerMobileMediumHdImageUrl(value: String): Self = this.set("bannerMobileMediumHdImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerMobileMediumHdImageUrl: Self = this.set("bannerMobileMediumHdImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTabletExtraHdImageUrl(value: String): Self = this.set("bannerTabletExtraHdImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTabletExtraHdImageUrl: Self = this.set("bannerTabletExtraHdImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTabletHdImageUrl(value: String): Self = this.set("bannerTabletHdImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTabletHdImageUrl: Self = this.set("bannerTabletHdImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTabletImageUrl(value: String): Self = this.set("bannerTabletImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTabletImageUrl: Self = this.set("bannerTabletImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTabletLowImageUrl(value: String): Self = this.set("bannerTabletLowImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTabletLowImageUrl: Self = this.set("bannerTabletLowImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTvHighImageUrl(value: String): Self = this.set("bannerTvHighImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTvHighImageUrl: Self = this.set("bannerTvHighImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTvImageUrl(value: String): Self = this.set("bannerTvImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTvImageUrl: Self = this.set("bannerTvImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTvLowImageUrl(value: String): Self = this.set("bannerTvLowImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTvLowImageUrl: Self = this.set("bannerTvLowImageUrl", js.undefined)
    
    @scala.inline
    def setBannerTvMediumImageUrl(value: String): Self = this.set("bannerTvMediumImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerTvMediumImageUrl: Self = this.set("bannerTvMediumImageUrl", js.undefined)
    
    @scala.inline
    def setLargeBrandedBannerImageImapScript(value: SchemaLocalizedProperty): Self = this.set("largeBrandedBannerImageImapScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeBrandedBannerImageImapScript: Self = this.set("largeBrandedBannerImageImapScript", js.undefined)
    
    @scala.inline
    def setLargeBrandedBannerImageUrl(value: SchemaLocalizedProperty): Self = this.set("largeBrandedBannerImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeBrandedBannerImageUrl: Self = this.set("largeBrandedBannerImageUrl", js.undefined)
    
    @scala.inline
    def setSmallBrandedBannerImageImapScript(value: SchemaLocalizedProperty): Self = this.set("smallBrandedBannerImageImapScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallBrandedBannerImageImapScript: Self = this.set("smallBrandedBannerImageImapScript", js.undefined)
    
    @scala.inline
    def setSmallBrandedBannerImageUrl(value: SchemaLocalizedProperty): Self = this.set("smallBrandedBannerImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallBrandedBannerImageUrl: Self = this.set("smallBrandedBannerImageUrl", js.undefined)
    
    @scala.inline
    def setTrackingImageUrl(value: String): Self = this.set("trackingImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingImageUrl: Self = this.set("trackingImageUrl", js.undefined)
    
    @scala.inline
    def setWatchIconImageUrl(value: String): Self = this.set("watchIconImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchIconImageUrl: Self = this.set("watchIconImageUrl", js.undefined)
  }
}
