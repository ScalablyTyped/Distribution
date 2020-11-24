package typings.koaMount

import typings.koa.mod.Middleware
import typings.koa.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-mount", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[StateT, CustomT](app: Middleware[StateT, CustomT]): Middleware[StateT, CustomT] = js.native
  def apply[StateT, CustomT](app: ^[StateT, CustomT]): Middleware[StateT, CustomT] = js.native
  def apply[StateT, CustomT](prefix: String, app: Middleware[StateT, CustomT]): Middleware[StateT, CustomT] = js.native
  def apply[StateT, CustomT](prefix: String, app: ^[StateT, CustomT]): Middleware[StateT, CustomT] = js.native
}
