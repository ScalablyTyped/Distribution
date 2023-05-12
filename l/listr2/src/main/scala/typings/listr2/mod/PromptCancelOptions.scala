package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptCancelOptions extends StObject {
  
  var `throw`: js.UndefOr[Boolean] = js.undefined
}
object PromptCancelOptions {
  
  inline def apply(): PromptCancelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptCancelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromptCancelOptions] (val x: Self) extends AnyVal {
    
    inline def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
    
    inline def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
  }
}
