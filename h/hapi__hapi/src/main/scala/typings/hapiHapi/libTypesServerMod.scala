package typings.hapiHapi

import typings.hapiHapi.libTypesServerOptionsMod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesServerMod {
  
  @JSImport("@hapi/hapi/lib/types/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hapi/hapi/lib/types/server", "Server")
  @js.native
  /**
    * Creates a new server object
    * @param options server configuration object.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serveroptions)
    */
  open class Server_[A] ()
    extends typings.hapiHapi.libTypesServerServerMod.Server_[A] {
    def this(options: ServerOptions) = this()
  }
  
  inline def server[A](): typings.hapiHapi.libTypesServerServerMod.Server_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("server")().asInstanceOf[typings.hapiHapi.libTypesServerServerMod.Server_[A]]
  inline def server[A](opts: ServerOptions): typings.hapiHapi.libTypesServerServerMod.Server_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("server")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.hapiHapi.libTypesServerServerMod.Server_[A]]
}
