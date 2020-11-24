package typings.hapiHawk

import typings.hapiHapi.mod.Server_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/hawk/lib/plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  
  @js.native
  object plugin extends js.Object {
    
    val pkg: Record[String, js.Any] = js.native
    
    def register(server: Server_): Unit = js.native
    
    val requirements: Record[String, String] = js.native
  }
}
