package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashCompilerErrors extends StObject {
  
  def clear(): js.Any
  
  def save(): js.Any
}
object FlashCompilerErrors {
  
  inline def apply(clear: () => js.Any, save: () => js.Any): FlashCompilerErrors = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[FlashCompilerErrors]
  }
  
  extension [Self <: FlashCompilerErrors](x: Self) {
    
    inline def setClear(value: () => js.Any): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setSave(value: () => js.Any): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
  }
}
