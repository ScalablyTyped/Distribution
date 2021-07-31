package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Native content for a creative.
  */
trait SchemaNativeContent extends StObject {
  
  /**
    * The name of the advertiser or sponsor, to be displayed in the ad
    * creative.
    */
  var advertiserName: js.UndefOr[String] = js.undefined
  
  /**
    * The app icon, for app download ads.
    */
  var appIcon: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * A long description of the ad.
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * A label for the button that the user is supposed to click.
    */
  var callToAction: js.UndefOr[String] = js.undefined
  
  /**
    * The URL that the browser/SDK will load when the user clicks the ad.
    */
  var clickLinkUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to use for click tracking.
    */
  var clickTrackingUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A short title for the ad.
    */
  var headline: js.UndefOr[String] = js.undefined
  
  /**
    * A large image.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * A smaller image, for the advertiser&#39;s logo.
    */
  var logo: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * The price of the promoted app including currency info.
    */
  var priceDisplayText: js.UndefOr[String] = js.undefined
  
  /**
    * The app rating in the app store. Must be in the range [0-5].
    */
  var starRating: js.UndefOr[Double] = js.undefined
  
  /**
    * The URL to the app store to purchase/download the promoted app.
    */
  var storeUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to fetch a native video ad.
    */
  var videoUrl: js.UndefOr[String] = js.undefined
}
object SchemaNativeContent {
  
  @scala.inline
  def apply(): SchemaNativeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNativeContent]
  }
  
  @scala.inline
  implicit class SchemaNativeContentMutableBuilder[Self <: SchemaNativeContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserName(value: String): Self = StObject.set(x, "advertiserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserNameUndefined: Self = StObject.set(x, "advertiserName", js.undefined)
    
    @scala.inline
    def setAppIcon(value: SchemaImage): Self = StObject.set(x, "appIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIconUndefined: Self = StObject.set(x, "appIcon", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCallToAction(value: String): Self = StObject.set(x, "callToAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallToActionUndefined: Self = StObject.set(x, "callToAction", js.undefined)
    
    @scala.inline
    def setClickLinkUrl(value: String): Self = StObject.set(x, "clickLinkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickLinkUrlUndefined: Self = StObject.set(x, "clickLinkUrl", js.undefined)
    
    @scala.inline
    def setClickTrackingUrl(value: String): Self = StObject.set(x, "clickTrackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickTrackingUrlUndefined: Self = StObject.set(x, "clickTrackingUrl", js.undefined)
    
    @scala.inline
    def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    @scala.inline
    def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLogo(value: SchemaImage): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setPriceDisplayText(value: String): Self = StObject.set(x, "priceDisplayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceDisplayTextUndefined: Self = StObject.set(x, "priceDisplayText", js.undefined)
    
    @scala.inline
    def setStarRating(value: Double): Self = StObject.set(x, "starRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarRatingUndefined: Self = StObject.set(x, "starRating", js.undefined)
    
    @scala.inline
    def setStoreUrl(value: String): Self = StObject.set(x, "storeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUrlUndefined: Self = StObject.set(x, "storeUrl", js.undefined)
    
    @scala.inline
    def setVideoUrl(value: String): Self = StObject.set(x, "videoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUrlUndefined: Self = StObject.set(x, "videoUrl", js.undefined)
  }
}
