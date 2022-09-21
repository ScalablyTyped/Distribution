package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNativeContent extends StObject {
  
  /**
    * The name of the advertiser or sponsor, to be displayed in the ad creative.
    */
  var advertiserName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The app icon, for app download ads.
    */
  var appIcon: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * A long description of the ad.
    */
  var body: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A label for the button that the user is supposed to click.
    */
  var callToAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL that the browser/SDK will load when the user clicks the ad.
    */
  var clickLinkUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL to use for click tracking.
    */
  var clickTrackingUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A short title for the ad.
    */
  var headline: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A large image.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * A smaller image, for the advertiser's logo.
    */
  var logo: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * The price of the promoted app including currency info.
    */
  var priceDisplayText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The app rating in the app store. Must be in the range [0-5].
    */
  var starRating: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The URL to fetch a native video ad.
    */
  var videoUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The contents of a VAST document for a native video ad.
    */
  var videoVastXml: js.UndefOr[String | Null] = js.undefined
}
object SchemaNativeContent {
  
  inline def apply(): SchemaNativeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNativeContent]
  }
  
  extension [Self <: SchemaNativeContent](x: Self) {
    
    inline def setAdvertiserName(value: String): Self = StObject.set(x, "advertiserName", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserNameNull: Self = StObject.set(x, "advertiserName", null)
    
    inline def setAdvertiserNameUndefined: Self = StObject.set(x, "advertiserName", js.undefined)
    
    inline def setAppIcon(value: SchemaImage): Self = StObject.set(x, "appIcon", value.asInstanceOf[js.Any])
    
    inline def setAppIconUndefined: Self = StObject.set(x, "appIcon", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCallToAction(value: String): Self = StObject.set(x, "callToAction", value.asInstanceOf[js.Any])
    
    inline def setCallToActionNull: Self = StObject.set(x, "callToAction", null)
    
    inline def setCallToActionUndefined: Self = StObject.set(x, "callToAction", js.undefined)
    
    inline def setClickLinkUrl(value: String): Self = StObject.set(x, "clickLinkUrl", value.asInstanceOf[js.Any])
    
    inline def setClickLinkUrlNull: Self = StObject.set(x, "clickLinkUrl", null)
    
    inline def setClickLinkUrlUndefined: Self = StObject.set(x, "clickLinkUrl", js.undefined)
    
    inline def setClickTrackingUrl(value: String): Self = StObject.set(x, "clickTrackingUrl", value.asInstanceOf[js.Any])
    
    inline def setClickTrackingUrlNull: Self = StObject.set(x, "clickTrackingUrl", null)
    
    inline def setClickTrackingUrlUndefined: Self = StObject.set(x, "clickTrackingUrl", js.undefined)
    
    inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    inline def setHeadlineNull: Self = StObject.set(x, "headline", null)
    
    inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLogo(value: SchemaImage): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setPriceDisplayText(value: String): Self = StObject.set(x, "priceDisplayText", value.asInstanceOf[js.Any])
    
    inline def setPriceDisplayTextNull: Self = StObject.set(x, "priceDisplayText", null)
    
    inline def setPriceDisplayTextUndefined: Self = StObject.set(x, "priceDisplayText", js.undefined)
    
    inline def setStarRating(value: Double): Self = StObject.set(x, "starRating", value.asInstanceOf[js.Any])
    
    inline def setStarRatingNull: Self = StObject.set(x, "starRating", null)
    
    inline def setStarRatingUndefined: Self = StObject.set(x, "starRating", js.undefined)
    
    inline def setVideoUrl(value: String): Self = StObject.set(x, "videoUrl", value.asInstanceOf[js.Any])
    
    inline def setVideoUrlNull: Self = StObject.set(x, "videoUrl", null)
    
    inline def setVideoUrlUndefined: Self = StObject.set(x, "videoUrl", js.undefined)
    
    inline def setVideoVastXml(value: String): Self = StObject.set(x, "videoVastXml", value.asInstanceOf[js.Any])
    
    inline def setVideoVastXmlNull: Self = StObject.set(x, "videoVastXml", null)
    
    inline def setVideoVastXmlUndefined: Self = StObject.set(x, "videoVastXml", js.undefined)
  }
}
