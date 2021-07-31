package typings.koaLoggerWinston

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.winston.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(logger: Logger): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(logger.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-logger-winston", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
