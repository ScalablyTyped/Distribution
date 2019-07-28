package typings.koaDashPug.koaDashPugMod.koaMod

import typings.koaDashPug.koaDashPugMod.PugCtxOptions
import typings.koaDashPug.koaDashPugMod.PugLocals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  def render(viewPath: String): Unit = js.native
  def render(viewPath: String, locals: PugLocals): Unit = js.native
  def render(viewPath: String, locals: PugLocals, overrideOpts: Boolean): Unit = js.native
  def render(viewPath: String, locals: PugLocals, overrideOpts: PugCtxOptions): Unit = js.native
  def render(viewPath: String, locals: PugLocals, overrideOpts: PugCtxOptions, noCache: Boolean): Unit = js.native
}

