package typings.i18nJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message extends StObject {
    
    var message: typings.i18nJs.mod.Message
  }
  object Message {
    
    inline def apply(message: typings.i18nJs.mod.Message): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: typings.i18nJs.mod.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: /* scope */ typings.i18nJs.mod.Scope => String | js.Object): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    }
  }
  
  trait Scope extends StObject {
    
    var scope: typings.i18nJs.mod.Scope
  }
  object Scope {
    
    inline def apply(scope: typings.i18nJs.mod.Scope): Scope = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
      
      inline def setScope(value: typings.i18nJs.mod.Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
}
