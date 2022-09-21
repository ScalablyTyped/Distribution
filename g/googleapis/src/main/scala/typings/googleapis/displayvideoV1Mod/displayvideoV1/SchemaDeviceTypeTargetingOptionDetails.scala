package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceTypeTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The device type that is used to be targeted.
    */
  var deviceType: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceTypeTargetingOptionDetails {
  
  inline def apply(): SchemaDeviceTypeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceTypeTargetingOptionDetails]
  }
  
  extension [Self <: SchemaDeviceTypeTargetingOptionDetails](x: Self) {
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeNull: Self = StObject.set(x, "deviceType", null)
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
  }
}
