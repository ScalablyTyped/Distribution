package typings.atJimpPluginDashMask.atJimpPluginDashMaskMod

import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpCore.typesJimpMod.Jimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mask extends js.Object {
  def mask(src: Jimp, x: Double, y: Double): this.type = js.native
  def mask(src: Jimp, x: Double, y: Double, cb: ImageCallback[this.type]): this.type = js.native
}

