package typings.koaSend.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.ParameterizedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-send", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(ctx: ParameterizedContext[DefaultState, DefaultContext], path: String): js.Promise[String] = js.native
  def apply(ctx: ParameterizedContext[DefaultState, DefaultContext], path: String, opts: SendOptions): js.Promise[String] = js.native
}
