package typings
package koaDashPugLib.koaDashPugMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  def render(viewPath: java.lang.String): scala.Unit = js.native
  def render(viewPath: java.lang.String, locals: koaDashPugLib.koaDashPugMod.PugLocals): scala.Unit = js.native
  def render(
    viewPath: java.lang.String,
    locals: koaDashPugLib.koaDashPugMod.PugLocals,
    overrideOpts: koaDashPugLib.koaDashPugMod.PugCtxOptions
  ): scala.Unit = js.native
  def render(
    viewPath: java.lang.String,
    locals: koaDashPugLib.koaDashPugMod.PugLocals,
    overrideOpts: koaDashPugLib.koaDashPugMod.PugCtxOptions,
    noCache: scala.Boolean
  ): scala.Unit = js.native
  def render(
    viewPath: java.lang.String,
    locals: koaDashPugLib.koaDashPugMod.PugLocals,
    overrideOpts: scala.Boolean
  ): scala.Unit = js.native
}

