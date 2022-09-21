package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefsArrowOptions extends StObject {
  
  var attributes: js.UndefOr[DefsArrowAttributesOptions] = js.undefined
  
  var children: js.UndefOr[js.Array[DefsOptions]] = js.undefined
  
  var tagName: js.UndefOr[String] = js.undefined
}
object DefsArrowOptions {
  
  inline def apply(): DefsArrowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefsArrowOptions]
  }
  
  extension [Self <: DefsArrowOptions](x: Self) {
    
    inline def setAttributes(value: DefsArrowAttributesOptions): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setChildren(value: js.Array[DefsOptions]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: DefsOptions*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
