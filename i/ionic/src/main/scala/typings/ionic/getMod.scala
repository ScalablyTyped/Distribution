package typings.ionic

import typings.ionic.configBaseMod.BaseConfigCommand
import typings.ionic.configBaseMod.ConfigContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/commands/config/get", JSImport.Namespace)
@js.native
object getMod extends js.Object {
  
  @js.native
  class ConfigGetCommand () extends BaseConfigCommand {
    
    def printConfig(ctx: ConfigContext, v: js.Any): Unit = js.native
    
    def sanitizeEntry(key: String, value: js.Any): js.Any = js.native
  }
}
