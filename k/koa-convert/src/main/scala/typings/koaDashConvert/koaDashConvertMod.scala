package typings.koaDashConvert

import typings.koa.koaMod.Context
import typings.koa.koaMod.Middleware
import typings.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-convert", JSImport.Namespace)
@js.native
object koaDashConvertMod extends js.Object {
  def apply(mw: js.Function2[/* context */ Context, /* next */ js.Function0[js.Promise[_]], Generator]): Middleware[_, js.Object] = js.native
}

