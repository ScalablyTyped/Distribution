package typings.koaDashMount

import typings.koa.koaMod.Middleware
import typings.koa.koaMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-mount", JSImport.Namespace)
@js.native
object koaDashMountMod extends js.Object {
  def apply[StateT, CustomT](app: Middleware[StateT, CustomT]): Middleware[StateT, CustomT] = js.native
  def apply[StateT, CustomT](app: ^[StateT, CustomT]): Middleware[StateT, CustomT] = js.native
  def apply[StateT, CustomT](prefix: String, app: Middleware[StateT, CustomT]): Middleware[StateT, CustomT] = js.native
  def apply[StateT, CustomT](prefix: String, app: ^[StateT, CustomT]): Middleware[StateT, CustomT] = js.native
}

