package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceI18nregionsList
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var hl: js.UndefOr[String] = js.undefined
  
  /**
    * The *part* parameter specifies the i18nRegion resource properties that the API response will include. Set the parameter value to snippet.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceI18nregionsList {
  
  inline def apply(): ParamsResourceI18nregionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceI18nregionsList]
  }
  
  extension [Self <: ParamsResourceI18nregionsList](x: Self) {
    
    inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
  }
}
