package typings.jqueryCustomselect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryCustomSelectOption extends StObject {
  
  var customClass: js.UndefOr[String] = js.undefined
  
  var mapClass: js.UndefOr[Boolean] = js.undefined
  
  var mapStyle: js.UndefOr[Boolean] = js.undefined
}
object JQueryCustomSelectOption {
  
  inline def apply(): JQueryCustomSelectOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryCustomSelectOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryCustomSelectOption] (val x: Self) extends AnyVal {
    
    inline def setCustomClass(value: String): Self = StObject.set(x, "customClass", value.asInstanceOf[js.Any])
    
    inline def setCustomClassUndefined: Self = StObject.set(x, "customClass", js.undefined)
    
    inline def setMapClass(value: Boolean): Self = StObject.set(x, "mapClass", value.asInstanceOf[js.Any])
    
    inline def setMapClassUndefined: Self = StObject.set(x, "mapClass", js.undefined)
    
    inline def setMapStyle(value: Boolean): Self = StObject.set(x, "mapStyle", value.asInstanceOf[js.Any])
    
    inline def setMapStyleUndefined: Self = StObject.set(x, "mapStyle", js.undefined)
  }
}
