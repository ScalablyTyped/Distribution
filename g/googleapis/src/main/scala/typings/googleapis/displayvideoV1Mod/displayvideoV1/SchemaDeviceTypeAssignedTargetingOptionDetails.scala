package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceTypeAssignedTargetingOptionDetails extends StObject {
  
  /**
    * The display name of the device type. Output only in v1. Required in v2.
    */
  var deviceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. ID of the device type.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceTypeAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaDeviceTypeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceTypeAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaDeviceTypeAssignedTargetingOptionDetails](x: Self) {
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeNull: Self = StObject.set(x, "deviceType", null)
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
