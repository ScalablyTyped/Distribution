package typings.inversifyRestifyUtils

import typings.inversify.interfacesMod.interfaces.Container
import typings.inversifyRestifyUtils.interfacesMod.interfaces.ConfigFunction
import typings.restify.mod.Server
import typings.restify.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("inversify-restify-utils/dts/server", "InversifyRestifyServer")
  @js.native
  class InversifyRestifyServer protected () extends StObject {
    def this(container: Container) = this()
    def this(
      container: Container,
      opts: ServerOptions & typings.inversifyRestifyUtils.interfacesMod.interfaces.ServerOptions
    ) = this()
    
    var app: js.Any = js.native
    
    def build(): Server = js.native
    
    var configFn: js.Any = js.native
    
    var container: js.Any = js.native
    
    var defaultRoot: js.Any = js.native
    
    var handlerFactory: js.Any = js.native
    
    var registerControllers: js.Any = js.native
    
    var resolveMiddleware: js.Any = js.native
    
    def setConfig(fn: ConfigFunction): InversifyRestifyServer = js.native
  }
}
