package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPrompt extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Prompt = js.native
  
  /* static member */
  var fn: Prompt = js.native
}
object TypeofPrompt {
  
  @scala.inline
  def apply(extend: js.Object => Prompt, fn: Prompt): TypeofPrompt = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPrompt]
  }
  
  @scala.inline
  implicit class TypeofPromptMutableBuilder[Self <: TypeofPrompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Prompt): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Prompt): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
