package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accelerator extends StObject {
  
  /** The type of an accelator for a CDF instance. */
  var acceleratorType: js.UndefOr[String] = js.native
}
object Accelerator {
  
  @scala.inline
  def apply(): Accelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accelerator]
  }
  
  @scala.inline
  implicit class AcceleratorMutableBuilder[Self <: Accelerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
  }
}
