package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRotation extends StObject {
  
  /**
    * Optional. Timestamp in UTC at which the Secret is scheduled to rotate. Cannot be set to less than 300s (5 min) in the future and at most 3153600000s (100 years). next_rotation_time MUST be set if rotation_period is set.
    */
  var nextRotationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years). If rotation_period is set, next_rotation_time must be set. next_rotation_time will be advanced by this period when the service automatically sends rotation notifications.
    */
  var rotationPeriod: js.UndefOr[String | Null] = js.undefined
}
object SchemaRotation {
  
  inline def apply(): SchemaRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRotation]
  }
  
  extension [Self <: SchemaRotation](x: Self) {
    
    inline def setNextRotationTime(value: String): Self = StObject.set(x, "nextRotationTime", value.asInstanceOf[js.Any])
    
    inline def setNextRotationTimeNull: Self = StObject.set(x, "nextRotationTime", null)
    
    inline def setNextRotationTimeUndefined: Self = StObject.set(x, "nextRotationTime", js.undefined)
    
    inline def setRotationPeriod(value: String): Self = StObject.set(x, "rotationPeriod", value.asInstanceOf[js.Any])
    
    inline def setRotationPeriodNull: Self = StObject.set(x, "rotationPeriod", null)
    
    inline def setRotationPeriodUndefined: Self = StObject.set(x, "rotationPeriod", js.undefined)
  }
}
