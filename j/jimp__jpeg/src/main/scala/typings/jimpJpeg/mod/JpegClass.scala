package typings.jimpJpeg.mod

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JpegClass extends js.Object {
  var _quality: Double = js.native
  def quality(n: Double): this.type = js.native
  def quality(n: Double, cb: ImageCallback[this.type]): this.type = js.native
}

