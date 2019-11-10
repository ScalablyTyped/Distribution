package typings.koaDashConvert

import typings.koa.koaMod.Context
import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import typings.koa.koaMod.Next
import typings.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-convert", JSImport.Namespace)
@js.native
object koaDashConvertMod extends js.Object {
  def apply(mw: js.Function2[/* context */ Context, /* next */ Next, Generator[_, _, _]]): Middleware[DefaultState, DefaultContext] = js.native
}

