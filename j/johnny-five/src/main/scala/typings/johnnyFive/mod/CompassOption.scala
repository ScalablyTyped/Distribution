package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompassOption extends StObject {
  
  var board: js.UndefOr[Board] = js.undefined
  
  var controller: String
  
  var gauss: js.UndefOr[Double] = js.undefined
}
object CompassOption {
  
  inline def apply(controller: String): CompassOption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompassOption] (val x: Self) extends AnyVal {
    
    inline def setBoard(value: Board): Self = StObject.set(x, "board", value.asInstanceOf[js.Any])
    
    inline def setBoardUndefined: Self = StObject.set(x, "board", js.undefined)
    
    inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setGauss(value: Double): Self = StObject.set(x, "gauss", value.asInstanceOf[js.Any])
    
    inline def setGaussUndefined: Self = StObject.set(x, "gauss", js.undefined)
  }
}
