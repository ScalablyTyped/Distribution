package typings.koaBodyparser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Form extends StObject {
    
    var form: js.UndefOr[js.Array[String]] = js.undefined
    
    var json: js.UndefOr[js.Array[String]] = js.undefined
    
    var text: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Form {
    
    @scala.inline
    def apply(): Form = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Form]
    }
    
    @scala.inline
    implicit class FormMutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForm(value: js.Array[String]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setFormVarargs(value: String*): Self = StObject.set(x, "form", js.Array(value :_*))
      
      @scala.inline
      def setJson(value: js.Array[String]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setJsonVarargs(value: String*): Self = StObject.set(x, "json", js.Array(value :_*))
      
      @scala.inline
      def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    }
  }
}
