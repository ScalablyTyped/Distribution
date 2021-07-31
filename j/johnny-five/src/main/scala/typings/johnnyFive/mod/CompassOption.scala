package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompassOption extends StObject {
  
  var controller: String
  
  var gauss: js.UndefOr[Double] = js.undefined
}
object CompassOption {
  
  @scala.inline
  def apply(controller: String): CompassOption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassOption]
  }
  
  @scala.inline
  implicit class CompassOptionMutableBuilder[Self <: CompassOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGauss(value: Double): Self = StObject.set(x, "gauss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaussUndefined: Self = StObject.set(x, "gauss", js.undefined)
  }
}
