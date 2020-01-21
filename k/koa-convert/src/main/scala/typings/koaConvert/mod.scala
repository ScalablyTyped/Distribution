package typings.koaConvert

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koa.mod.Next
import typings.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-convert", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(mw: js.Function2[/* context */ Context, /* next */ Next, Generator[_, _, _]]): Middleware[DefaultState, DefaultContext] = js.native
}

