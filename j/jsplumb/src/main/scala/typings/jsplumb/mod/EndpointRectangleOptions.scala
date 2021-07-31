package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointRectangleOptions extends StObject {
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hoverClass: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object EndpointRectangleOptions {
  
  @scala.inline
  def apply(): EndpointRectangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointRectangleOptions]
  }
  
  @scala.inline
  implicit class EndpointRectangleOptionsMutableBuilder[Self <: EndpointRectangleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverClassUndefined: Self = StObject.set(x, "hoverClass", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
