package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SimpleDialog {
  
  trait Button extends StObject {
    
    var handler: js.UndefOr[js.Function] = js.undefined
    
    var text: String
  }
  object Button {
    
    inline def apply(text: String): Button = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Button]
    }
    
    extension [Self <: Button](x: Self) {
      
      inline def setHandler(value: js.Function): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var text: String
    
    var title: String
  }
  object Options {
    
    inline def apply(text: String, title: String): typings.ibmMobilefirst.WL.SimpleDialog.Options = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ibmMobilefirst.WL.SimpleDialog.Options]
    }
    
    extension [Self <: typings.ibmMobilefirst.WL.SimpleDialog.Options](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
