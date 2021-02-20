package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradientStop extends Class {
  
  var options: GradientStopOptions = js.native
}
object GradientStop {
  
  @scala.inline
  def apply(options: GradientStopOptions): GradientStop = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
  
  @scala.inline
  implicit class GradientStopMutableBuilder[Self <: GradientStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: GradientStopOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
