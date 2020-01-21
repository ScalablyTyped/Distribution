package typings.jimpJpeg.mod

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpJpeg.jimpJpegStrings.imageSlashjpeg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JpegClass extends js.Object {
  var MIME_JPEG: imageSlashjpeg = js.native
  var _quality: Double = js.native
  def quality(n: Double): this.type = js.native
  def quality(n: Double, cb: ImageCallback[this.type]): this.type = js.native
}

