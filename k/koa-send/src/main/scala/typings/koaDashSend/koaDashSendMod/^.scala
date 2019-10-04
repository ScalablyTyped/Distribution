package typings.koaDashSend.koaDashSendMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.ParameterizedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-send", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(ctx: ParameterizedContext[DefaultState, DefaultContext], path: String): js.Promise[String] = js.native
  def apply(ctx: ParameterizedContext[DefaultState, DefaultContext], path: String, opts: SendOptions): js.Promise[String] = js.native
}

