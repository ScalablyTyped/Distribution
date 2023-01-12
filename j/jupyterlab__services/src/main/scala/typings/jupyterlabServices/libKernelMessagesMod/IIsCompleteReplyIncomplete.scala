package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.incomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIsCompleteReplyIncomplete extends StObject {
  
  var indent: String
  
  var status: incomplete
}
object IIsCompleteReplyIncomplete {
  
  inline def apply(indent: String): IIsCompleteReplyIncomplete = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], status = "incomplete")
    __obj.asInstanceOf[IIsCompleteReplyIncomplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IIsCompleteReplyIncomplete] (val x: Self) extends AnyVal {
    
    inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: incomplete): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
