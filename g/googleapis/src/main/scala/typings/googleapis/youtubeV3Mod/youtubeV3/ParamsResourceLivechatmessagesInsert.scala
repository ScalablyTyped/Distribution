package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLivechatmessagesInsert
  extends StObject
     with StandardParameters {
  
  /**
    * The *part* parameter serves two purposes. It identifies the properties that the write operation will set as well as the properties that the API response will include. Set the parameter value to snippet.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLiveChatMessage] = js.undefined
}
object ParamsResourceLivechatmessagesInsert {
  
  inline def apply(): ParamsResourceLivechatmessagesInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLivechatmessagesInsert]
  }
  
  extension [Self <: ParamsResourceLivechatmessagesInsert](x: Self) {
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setRequestBody(value: SchemaLiveChatMessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
