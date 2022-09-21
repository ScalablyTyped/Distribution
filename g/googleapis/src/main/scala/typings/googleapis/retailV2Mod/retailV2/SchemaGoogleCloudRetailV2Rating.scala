package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2Rating extends StObject {
  
  /**
    * The average rating of the Product. The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var averageRating: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of ratings. This value is independent of the value of rating_histogram. This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var ratingCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
    */
  var ratingHistogram: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2Rating {
  
  inline def apply(): SchemaGoogleCloudRetailV2Rating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2Rating]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2Rating](x: Self) {
    
    inline def setAverageRating(value: Double): Self = StObject.set(x, "averageRating", value.asInstanceOf[js.Any])
    
    inline def setAverageRatingNull: Self = StObject.set(x, "averageRating", null)
    
    inline def setAverageRatingUndefined: Self = StObject.set(x, "averageRating", js.undefined)
    
    inline def setRatingCount(value: Double): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
    
    inline def setRatingCountNull: Self = StObject.set(x, "ratingCount", null)
    
    inline def setRatingCountUndefined: Self = StObject.set(x, "ratingCount", js.undefined)
    
    inline def setRatingHistogram(value: js.Array[Double]): Self = StObject.set(x, "ratingHistogram", value.asInstanceOf[js.Any])
    
    inline def setRatingHistogramNull: Self = StObject.set(x, "ratingHistogram", null)
    
    inline def setRatingHistogramUndefined: Self = StObject.set(x, "ratingHistogram", js.undefined)
    
    inline def setRatingHistogramVarargs(value: Double*): Self = StObject.set(x, "ratingHistogram", js.Array(value*))
  }
}
