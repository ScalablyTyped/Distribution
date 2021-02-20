package typings.maximMazurokGapiClientAdexchangebuyer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Advertiser extends StObject {
  
  var advertiser: js.UndefOr[String] = js.native
  
  /** The app icon, for app download ads. */
  var appIcon: js.UndefOr[Height] = js.native
  
  /** A long description of the ad. */
  var body: js.UndefOr[String] = js.native
  
  /** A label for the button that the user is supposed to click. */
  var callToAction: js.UndefOr[String] = js.native
  
  /** The URL that the browser/SDK will load when the user clicks the ad. */
  var clickLinkUrl: js.UndefOr[String] = js.native
  
  /** The URL to use for click tracking. */
  var clickTrackingUrl: js.UndefOr[String] = js.native
  
  /** A short title for the ad. */
  var headline: js.UndefOr[String] = js.native
  
  /** A large image. */
  var image: js.UndefOr[Height] = js.native
  
  /** The URLs are called when the impression is rendered. */
  var impressionTrackingUrl: js.UndefOr[js.Array[String]] = js.native
  
  /** A smaller image, for the advertiser logo. */
  var logo: js.UndefOr[Height] = js.native
  
  /** The price of the promoted app including the currency info. */
  var price: js.UndefOr[String] = js.native
  
  /** The app rating in the app store. Must be in the range [0-5]. */
  var starRating: js.UndefOr[Double] = js.native
  
  /** The URL of the XML VAST for a native ad. Note this is a separate field from resource.video_url. */
  var videoURL: js.UndefOr[String] = js.native
}
object Advertiser {
  
  @scala.inline
  def apply(): Advertiser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Advertiser]
  }
  
  @scala.inline
  implicit class AdvertiserMutableBuilder[Self <: Advertiser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiser(value: String): Self = StObject.set(x, "advertiser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserUndefined: Self = StObject.set(x, "advertiser", js.undefined)
    
    @scala.inline
    def setAppIcon(value: Height): Self = StObject.set(x, "appIcon", value.asInstanceOf[js.Any])
    
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
    def setImage(value: Height): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setImpressionTrackingUrl(value: js.Array[String]): Self = StObject.set(x, "impressionTrackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionTrackingUrlUndefined: Self = StObject.set(x, "impressionTrackingUrl", js.undefined)
    
    @scala.inline
    def setImpressionTrackingUrlVarargs(value: String*): Self = StObject.set(x, "impressionTrackingUrl", js.Array(value :_*))
    
    @scala.inline
    def setLogo(value: Height): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setStarRating(value: Double): Self = StObject.set(x, "starRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarRatingUndefined: Self = StObject.set(x, "starRating", js.undefined)
    
    @scala.inline
    def setVideoURL(value: String): Self = StObject.set(x, "videoURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoURLUndefined: Self = StObject.set(x, "videoURL", js.undefined)
  }
}
