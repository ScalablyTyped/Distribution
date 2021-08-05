package typings.hapiHawk

import typings.hapiHapi.mod.Server_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  object plugin {
    
    @JSImport("@hapi/hawk/lib/plugin", "plugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@hapi/hawk/lib/plugin", "plugin.pkg")
    @js.native
    val pkg: Record[String, js.Any] = js.native
    
    inline def register(server: Server_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(server.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@hapi/hawk/lib/plugin", "plugin.requirements")
    @js.native
    val requirements: Record[String, String] = js.native
  }
}
