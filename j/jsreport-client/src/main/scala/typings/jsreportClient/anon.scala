package typings.jsreportClient

import typings.jsreportCore.anon.PartialTemplate
import typings.jsreportCore.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<jsreport-core.jsreport-core.Request> */
  @js.native
  trait PartialRequest extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var options: js.UndefOr[Options] = js.native
    
    var template: js.UndefOr[PartialTemplate] = js.native
  }
  object PartialRequest {
    
    @scala.inline
    def apply(): PartialRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRequest]
    }
    
    @scala.inline
    implicit class PartialRequestMutableBuilder[Self <: PartialRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setTemplate(value: PartialTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
