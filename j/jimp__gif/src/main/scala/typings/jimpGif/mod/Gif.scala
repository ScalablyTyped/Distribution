package typings.jimpGif.mod

import typings.jimpGif.AnonImagegif
import typings.jimpGif.AnonImagegifDecoderFn
import typings.jimpGif.AnonMIMEGIF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gif extends js.Object {
  var constants: AnonMIMEGIF
  var decoders: AnonImagegifDecoderFn
  var mime: AnonImagegif
}

object Gif {
  @scala.inline
  def apply(constants: AnonMIMEGIF, decoders: AnonImagegifDecoderFn, mime: AnonImagegif): Gif = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gif]
  }
}

