package typings
package koaDashSslifyLib.koaDashSslifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-sslify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def apply(options: Options): koaLib.koaMod.Middleware[_, js.Object] = js.native
  /**
    * Azure resolver
    * Azure is using `x-att-ssl` header
    */
  def azureResolver(ctx: koaLib.koaMod.Context): scala.Boolean = js.native
  /**
    * Custom proto header factory
    */
  def customProtoHeaderResolver(header: java.lang.String): js.Function1[/* ctx */ koaLib.koaMod.Context, scala.Boolean] = js.native
  /**
    * Resolver for `Forwarded` header
    * see https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Forwarded
    */
  def forwardedResolver(ctx: koaLib.koaMod.Context): scala.Boolean = js.native
  /**
    * Default HTTPS resolver
    * This works when using node.js TLS support
    */
  def httpsResolver(ctx: koaLib.koaMod.Context): scala.Boolean = js.native
  /**
    * x-forwarded-proto header resolver
    * common for heroku gcp (ingress) etc
    */
  def xForwardedProtoResolver(ctx: koaLib.koaMod.Context): scala.Boolean = js.native
}

