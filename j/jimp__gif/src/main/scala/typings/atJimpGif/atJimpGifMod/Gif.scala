package typings.atJimpGif.atJimpGifMod

import typings.atJimpGif.Anon_Imagegif
import typings.atJimpGif.Anon_ImagegifDecoderFn
import typings.atJimpGif.Anon_ImagegifMIMEGIF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gif extends js.Object {
  var constants: Anon_ImagegifMIMEGIF
  var decoders: Anon_ImagegifDecoderFn
  var mime: Anon_Imagegif
}

object Gif {
  @scala.inline
  def apply(constants: Anon_ImagegifMIMEGIF, decoders: Anon_ImagegifDecoderFn, mime: Anon_Imagegif): Gif = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Gif]
  }
}

