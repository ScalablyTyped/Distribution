package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TogglePromptOptions
  extends StObject
     with BasePromptOptions {
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[String] = js.undefined
}
object TogglePromptOptions {
  
  inline def apply(message: String | (js.Function0[js.Promise[String] | String])): TogglePromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TogglePromptOptions]
  }
  
  extension [Self <: TogglePromptOptions](x: Self) {
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
