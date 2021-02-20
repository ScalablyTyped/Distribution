package typings.jqueryCustomselect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryCustomSelectOption extends StObject {
  
  var customClass: js.UndefOr[String] = js.native
  
  var mapClass: js.UndefOr[Boolean] = js.native
  
  var mapStyle: js.UndefOr[Boolean] = js.native
}
object JQueryCustomSelectOption {
  
  @scala.inline
  def apply(): JQueryCustomSelectOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryCustomSelectOption]
  }
  
  @scala.inline
  implicit class JQueryCustomSelectOptionMutableBuilder[Self <: JQueryCustomSelectOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomClass(value: String): Self = StObject.set(x, "customClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomClassUndefined: Self = StObject.set(x, "customClass", js.undefined)
    
    @scala.inline
    def setMapClass(value: Boolean): Self = StObject.set(x, "mapClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapClassUndefined: Self = StObject.set(x, "mapClass", js.undefined)
    
    @scala.inline
    def setMapStyle(value: Boolean): Self = StObject.set(x, "mapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapStyleUndefined: Self = StObject.set(x, "mapStyle", js.undefined)
  }
}
