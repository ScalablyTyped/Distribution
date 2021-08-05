package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAttributeTextWrap
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var ellipsis: js.UndefOr[Boolean | String] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var hyphen: js.UndefOr[String] = js.undefined
  
  var maxLineCount: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object SVGAttributeTextWrap {
  
  inline def apply(): SVGAttributeTextWrap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGAttributeTextWrap]
  }
  
  extension [Self <: SVGAttributeTextWrap](x: Self) {
    
    inline def setEllipsis(value: Boolean | String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHyphen(value: String): Self = StObject.set(x, "hyphen", value.asInstanceOf[js.Any])
    
    inline def setHyphenUndefined: Self = StObject.set(x, "hyphen", js.undefined)
    
    inline def setMaxLineCount(value: Double): Self = StObject.set(x, "maxLineCount", value.asInstanceOf[js.Any])
    
    inline def setMaxLineCountUndefined: Self = StObject.set(x, "maxLineCount", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
