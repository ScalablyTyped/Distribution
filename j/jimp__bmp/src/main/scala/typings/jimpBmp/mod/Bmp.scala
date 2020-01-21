package typings.jimpBmp.mod

import typings.jimpBmp.AnonImagebmp
import typings.jimpBmp.AnonImagebmpArray
import typings.jimpBmp.AnonImagebmpImagexmsbmp
import typings.jimpBmp.AnonImagebmpImagexmsbmpEncoderFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bmp extends js.Object {
  var constants: AnonImagebmp
  var decoders: AnonImagebmpImagexmsbmp
  var encoders: AnonImagebmpImagexmsbmpEncoderFn
  var mime: AnonImagebmpArray
}

object Bmp {
  @scala.inline
  def apply(
    constants: AnonImagebmp,
    decoders: AnonImagebmpImagexmsbmp,
    encoders: AnonImagebmpImagexmsbmpEncoderFn,
    mime: AnonImagebmpArray
  ): Bmp = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bmp]
  }
}

