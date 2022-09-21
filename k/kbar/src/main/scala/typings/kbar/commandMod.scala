package typings.kbar

import typings.kbar.anon.Perform
import typings.kbar.anon.Redo
import typings.kbar.typesMod.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandMod {
  
  @JSImport("kbar/lib/action/Command", "Command")
  @js.native
  open class Command protected () extends StObject {
    def this(command: Perform) = this()
    def this(command: Perform, options: CommandOptions) = this()
    
    var history: js.UndefOr[Redo] = js.native
    
    /* private */ var historyItem: Any = js.native
    
    def perform(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any = js.native
  }
  
  trait CommandOptions extends StObject {
    
    var history: js.UndefOr[History] = js.undefined
  }
  object CommandOptions {
    
    inline def apply(): CommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandOptions]
    }
    
    extension [Self <: CommandOptions](x: Self) {
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    }
  }
}
