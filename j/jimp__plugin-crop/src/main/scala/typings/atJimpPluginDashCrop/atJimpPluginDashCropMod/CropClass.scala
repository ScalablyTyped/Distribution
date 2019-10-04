package typings.atJimpPluginDashCrop.atJimpPluginDashCropMod

import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpPluginDashCrop.Anon_CropOnlyFrames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropClass extends js.Object {
  def autocrop(): this.type = js.native
  def autocrop(cropOnlyFrames: Boolean): this.type = js.native
  def autocrop(cropOnlyFrames: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  def autocrop(options: Anon_CropOnlyFrames): this.type = js.native
  def autocrop(options: Anon_CropOnlyFrames, cb: ImageCallback[this.type]): this.type = js.native
  def autocrop(tolerance: Double): this.type = js.native
  def autocrop(tolerance: Double, cb: ImageCallback[this.type]): this.type = js.native
  def autocrop(tolerance: Double, cropOnlyFrames: Boolean): this.type = js.native
  def autocrop(tolerance: Double, cropOnlyFrames: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  def crop(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def crop(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
  def cropQuiet(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def cropQuiet(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
}

