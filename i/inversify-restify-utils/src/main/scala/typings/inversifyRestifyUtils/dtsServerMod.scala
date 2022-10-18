package typings.inversifyRestifyUtils

import typings.inversify.mod.Container
import typings.inversifyRestifyUtils.dtsInterfacesMod.interfaces.ConfigFunction
import typings.restify.mod.Server
import typings.restify.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsServerMod {
  
  @JSImport("inversify-restify-utils/dts/server", "InversifyRestifyServer")
  @js.native
  open class InversifyRestifyServer protected () extends StObject {
    def this(container: Container) = this()
    def this(
      container: Container,
      opts: ServerOptions & typings.inversifyRestifyUtils.dtsInterfacesMod.interfaces.ServerOptions
    ) = this()
    
    /* private */ var app: Any = js.native
    
    def build(): Server = js.native
    
    /* private */ var configFn: Any = js.native
    
    /* private */ var container: Any = js.native
    
    /* private */ var defaultRoot: Any = js.native
    
    /* private */ var handlerFactory: Any = js.native
    
    /* private */ var registerControllers: Any = js.native
    
    /* private */ var resolveMiddleware: Any = js.native
    
    def setConfig(fn: ConfigFunction): InversifyRestifyServer = js.native
  }
}
