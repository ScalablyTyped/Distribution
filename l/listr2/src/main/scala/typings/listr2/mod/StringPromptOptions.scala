package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringPromptOptions
  extends StObject
     with BasePromptOptions {
  
  @JSName("initial")
  var initial_StringPromptOptions: js.UndefOr[String] = js.undefined
  
  var multiline: js.UndefOr[Boolean] = js.undefined
}
object StringPromptOptions {
  
  inline def apply(message: String | (js.Function0[js.Promise[String] | String])): StringPromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringPromptOptions]
  }
  
  extension [Self <: StringPromptOptions](x: Self) {
    
    inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
  }
}
