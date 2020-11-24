package typings.koaBunyanLogger.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-bunyan-logger", "requestIdContext")
@js.native
object requestIdContext extends js.Object {
  
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: RequestIdContextOptions): Middleware[DefaultState, DefaultContext] = js.native
}
