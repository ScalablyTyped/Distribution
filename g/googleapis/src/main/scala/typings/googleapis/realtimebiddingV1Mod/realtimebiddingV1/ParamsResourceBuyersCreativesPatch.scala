package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersCreativesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. Name of the creative. Follows the pattern `buyers/{buyer\}/creatives/{creative\}`, where `{buyer\}` represents the account ID of the buyer who owns the creative, and `{creative\}` is the buyer-specific creative ID that references this creative in the bid response.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCreative] = js.undefined
  
  /**
    * Field mask to use for partial in-place updates.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersCreativesPatch {
  
  inline def apply(): ParamsResourceBuyersCreativesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersCreativesPatch]
  }
  
  extension [Self <: ParamsResourceBuyersCreativesPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaCreative): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
