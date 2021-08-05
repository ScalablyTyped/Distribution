package typings.jsreportClient

import typings.jsreportCore.anon.PartialTemplate
import typings.jsreportCore.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<jsreport-core.jsreport-core.Request> */
  trait PartialRequest extends StObject {
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var options: js.UndefOr[Options] = js.undefined
    
    var template: js.UndefOr[PartialTemplate] = js.undefined
  }
  object PartialRequest {
    
    inline def apply(): PartialRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRequest]
    }
    
    extension [Self <: PartialRequest](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTemplate(value: PartialTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
