package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGRectAttributes extends SVGAttributes {
  
  var height: js.UndefOr[String | Double] = js.native
  
  var rx: js.UndefOr[String | Double] = js.native
  
  var ry: js.UndefOr[String | Double] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
  
  var x: js.UndefOr[String | Double] = js.native
  
  var y: js.UndefOr[String | Double] = js.native
}
object SVGRectAttributes {
  
  @scala.inline
  def apply(): SVGRectAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGRectAttributes]
  }
  
  @scala.inline
  implicit class SVGRectAttributesMutableBuilder[Self <: SVGRectAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setRx(value: String | Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: String | Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: String | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: String | Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
