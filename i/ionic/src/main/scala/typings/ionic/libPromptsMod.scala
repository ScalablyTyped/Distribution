package typings.ionic

import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IonicEnvironmentFlags
import typings.ionicCliFrameworkPrompts.mod.PromptQuestion
import typings.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPromptsMod {
  
  @JSImport("ionic/lib/prompts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createOnFallback(param0: CreateOnFallbackOptions): js.Function1[/* question */ PromptQuestion, String | Boolean | Unit | PromptValueCheckbox] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnFallback")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* question */ PromptQuestion, String | Boolean | Unit | PromptValueCheckbox]]
  
  trait CreateOnFallbackOptions extends StObject {
    
    val flags: IonicEnvironmentFlags
    
    val log: ILogger
  }
  object CreateOnFallbackOptions {
    
    inline def apply(flags: IonicEnvironmentFlags, log: ILogger): CreateOnFallbackOptions = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOnFallbackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateOnFallbackOptions] (val x: Self) extends AnyVal {
      
      inline def setFlags(value: IonicEnvironmentFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
}
