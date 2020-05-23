package typings.koaBasicAuth

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaBasicAuth.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-basic-auth", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(opts: Name): Middleware[DefaultState, DefaultContext] = js.native
}

