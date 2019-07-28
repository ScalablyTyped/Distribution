package typings.koaDashGenericDashSession.koaDashGenericDashSessionMod

import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-generic-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MemoryStore: SessionStore = js.native
  def apply(options: SessionOptions): Middleware[_, js.Object] = js.native
}

