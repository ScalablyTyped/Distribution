package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVideocategoriesList
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var hl: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the video categories with the given IDs for Stubby or Apiary.
    */
  var id: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The *part* parameter specifies the videoCategory resource properties that the API response will include. Set the parameter value to snippet.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    *
    */
  var regionCode: js.UndefOr[String] = js.undefined
}
object ParamsResourceVideocategoriesList {
  
  inline def apply(): ParamsResourceVideocategoriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVideocategoriesList]
  }
  
  extension [Self <: ParamsResourceVideocategoriesList](x: Self) {
    
    inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    inline def setId(value: js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
