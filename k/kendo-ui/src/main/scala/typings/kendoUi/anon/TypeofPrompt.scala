package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPrompt extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Prompt
  
  /* static member */
  var fn: Prompt
}
object TypeofPrompt {
  
  inline def apply(extend: js.Object => Prompt, fn: Prompt): TypeofPrompt = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPrompt]
  }
  
  extension [Self <: TypeofPrompt](x: Self) {
    
    inline def setExtend(value: js.Object => Prompt): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Prompt): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
