package typings.intlifyMessageCompiler.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCompileErrorOptions extends StObject {
  
  var args: js.UndefOr[js.Array[Any]] = js.undefined
  
  var domain: js.UndefOr[CompileDomain] = js.undefined
  
  var messages: js.UndefOr[NumberDictionary[String]] = js.undefined
}
object CreateCompileErrorOptions {
  
  inline def apply(): CreateCompileErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCompileErrorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCompileErrorOptions] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDomain(value: CompileDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setMessages(value: NumberDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
  }
}
