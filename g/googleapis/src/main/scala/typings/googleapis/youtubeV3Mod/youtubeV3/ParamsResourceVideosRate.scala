package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVideosRate
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var rating: js.UndefOr[String] = js.undefined
}
object ParamsResourceVideosRate {
  
  inline def apply(): ParamsResourceVideosRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVideosRate]
  }
  
  extension [Self <: ParamsResourceVideosRate](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
  }
}
