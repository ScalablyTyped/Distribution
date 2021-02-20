package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccelerometerOption extends StObject {
  
  var controller: String = js.native
}
object AccelerometerOption {
  
  @scala.inline
  def apply(controller: String): AccelerometerOption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerOption]
  }
  
  @scala.inline
  implicit class AccelerometerOptionMutableBuilder[Self <: AccelerometerOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
  }
}
