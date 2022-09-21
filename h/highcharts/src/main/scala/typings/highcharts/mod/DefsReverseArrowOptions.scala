package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefsReverseArrowOptions extends StObject {
  
  var attributes: js.UndefOr[DefsReverseArrowAttributesOptions] = js.undefined
  
  var tagName: js.UndefOr[String] = js.undefined
}
object DefsReverseArrowOptions {
  
  inline def apply(): DefsReverseArrowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefsReverseArrowOptions]
  }
  
  extension [Self <: DefsReverseArrowOptions](x: Self) {
    
    inline def setAttributes(value: DefsReverseArrowAttributesOptions): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
