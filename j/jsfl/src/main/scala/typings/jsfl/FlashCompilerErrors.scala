package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashCompilerErrors extends StObject {
  
  def clear(): Any
  
  def save(): Any
}
object FlashCompilerErrors {
  
  inline def apply(clear: () => Any, save: () => Any): FlashCompilerErrors = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[FlashCompilerErrors]
  }
  
  extension [Self <: FlashCompilerErrors](x: Self) {
    
    inline def setClear(value: () => Any): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setSave(value: () => Any): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
  }
}
