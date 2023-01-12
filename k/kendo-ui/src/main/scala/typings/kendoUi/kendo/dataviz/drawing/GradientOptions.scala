package typings.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var stops: js.UndefOr[Any] = js.undefined
}
object GradientOptions {
  
  inline def apply(): GradientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GradientOptions] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStops(value: Any): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
  }
}
