package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceleratorConfig extends StObject {
  
  /** The number of the accelerator cards exposed to an instance. */
  var acceleratorCount: js.UndefOr[String] = js.undefined
  
  /** The accelerator type resource name. List of supported accelerators [here](https://cloud.google.com/compute/docs/gpus) */
  var acceleratorType: js.UndefOr[String] = js.undefined
}
object AcceleratorConfig {
  
  @scala.inline
  def apply(): AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorConfig]
  }
  
  @scala.inline
  implicit class AcceleratorConfigMutableBuilder[Self <: AcceleratorConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorCount(value: String): Self = StObject.set(x, "acceleratorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorCountUndefined: Self = StObject.set(x, "acceleratorCount", js.undefined)
    
    @scala.inline
    def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
  }
}
