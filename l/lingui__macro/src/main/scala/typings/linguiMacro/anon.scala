package typings.linguiMacro

import typings.linguiMacro.mod.MacroMessageDescriptor
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(descriptor: MacroMessageDescriptor): String = js.native
    def apply(literals: TemplateStringsArray, placeholders: Any*): String = js.native
  }
  
  /* Inlined {  id :string,   message :string | undefined} & {  comment :string | undefined,   context :string | undefined} */
  trait idstringmessagestringunde
    extends StObject
       with MacroMessageDescriptor {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var message: js.UndefOr[String] = js.undefined
  }
  object idstringmessagestringunde {
    
    inline def apply(id: String): idstringmessagestringunde = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[idstringmessagestringunde]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: idstringmessagestringunde] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  /* Inlined {  id :string | undefined,   message :string} & {  comment :string | undefined,   context :string | undefined} */
  trait idstringundefinedmessages
    extends StObject
       with MacroMessageDescriptor {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var message: String
  }
  object idstringundefinedmessages {
    
    inline def apply(message: String): idstringundefinedmessages = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[idstringundefinedmessages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: idstringundefinedmessages] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
