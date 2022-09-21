package typings.intlifyCoreBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Messages extends StObject {
  
  var messages: /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any
}
object Messages {
  
  inline def apply(messages: /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any): Messages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  
  extension [Self <: Messages](x: Self) {
    
    inline def setMessages(value: /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}
