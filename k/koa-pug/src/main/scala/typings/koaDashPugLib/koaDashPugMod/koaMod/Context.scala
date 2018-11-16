package typings
package koaDashPugLib.koaDashPugMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  def render(viewPath: java.lang.String): scala.Unit = js.native
  def render(viewPath: java.lang.String, locals: koaDashPugLib.koaDashPugMod.PugNs.PugLocals): scala.Unit = js.native
  def render(
    viewPath: java.lang.String,
    locals: koaDashPugLib.koaDashPugMod.PugNs.PugLocals,
    overrideOpts: koaDashPugLib.koaDashPugMod.PugNs.PugCtxOptions
  ): scala.Unit = js.native
  def render(
    viewPath: java.lang.String,
    locals: koaDashPugLib.koaDashPugMod.PugNs.PugLocals,
    overrideOpts: koaDashPugLib.koaDashPugMod.PugNs.PugCtxOptions,
    noCache: scala.Boolean
  ): scala.Unit = js.native
  def render(
    viewPath: java.lang.String,
    locals: koaDashPugLib.koaDashPugMod.PugNs.PugLocals,
    overrideOpts: scala.Boolean
  ): scala.Unit = js.native
}

