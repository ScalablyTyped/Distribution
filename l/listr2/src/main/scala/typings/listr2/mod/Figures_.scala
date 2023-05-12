package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Figures_ extends StObject {
  
  var arrowDown: String
  
  var arrowLeft: String
  
  var arrowRight: String
  
  var checkboxOn: String
  
  var cross: String
  
  var pointer: String
  
  var pointerSmall: String
  
  var squareSmallFilled: String
  
  var tick: String
  
  var warning: String
}
object Figures_ {
  
  inline def apply(
    arrowDown: String,
    arrowLeft: String,
    arrowRight: String,
    checkboxOn: String,
    cross: String,
    pointer: String,
    pointerSmall: String,
    squareSmallFilled: String,
    tick: String,
    warning: String
  ): Figures_ = {
    val __obj = js.Dynamic.literal(arrowDown = arrowDown.asInstanceOf[js.Any], arrowLeft = arrowLeft.asInstanceOf[js.Any], arrowRight = arrowRight.asInstanceOf[js.Any], checkboxOn = checkboxOn.asInstanceOf[js.Any], cross = cross.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], pointerSmall = pointerSmall.asInstanceOf[js.Any], squareSmallFilled = squareSmallFilled.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Figures_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Figures_] (val x: Self) extends AnyVal {
    
    inline def setArrowDown(value: String): Self = StObject.set(x, "arrowDown", value.asInstanceOf[js.Any])
    
    inline def setArrowLeft(value: String): Self = StObject.set(x, "arrowLeft", value.asInstanceOf[js.Any])
    
    inline def setArrowRight(value: String): Self = StObject.set(x, "arrowRight", value.asInstanceOf[js.Any])
    
    inline def setCheckboxOn(value: String): Self = StObject.set(x, "checkboxOn", value.asInstanceOf[js.Any])
    
    inline def setCross(value: String): Self = StObject.set(x, "cross", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: String): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerSmall(value: String): Self = StObject.set(x, "pointerSmall", value.asInstanceOf[js.Any])
    
    inline def setSquareSmallFilled(value: String): Self = StObject.set(x, "squareSmallFilled", value.asInstanceOf[js.Any])
    
    inline def setTick(value: String): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
