package typings.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGradientOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var stops: js.UndefOr[Any] = js.undefined
}
object LinearGradientOptions {
  
  inline def apply(): LinearGradientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGradientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinearGradientOptions] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStops(value: Any): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
  }
}
