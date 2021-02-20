package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointDotOptions extends StObject {
  
  var cssClass: js.UndefOr[String] = js.native
  
  var hoverClass: js.UndefOr[String] = js.native
  
  var radius: js.UndefOr[Double] = js.native
}
object EndpointDotOptions {
  
  @scala.inline
  def apply(): EndpointDotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDotOptions]
  }
  
  @scala.inline
  implicit class EndpointDotOptionsMutableBuilder[Self <: EndpointDotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverClassUndefined: Self = StObject.set(x, "hoverClass", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
