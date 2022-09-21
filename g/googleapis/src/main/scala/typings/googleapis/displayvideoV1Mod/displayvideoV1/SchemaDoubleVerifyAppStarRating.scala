package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoubleVerifyAppStarRating extends StObject {
  
  /**
    * Avoid bidding on apps with insufficient star ratings.
    */
  var avoidInsufficientStarRating: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Avoid bidding on apps with the star ratings.
    */
  var avoidedStarRating: js.UndefOr[String | Null] = js.undefined
}
object SchemaDoubleVerifyAppStarRating {
  
  inline def apply(): SchemaDoubleVerifyAppStarRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleVerifyAppStarRating]
  }
  
  extension [Self <: SchemaDoubleVerifyAppStarRating](x: Self) {
    
    inline def setAvoidInsufficientStarRating(value: Boolean): Self = StObject.set(x, "avoidInsufficientStarRating", value.asInstanceOf[js.Any])
    
    inline def setAvoidInsufficientStarRatingNull: Self = StObject.set(x, "avoidInsufficientStarRating", null)
    
    inline def setAvoidInsufficientStarRatingUndefined: Self = StObject.set(x, "avoidInsufficientStarRating", js.undefined)
    
    inline def setAvoidedStarRating(value: String): Self = StObject.set(x, "avoidedStarRating", value.asInstanceOf[js.Any])
    
    inline def setAvoidedStarRatingNull: Self = StObject.set(x, "avoidedStarRating", null)
    
    inline def setAvoidedStarRatingUndefined: Self = StObject.set(x, "avoidedStarRating", js.undefined)
  }
}
