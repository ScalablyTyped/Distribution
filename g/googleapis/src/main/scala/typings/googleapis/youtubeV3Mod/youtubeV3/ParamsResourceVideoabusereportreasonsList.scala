package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVideoabusereportreasonsList
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var hl: js.UndefOr[String] = js.undefined
  
  /**
    * The *part* parameter specifies the videoCategory resource parts that the API response will include. Supported values are id and snippet.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceVideoabusereportreasonsList {
  
  inline def apply(): ParamsResourceVideoabusereportreasonsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVideoabusereportreasonsList]
  }
  
  extension [Self <: ParamsResourceVideoabusereportreasonsList](x: Self) {
    
    inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
  }
}
