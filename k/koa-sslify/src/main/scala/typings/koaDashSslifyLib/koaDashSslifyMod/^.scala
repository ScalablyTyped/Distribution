package typings
package koaDashSslifyLib.koaDashSslifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-sslify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def azureResolver(ctx: koaLib.koaMod.Context): scala.Boolean = js.native
  def customProtoHeaderResolver(header: java.lang.String): js.Function1[/* ctx */ koaLib.koaMod.Context, scala.Boolean] = js.native
  def default(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def default(options: Options): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def forwardedResolver(ctx: koaLib.koaMod.Context): scala.Boolean = js.native
  def httpsResolver(ctx: koaLib.koaMod.Context): scala.Boolean = js.native
  def xForwardedProtoResolver(ctx: koaLib.koaMod.Context): scala.Boolean = js.native
}

