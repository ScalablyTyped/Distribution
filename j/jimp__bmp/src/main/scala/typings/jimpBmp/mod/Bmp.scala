package typings.jimpBmp.mod

import typings.jimpBmp.anon.Imagebmp
import typings.jimpBmp.anon.ImagebmpImagexmsbmp
import typings.jimpBmp.anon.Imagexmsbmp
import typings.jimpBmp.anon.MIMEBMP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bmp extends js.Object {
  var constants: MIMEBMP
  var decoders: Imagexmsbmp
  var encoders: ImagebmpImagexmsbmp
  var mime: Imagebmp
}

object Bmp {
  @scala.inline
  def apply(constants: MIMEBMP, decoders: Imagexmsbmp, encoders: ImagebmpImagexmsbmp, mime: Imagebmp): Bmp = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bmp]
  }
}

