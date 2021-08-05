package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AcceleratorConfig represents a Hardware Accelerator request.
  */
trait SchemaAcceleratorConfig extends StObject {
  
  /**
    * The number of the accelerator cards exposed to an instance.
    */
  var acceleratorCount: js.UndefOr[String] = js.undefined
  
  /**
    * The accelerator type resource name. List of supported accelerators
    * [here](/compute/docs/gpus/#Introduction)
    */
  var acceleratorType: js.UndefOr[String] = js.undefined
}
object SchemaAcceleratorConfig {
  
  inline def apply(): SchemaAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorConfig]
  }
  
  extension [Self <: SchemaAcceleratorConfig](x: Self) {
    
    inline def setAcceleratorCount(value: String): Self = StObject.set(x, "acceleratorCount", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorCountUndefined: Self = StObject.set(x, "acceleratorCount", js.undefined)
    
    inline def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
  }
}
