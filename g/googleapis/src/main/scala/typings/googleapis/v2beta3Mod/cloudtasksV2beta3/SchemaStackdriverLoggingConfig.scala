package typings.googleapis.v2beta3Mod.cloudtasksV2beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStackdriverLoggingConfig extends StObject {
  
  /**
    * Specifies the fraction of operations to write to [Stackdriver Logging](https://cloud.google.com/logging/docs/). This field may contain any value between 0.0 and 1.0, inclusive. 0.0 is the default and means that no operations are logged.
    */
  var samplingRatio: js.UndefOr[Double | Null] = js.undefined
}
object SchemaStackdriverLoggingConfig {
  
  inline def apply(): SchemaStackdriverLoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackdriverLoggingConfig]
  }
  
  extension [Self <: SchemaStackdriverLoggingConfig](x: Self) {
    
    inline def setSamplingRatio(value: Double): Self = StObject.set(x, "samplingRatio", value.asInstanceOf[js.Any])
    
    inline def setSamplingRatioNull: Self = StObject.set(x, "samplingRatio", null)
    
    inline def setSamplingRatioUndefined: Self = StObject.set(x, "samplingRatio", js.undefined)
  }
}
