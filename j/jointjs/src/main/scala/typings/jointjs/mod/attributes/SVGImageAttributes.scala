package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGImageAttributes
  extends StObject
     with SVGAttributes {
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
  
  var x: js.UndefOr[String | Double] = js.undefined
  
  var y: js.UndefOr[String | Double] = js.undefined
}
object SVGImageAttributes {
  
  @scala.inline
  def apply(): SVGImageAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGImageAttributes]
  }
  
  @scala.inline
  implicit class SVGImageAttributesMutableBuilder[Self <: SVGImageAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
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
