package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersTargetingtypesAssignedtargetingoptionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAssignedTargetingOption] = js.undefined
  
  /**
    * Required. Identifies the type of this assigned targeting option. Supported targeting types: * `TARGETING_TYPE_CHANNEL` * `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION` * `TARGETING_TYPE_OMID` * `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION`
    */
  var targetingType: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersTargetingtypesAssignedtargetingoptionsCreate {
  
  inline def apply(): ParamsResourceAdvertisersTargetingtypesAssignedtargetingoptionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersTargetingtypesAssignedtargetingoptionsCreate]
  }
  
  extension [Self <: ParamsResourceAdvertisersTargetingtypesAssignedtargetingoptionsCreate](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setRequestBody(value: SchemaAssignedTargetingOption): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    inline def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
  }
}
