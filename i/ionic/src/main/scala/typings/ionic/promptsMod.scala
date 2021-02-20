package typings.ionic

import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IonicEnvironmentFlags
import typings.ionicCliFrameworkPrompts.mod.PromptQuestion
import typings.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promptsMod {
  
  @JSImport("ionic/lib/prompts", "createOnFallback")
  @js.native
  def createOnFallback(hasFlagsLog: CreateOnFallbackOptions): js.Function1[/* question */ PromptQuestion, String | Boolean | Unit | PromptValueCheckbox] = js.native
  
  @js.native
  trait CreateOnFallbackOptions extends StObject {
    
    val flags: IonicEnvironmentFlags = js.native
    
    val log: ILogger = js.native
  }
  object CreateOnFallbackOptions {
    
    @scala.inline
    def apply(flags: IonicEnvironmentFlags, log: ILogger): CreateOnFallbackOptions = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOnFallbackOptions]
    }
    
    @scala.inline
    implicit class CreateOnFallbackOptionsMutableBuilder[Self <: CreateOnFallbackOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: IonicEnvironmentFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
}
