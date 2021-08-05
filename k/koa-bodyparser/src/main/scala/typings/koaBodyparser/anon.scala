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
    
    inline def apply(): Form = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Form]
    }
    
    extension [Self <: Form](x: Self) {
      
      inline def setForm(value: js.Array[String]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setFormVarargs(value: String*): Self = StObject.set(x, "form", js.Array(value :_*))
      
      inline def setJson(value: js.Array[String]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setJsonVarargs(value: String*): Self = StObject.set(x, "json", js.Array(value :_*))
      
      inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    }
  }
}
