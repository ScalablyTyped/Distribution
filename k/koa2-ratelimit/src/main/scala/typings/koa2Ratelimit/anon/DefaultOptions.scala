package typings.koa2Ratelimit.anon

import typings.koa.mod.Context
import typings.koa.mod.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultOptions extends js.Object {
  
  def defaultOptions(): Unit = js.native
  def defaultOptions(options: PartialRateLimitOptions): Unit = js.native
  
  def middleware(): js.Function2[/* ctx */ Context, /* next */ Next, js.Promise[_]] = js.native
  def middleware(options: PartialRateLimitOptions): js.Function2[/* ctx */ Context, /* next */ Next, js.Promise[_]] = js.native
}
