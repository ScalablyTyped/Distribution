package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCommentsMarkasspam
  extends StObject
     with StandardParameters {
  
  /**
    * Flags the comments with the given IDs as spam in the caller's opinion.
    */
  var id: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceCommentsMarkasspam {
  
  inline def apply(): ParamsResourceCommentsMarkasspam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsMarkasspam]
  }
  
  extension [Self <: ParamsResourceCommentsMarkasspam](x: Self) {
    
    inline def setId(value: js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value*))
  }
}
