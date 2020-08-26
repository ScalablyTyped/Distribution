package typings.jimpPluginCrop.mod

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpPluginCrop.anon.CropOnlyFrames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropClass extends js.Object {
  def autocrop(): this.type = js.native
  def autocrop(cropOnlyFrames: Boolean): this.type = js.native
  def autocrop(cropOnlyFrames: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  def autocrop(options: CropOnlyFrames): this.type = js.native
  def autocrop(options: CropOnlyFrames, cb: ImageCallback[this.type]): this.type = js.native
  def autocrop(tolerance: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
  def autocrop(
    tolerance: js.UndefOr[scala.Nothing],
    cropOnlyFrames: js.UndefOr[scala.Nothing],
    cb: ImageCallback[this.type]
  ): this.type = js.native
  def autocrop(tolerance: js.UndefOr[scala.Nothing], cropOnlyFrames: Boolean): this.type = js.native
  def autocrop(tolerance: js.UndefOr[scala.Nothing], cropOnlyFrames: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  def autocrop(tolerance: Double): this.type = js.native
  def autocrop(tolerance: Double, cb: ImageCallback[this.type]): this.type = js.native
  def autocrop(tolerance: Double, cropOnlyFrames: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
  def autocrop(tolerance: Double, cropOnlyFrames: Boolean): this.type = js.native
  def autocrop(tolerance: Double, cropOnlyFrames: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  def crop(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def crop(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
  def cropQuiet(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def cropQuiet(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
}

