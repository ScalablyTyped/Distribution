package typings.kendoUi.kendo.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var stops: js.UndefOr[js.Any] = js.undefined
}
object GradientOptions {
  
  @scala.inline
  def apply(): GradientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradientOptions]
  }
  
  @scala.inline
  implicit class GradientOptionsMutableBuilder[Self <: GradientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStops(value: js.Any): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
  }
}
