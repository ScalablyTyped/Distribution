package typings.koaDashStaticDashCache.koaDashStaticDashCacheMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-static-cache", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(dir: String | Options): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String | Options, options: Options | Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String | Options, options: Options | Files, files: Files): Middleware[DefaultState, DefaultContext] = js.native
}

