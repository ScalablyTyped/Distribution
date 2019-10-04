package typings.koaDashSslify.koaDashSslifyMod

import typings.koa.koaMod.Context
import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-sslify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def azureResolver(ctx: Context): Boolean = js.native
  def customProtoHeaderResolver(header: String): js.Function1[/* ctx */ Context, Boolean] = js.native
  def default(): Middleware[DefaultState, DefaultContext] = js.native
  def default(options: Options): Middleware[DefaultState, DefaultContext] = js.native
  def forwardedResolver(ctx: Context): Boolean = js.native
  def httpsResolver(ctx: Context): Boolean = js.native
  def xForwardedProtoResolver(ctx: Context): Boolean = js.native
}

