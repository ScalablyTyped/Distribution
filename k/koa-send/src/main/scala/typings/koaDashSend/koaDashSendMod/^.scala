package typings.koaDashSend.koaDashSendMod

import typings.koa.koaMod.ParameterizedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-send", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(ctx: ParameterizedContext[_, js.Object], path: String): js.Promise[String] = js.native
  def apply(ctx: ParameterizedContext[_, js.Object], path: String, opts: SendOptions): js.Promise[String] = js.native
}

