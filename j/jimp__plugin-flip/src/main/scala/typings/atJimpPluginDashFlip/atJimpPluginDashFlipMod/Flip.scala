package typings.atJimpPluginDashFlip.atJimpPluginDashFlipMod

import typings.atJimpCore.typesEtcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flip extends js.Object {
  def flip(horizontal: Boolean, vertical: Boolean): this.type = js.native
  def flip(horizontal: Boolean, vertical: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  def mirror(horizontal: Boolean, vertical: Boolean): this.type = js.native
  def mirror(horizontal: Boolean, vertical: Boolean, cb: ImageCallback[this.type]): this.type = js.native
}

