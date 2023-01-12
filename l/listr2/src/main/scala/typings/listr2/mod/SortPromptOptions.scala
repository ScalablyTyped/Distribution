package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortPromptOptions
  extends StObject
     with BasePromptOptions {
  
  var drag: js.UndefOr[Boolean] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  var numbered: js.UndefOr[Boolean] = js.undefined
}
object SortPromptOptions {
  
  inline def apply(message: String | (js.Function0[js.Promise[String] | String])): SortPromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortPromptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortPromptOptions] (val x: Self) extends AnyVal {
    
    inline def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setNumbered(value: Boolean): Self = StObject.set(x, "numbered", value.asInstanceOf[js.Any])
    
    inline def setNumberedUndefined: Self = StObject.set(x, "numbered", js.undefined)
  }
}
