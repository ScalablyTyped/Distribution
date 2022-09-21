package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTestsInsert
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var externalChannelId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTestItem] = js.undefined
}
object ParamsResourceTestsInsert {
  
  inline def apply(): ParamsResourceTestsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTestsInsert]
  }
  
  extension [Self <: ParamsResourceTestsInsert](x: Self) {
    
    inline def setExternalChannelId(value: String): Self = StObject.set(x, "externalChannelId", value.asInstanceOf[js.Any])
    
    inline def setExternalChannelIdUndefined: Self = StObject.set(x, "externalChannelId", js.undefined)
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setRequestBody(value: SchemaTestItem): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
