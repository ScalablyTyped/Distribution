package typings.atJimpPluginDashDither.atJimpPluginDashDitherMod

import typings.atJimpCore.typesEtcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dither extends js.Object {
  def dither16(): this.type = js.native
  def dither16(cb: ImageCallback[this.type]): this.type = js.native
  def dither565(): this.type = js.native
  def dither565(cb: ImageCallback[this.type]): this.type = js.native
}

