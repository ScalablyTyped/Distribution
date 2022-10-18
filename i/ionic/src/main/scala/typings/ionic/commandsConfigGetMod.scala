package typings.ionic

import typings.ionic.commandsConfigBaseMod.BaseConfigCommand
import typings.ionic.commandsConfigBaseMod.ConfigContext
import typings.ionic.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsConfigGetMod {
  
  @JSImport("ionic/commands/config/get", "ConfigGetCommand")
  @js.native
  open class ConfigGetCommand protected () extends BaseConfigCommand {
    def this(namespace: INamespace) = this()
    
    def printConfig(ctx: ConfigContext, v: Any): Unit = js.native
    
    def sanitizeEntry(key: String, value: Any): Any = js.native
  }
}
