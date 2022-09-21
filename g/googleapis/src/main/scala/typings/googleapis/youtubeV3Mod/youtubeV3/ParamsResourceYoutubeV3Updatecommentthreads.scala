package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceYoutubeV3Updatecommentthreads
  extends StObject
     with StandardParameters {
  
  /**
    * The *part* parameter specifies a comma-separated list of commentThread resource properties that the API response will include. You must at least include the snippet part in the parameter value since that part contains all of the properties that the API request can update.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCommentThread] = js.undefined
}
object ParamsResourceYoutubeV3Updatecommentthreads {
  
  inline def apply(): ParamsResourceYoutubeV3Updatecommentthreads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceYoutubeV3Updatecommentthreads]
  }
  
  extension [Self <: ParamsResourceYoutubeV3Updatecommentthreads](x: Self) {
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setRequestBody(value: SchemaCommentThread): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
