package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoubleVerify extends StObject {
  
  /**
    * Avoid bidding on apps with the star ratings.
    */
  var appStarRating: js.UndefOr[SchemaDoubleVerifyAppStarRating] = js.undefined
  
  /**
    * Avoid bidding on apps with the age rating.
    */
  var avoidedAgeRatings: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * DV Brand Safety Controls.
    */
  var brandSafetyCategories: js.UndefOr[SchemaDoubleVerifyBrandSafetyCategories] = js.undefined
  
  /**
    * The custom segment ID provided by DoubleVerify. The ID must start with "51" and consist of eight digits. Custom segment ID cannot be specified along with any of the following fields: * brand_safety_categories * avoided_age_ratings * app_star_rating * fraud_invalid_traffic
    */
  var customSegmentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display viewability settings (applicable to display line items only).
    */
  var displayViewability: js.UndefOr[SchemaDoubleVerifyDisplayViewability] = js.undefined
  
  /**
    * Avoid Sites and Apps with historical Fraud & IVT Rates.
    */
  var fraudInvalidTraffic: js.UndefOr[SchemaDoubleVerifyFraudInvalidTraffic] = js.undefined
  
  /**
    * Video viewability settings (applicable to video line items only).
    */
  var videoViewability: js.UndefOr[SchemaDoubleVerifyVideoViewability] = js.undefined
}
object SchemaDoubleVerify {
  
  inline def apply(): SchemaDoubleVerify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleVerify]
  }
  
  extension [Self <: SchemaDoubleVerify](x: Self) {
    
    inline def setAppStarRating(value: SchemaDoubleVerifyAppStarRating): Self = StObject.set(x, "appStarRating", value.asInstanceOf[js.Any])
    
    inline def setAppStarRatingUndefined: Self = StObject.set(x, "appStarRating", js.undefined)
    
    inline def setAvoidedAgeRatings(value: js.Array[String]): Self = StObject.set(x, "avoidedAgeRatings", value.asInstanceOf[js.Any])
    
    inline def setAvoidedAgeRatingsNull: Self = StObject.set(x, "avoidedAgeRatings", null)
    
    inline def setAvoidedAgeRatingsUndefined: Self = StObject.set(x, "avoidedAgeRatings", js.undefined)
    
    inline def setAvoidedAgeRatingsVarargs(value: String*): Self = StObject.set(x, "avoidedAgeRatings", js.Array(value*))
    
    inline def setBrandSafetyCategories(value: SchemaDoubleVerifyBrandSafetyCategories): Self = StObject.set(x, "brandSafetyCategories", value.asInstanceOf[js.Any])
    
    inline def setBrandSafetyCategoriesUndefined: Self = StObject.set(x, "brandSafetyCategories", js.undefined)
    
    inline def setCustomSegmentId(value: String): Self = StObject.set(x, "customSegmentId", value.asInstanceOf[js.Any])
    
    inline def setCustomSegmentIdNull: Self = StObject.set(x, "customSegmentId", null)
    
    inline def setCustomSegmentIdUndefined: Self = StObject.set(x, "customSegmentId", js.undefined)
    
    inline def setDisplayViewability(value: SchemaDoubleVerifyDisplayViewability): Self = StObject.set(x, "displayViewability", value.asInstanceOf[js.Any])
    
    inline def setDisplayViewabilityUndefined: Self = StObject.set(x, "displayViewability", js.undefined)
    
    inline def setFraudInvalidTraffic(value: SchemaDoubleVerifyFraudInvalidTraffic): Self = StObject.set(x, "fraudInvalidTraffic", value.asInstanceOf[js.Any])
    
    inline def setFraudInvalidTrafficUndefined: Self = StObject.set(x, "fraudInvalidTraffic", js.undefined)
    
    inline def setVideoViewability(value: SchemaDoubleVerifyVideoViewability): Self = StObject.set(x, "videoViewability", value.asInstanceOf[js.Any])
    
    inline def setVideoViewabilityUndefined: Self = StObject.set(x, "videoViewability", js.undefined)
  }
}
