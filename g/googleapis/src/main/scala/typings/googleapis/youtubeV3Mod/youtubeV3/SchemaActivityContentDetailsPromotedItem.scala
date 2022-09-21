package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActivityContentDetailsPromotedItem extends StObject {
  
  /**
    * The URL the client should fetch to request a promoted item.
    */
  var adTag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL the client should ping to indicate that the user clicked through on this promoted item.
    */
  var clickTrackingUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL the client should ping to indicate that the user was shown this promoted item.
    */
  var creativeViewUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of call-to-action, a message to the user indicating action that can be taken.
    */
  var ctaType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The custom call-to-action button text. If specified, it will override the default button text for the cta_type.
    */
  var customCtaButtonText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The text description to accompany the promoted item.
    */
  var descriptionText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL the client should direct the user to, if the user chooses to visit the advertiser's website.
    */
  var destinationUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of forecasting URLs. The client should ping all of these URLs when a promoted item is not available, to indicate that a promoted item could have been shown.
    */
  var forecastingUrl: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The list of impression URLs. The client should ping all of these URLs to indicate that the user was shown this promoted item.
    */
  var impressionUrl: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the promoted video.
    */
  var videoId: js.UndefOr[String | Null] = js.undefined
}
object SchemaActivityContentDetailsPromotedItem {
  
  inline def apply(): SchemaActivityContentDetailsPromotedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsPromotedItem]
  }
  
  extension [Self <: SchemaActivityContentDetailsPromotedItem](x: Self) {
    
    inline def setAdTag(value: String): Self = StObject.set(x, "adTag", value.asInstanceOf[js.Any])
    
    inline def setAdTagNull: Self = StObject.set(x, "adTag", null)
    
    inline def setAdTagUndefined: Self = StObject.set(x, "adTag", js.undefined)
    
    inline def setClickTrackingUrl(value: String): Self = StObject.set(x, "clickTrackingUrl", value.asInstanceOf[js.Any])
    
    inline def setClickTrackingUrlNull: Self = StObject.set(x, "clickTrackingUrl", null)
    
    inline def setClickTrackingUrlUndefined: Self = StObject.set(x, "clickTrackingUrl", js.undefined)
    
    inline def setCreativeViewUrl(value: String): Self = StObject.set(x, "creativeViewUrl", value.asInstanceOf[js.Any])
    
    inline def setCreativeViewUrlNull: Self = StObject.set(x, "creativeViewUrl", null)
    
    inline def setCreativeViewUrlUndefined: Self = StObject.set(x, "creativeViewUrl", js.undefined)
    
    inline def setCtaType(value: String): Self = StObject.set(x, "ctaType", value.asInstanceOf[js.Any])
    
    inline def setCtaTypeNull: Self = StObject.set(x, "ctaType", null)
    
    inline def setCtaTypeUndefined: Self = StObject.set(x, "ctaType", js.undefined)
    
    inline def setCustomCtaButtonText(value: String): Self = StObject.set(x, "customCtaButtonText", value.asInstanceOf[js.Any])
    
    inline def setCustomCtaButtonTextNull: Self = StObject.set(x, "customCtaButtonText", null)
    
    inline def setCustomCtaButtonTextUndefined: Self = StObject.set(x, "customCtaButtonText", js.undefined)
    
    inline def setDescriptionText(value: String): Self = StObject.set(x, "descriptionText", value.asInstanceOf[js.Any])
    
    inline def setDescriptionTextNull: Self = StObject.set(x, "descriptionText", null)
    
    inline def setDescriptionTextUndefined: Self = StObject.set(x, "descriptionText", js.undefined)
    
    inline def setDestinationUrl(value: String): Self = StObject.set(x, "destinationUrl", value.asInstanceOf[js.Any])
    
    inline def setDestinationUrlNull: Self = StObject.set(x, "destinationUrl", null)
    
    inline def setDestinationUrlUndefined: Self = StObject.set(x, "destinationUrl", js.undefined)
    
    inline def setForecastingUrl(value: js.Array[String]): Self = StObject.set(x, "forecastingUrl", value.asInstanceOf[js.Any])
    
    inline def setForecastingUrlNull: Self = StObject.set(x, "forecastingUrl", null)
    
    inline def setForecastingUrlUndefined: Self = StObject.set(x, "forecastingUrl", js.undefined)
    
    inline def setForecastingUrlVarargs(value: String*): Self = StObject.set(x, "forecastingUrl", js.Array(value*))
    
    inline def setImpressionUrl(value: js.Array[String]): Self = StObject.set(x, "impressionUrl", value.asInstanceOf[js.Any])
    
    inline def setImpressionUrlNull: Self = StObject.set(x, "impressionUrl", null)
    
    inline def setImpressionUrlUndefined: Self = StObject.set(x, "impressionUrl", js.undefined)
    
    inline def setImpressionUrlVarargs(value: String*): Self = StObject.set(x, "impressionUrl", js.Array(value*))
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdNull: Self = StObject.set(x, "videoId", null)
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
