package typings.ionic

import typings.ionic.commandsConfigBaseMod.BaseConfigCommand
import typings.ionic.commandsConfigBaseMod.ConfigContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/config/get", JSImport.Namespace)
@js.native
object commandsConfigGetMod extends js.Object {
  @js.native
  class ConfigGetCommand () extends BaseConfigCommand {
    def printConfig(ctx: ConfigContext, v: js.Any): Unit = js.native
    def sanitizeEntry(key: String, value: js.Any): js.Any = js.native
  }
  
}

