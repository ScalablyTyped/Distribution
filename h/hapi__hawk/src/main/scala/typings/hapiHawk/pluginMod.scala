package typings.hapiHawk

import typings.hapiHapi.mod.Server
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  @js.native
  object plugin extends js.Object {
    val pkg: Record[String, js.Any] = js.native
    val requirements: Record[String, String] = js.native
    def register(server: Server): Unit = js.native
  }
  
}

