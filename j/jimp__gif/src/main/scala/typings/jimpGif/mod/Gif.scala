package typings.jimpGif.mod

import typings.jimpGif.anon.Imagegif
import typings.jimpGif.anon.ImagegifDecoderFn
import typings.jimpGif.anon.MIMEGIF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gif extends js.Object {
  var constants: MIMEGIF
  var decoders: ImagegifDecoderFn
  var mime: Imagegif
}

object Gif {
  @scala.inline
  def apply(constants: MIMEGIF, decoders: ImagegifDecoderFn, mime: Imagegif): Gif = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gif]
  }
}

