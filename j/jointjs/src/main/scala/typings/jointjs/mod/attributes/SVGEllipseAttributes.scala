package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGEllipseAttributes
  extends StObject
     with SVGAttributes {
  
  var cx: js.UndefOr[String | Double] = js.undefined
  
  var cy: js.UndefOr[String | Double] = js.undefined
  
  var rx: js.UndefOr[String | Double] = js.undefined
  
  var ry: js.UndefOr[String | Double] = js.undefined
}
object SVGEllipseAttributes {
  
  @scala.inline
  def apply(): SVGEllipseAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGEllipseAttributes]
  }
  
  @scala.inline
  implicit class SVGEllipseAttributesMutableBuilder[Self <: SVGEllipseAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx(value: String | Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: String | Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setRx(value: String | Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: String | Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
  }
}
