package typings.koaDashCompress.koaDashCompressMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-compress", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Compress middleware for Koa
    */
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: CompressOptions): Middleware[DefaultState, DefaultContext] = js.native
}

