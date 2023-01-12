package typings.kendoUi.kendo.drawing

import typings.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientStop
  extends StObject
     with Class {
  
  var options: GradientStopOptions
}
object GradientStop {
  
  inline def apply(options: GradientStopOptions): GradientStop = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GradientStop] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: GradientStopOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
