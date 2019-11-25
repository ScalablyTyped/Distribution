package typings.atJimpBmp.atJimpBmpMod

import typings.atJimpBmp.Anon_Imagebmp
import typings.atJimpBmp.Anon_ImagebmpArray
import typings.atJimpBmp.Anon_ImagebmpImagexmsbmp
import typings.atJimpBmp.Anon_ImagebmpImagexmsbmpEncoderFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bmp extends js.Object {
  var constants: Anon_Imagebmp
  var decoders: Anon_ImagebmpImagexmsbmp
  var encoders: Anon_ImagebmpImagexmsbmpEncoderFn
  var mime: Anon_ImagebmpArray
}

object Bmp {
  @scala.inline
  def apply(
    constants: Anon_Imagebmp,
    decoders: Anon_ImagebmpImagexmsbmp,
    encoders: Anon_ImagebmpImagexmsbmpEncoderFn,
    mime: Anon_ImagebmpArray
  ): Bmp = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bmp]
  }
}

