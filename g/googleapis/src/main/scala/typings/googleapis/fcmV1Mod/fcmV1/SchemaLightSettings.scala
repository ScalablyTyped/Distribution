package typings.googleapis.fcmV1Mod.fcmV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLightSettings extends StObject {
  
  /**
    * Required. Set `color` of the LED with [google.type.Color](https://github.com/googleapis/googleapis/blob/master/google/type/color.proto).
    */
  var color: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * Required. Along with `light_on_duration `, define the blink rate of LED flashes. Resolution defined by [proto.Duration](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration)
    */
  var lightOffDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Along with `light_off_duration`, define the blink rate of LED flashes. Resolution defined by [proto.Duration](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration)
    */
  var lightOnDuration: js.UndefOr[String | Null] = js.undefined
}
object SchemaLightSettings {
  
  inline def apply(): SchemaLightSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLightSettings]
  }
  
  extension [Self <: SchemaLightSettings](x: Self) {
    
    inline def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLightOffDuration(value: String): Self = StObject.set(x, "lightOffDuration", value.asInstanceOf[js.Any])
    
    inline def setLightOffDurationNull: Self = StObject.set(x, "lightOffDuration", null)
    
    inline def setLightOffDurationUndefined: Self = StObject.set(x, "lightOffDuration", js.undefined)
    
    inline def setLightOnDuration(value: String): Self = StObject.set(x, "lightOnDuration", value.asInstanceOf[js.Any])
    
    inline def setLightOnDurationNull: Self = StObject.set(x, "lightOnDuration", null)
    
    inline def setLightOnDurationUndefined: Self = StObject.set(x, "lightOnDuration", js.undefined)
  }
}
