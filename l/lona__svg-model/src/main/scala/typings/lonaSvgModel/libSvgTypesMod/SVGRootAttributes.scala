package typings.lonaSvgModel.libSvgTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGRootAttributes
  extends StObject
     with SVGBaseAttributes {
  
  var height: js.UndefOr[String] = js.undefined
  
  var viewBox: String
  
  var width: js.UndefOr[String] = js.undefined
}
object SVGRootAttributes {
  
  inline def apply(viewBox: String): SVGRootAttributes = {
    val __obj = js.Dynamic.literal(viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGRootAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGRootAttributes] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
