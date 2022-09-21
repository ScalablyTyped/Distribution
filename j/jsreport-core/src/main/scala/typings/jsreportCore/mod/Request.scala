package typings.jsreportCore.mod

import typings.jsreportCore.anon.PartialRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  /** @default false */
  var configurable: js.UndefOr[Boolean] = js.undefined
  
  var context: js.UndefOr[Context] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  /** @default false */
  var enumerable: js.UndefOr[Boolean] = js.undefined
  
  /** defines options such as report name and request timeout */
  var options: js.UndefOr[PartialRequestOptions] = js.undefined
  
  /** defines the template of used for report generation */
  var template: TemplateLike
  
  /** @default true */
  var value: js.UndefOr[Boolean] = js.undefined
  
  /** @default false */
  var writable: js.UndefOr[Boolean] = js.undefined
}
object Request {
  
  inline def apply(template: TemplateLike): Request = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
    
    inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    inline def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
    
    inline def setOptions(value: PartialRequestOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTemplate(value: TemplateLike): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
