package typings.jsreportNodejsClient

import typings.jsreportCore.anon.PartialRequestOptions
import typings.jsreportCore.mod.Context
import typings.jsreportCore.mod.TemplateLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<jsreport.jsreport.Request> */
  trait PartialRequest extends StObject {
    
    var configurable: js.UndefOr[Boolean] = js.undefined
    
    var context: js.UndefOr[Context] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var enumerable: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[PartialRequestOptions] = js.undefined
    
    var template: js.UndefOr[TemplateLike] = js.undefined
    
    var value: js.UndefOr[Boolean] = js.undefined
    
    var writable: js.UndefOr[Boolean] = js.undefined
  }
  object PartialRequest {
    
    inline def apply(): PartialRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRequest] (val x: Self) extends AnyVal {
      
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
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
}
