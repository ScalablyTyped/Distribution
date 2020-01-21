package typings.jimpPluginColor.mod

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  def brightness(`val`: Double): this.type = js.native
  def brightness(`val`: Double, cb: ImageCallback[this.type]): this.type = js.native
  def color(actions: js.Array[ColorAction]): this.type = js.native
  def color(actions: js.Array[ColorAction], cb: ImageCallback[this.type]): this.type = js.native
  def colour(actions: js.Array[ColorAction]): this.type = js.native
  def colour(actions: js.Array[ColorAction], cb: ImageCallback[this.type]): this.type = js.native
  def contrast(`val`: Double): this.type = js.native
  def contrast(`val`: Double, cb: ImageCallback[this.type]): this.type = js.native
  def convolute(kernel: js.Array[js.Array[Double]]): this.type = js.native
  def convolute(kernel: js.Array[js.Array[Double]], cb: ImageCallback[this.type]): this.type = js.native
  def convolute(kernel: js.Array[js.Array[Double]], x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def convolute(
    kernel: js.Array[js.Array[Double]],
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    cb: ImageCallback[this.type]
  ): this.type = js.native
  def convolution(kernel: js.Array[js.Array[Double]]): this.type = js.native
  def convolution(kernel: js.Array[js.Array[Double]], cb: ImageCallback[this.type]): this.type = js.native
  def convolution[T](kernel: js.Array[js.Array[Double]], edgeHandling: String): this.type = js.native
  def convolution[T](kernel: js.Array[js.Array[Double]], edgeHandling: String, cb: ImageCallback[this.type]): this.type = js.native
  def fade(f: Double): this.type = js.native
  def fade(f: Double, cb: ImageCallback[this.type]): this.type = js.native
  def grayscale(): this.type = js.native
  def grayscale(cb: ImageCallback[this.type]): this.type = js.native
  def greyscale(): this.type = js.native
  def greyscale(cb: ImageCallback[this.type]): this.type = js.native
  def opacity(f: Double): this.type = js.native
  def opacity(f: Double, cb: ImageCallback[this.type]): this.type = js.native
  def opaque(): this.type = js.native
  def opaque(cb: ImageCallback[this.type]): this.type = js.native
  def pixelate(size: Double): this.type = js.native
  def pixelate(size: Double, cb: ImageCallback[this.type]): this.type = js.native
  def pixelate(size: Double, x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def pixelate(size: Double, x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
  def posterize(n: Double): this.type = js.native
  def posterize(n: Double, cb: ImageCallback[this.type]): this.type = js.native
  def sepia(): this.type = js.native
  def sepia(cb: ImageCallback[this.type]): this.type = js.native
}

