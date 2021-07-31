package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceAspectRating extends StObject {
  
  var rating: Double
  
  var `type`: String
}
object PlaceAspectRating {
  
  @scala.inline
  def apply(rating: Double, `type`: String): PlaceAspectRating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceAspectRating]
  }
  
  @scala.inline
  implicit class PlaceAspectRatingMutableBuilder[Self <: PlaceAspectRating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
