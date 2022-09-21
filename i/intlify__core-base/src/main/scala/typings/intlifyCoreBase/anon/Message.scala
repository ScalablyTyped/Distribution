package typings.intlifyCoreBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var message: /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any
}
object Message {
  
  inline def apply(message: /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setMessage(value: /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
