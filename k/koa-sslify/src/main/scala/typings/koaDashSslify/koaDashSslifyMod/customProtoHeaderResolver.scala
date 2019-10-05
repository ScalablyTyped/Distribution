package typings.koaDashSslify.koaDashSslifyMod

import typings.koa.koaMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-sslify", "customProtoHeaderResolver")
@js.native
object customProtoHeaderResolver extends js.Object {
  def apply(header: String): js.Function1[/* ctx */ Context, Boolean] = js.native
}

