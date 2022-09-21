package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTargetingtypesTargetingoptionsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSearchTargetingOptionsRequest] = js.undefined
  
  /**
    * Required. The type of targeting options to retrieve. Accepted values are: * `TARGETING_TYPE_GEO_REGION` * `TARGETING_TYPE_POI` * `TARGETING_TYPE_BUSINESS_CHAIN`
    */
  var targetingType: js.UndefOr[String] = js.undefined
}
object ParamsResourceTargetingtypesTargetingoptionsSearch {
  
  inline def apply(): ParamsResourceTargetingtypesTargetingoptionsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargetingtypesTargetingoptionsSearch]
  }
  
  extension [Self <: ParamsResourceTargetingtypesTargetingoptionsSearch](x: Self) {
    
    inline def setRequestBody(value: SchemaSearchTargetingOptionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    inline def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
  }
}
