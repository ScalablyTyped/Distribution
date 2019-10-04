package typings.atJimpJpeg.atJimpJpegMod

import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpJpeg.atJimpJpegStrings.`image/jpeg`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JpegClass extends js.Object {
  var MIME_JPEG: `image/jpeg` = js.native
  var _quality: Double = js.native
  def quality(n: Double): this.type = js.native
  def quality(n: Double, cb: ImageCallback[this.type]): this.type = js.native
}

