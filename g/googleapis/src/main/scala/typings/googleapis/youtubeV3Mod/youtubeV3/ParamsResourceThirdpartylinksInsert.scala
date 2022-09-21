package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceThirdpartylinksInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Channel ID to which changes should be applied, for delegation.
    */
  var externalChannelId: js.UndefOr[String] = js.undefined
  
  /**
    * The *part* parameter specifies the thirdPartyLink resource parts that the API request and response will include. Supported values are linkingToken, status, and snippet.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaThirdPartyLink] = js.undefined
}
object ParamsResourceThirdpartylinksInsert {
  
  inline def apply(): ParamsResourceThirdpartylinksInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceThirdpartylinksInsert]
  }
  
  extension [Self <: ParamsResourceThirdpartylinksInsert](x: Self) {
    
    inline def setExternalChannelId(value: String): Self = StObject.set(x, "externalChannelId", value.asInstanceOf[js.Any])
    
    inline def setExternalChannelIdUndefined: Self = StObject.set(x, "externalChannelId", js.undefined)
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setRequestBody(value: SchemaThirdPartyLink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
