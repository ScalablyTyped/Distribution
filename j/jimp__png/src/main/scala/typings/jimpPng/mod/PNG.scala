package typings.jimpPng.mod

import typings.jimpPng.anon.Imagepng
import typings.jimpPng.anon.ImagepngDecoderFn
import typings.jimpPng.anon.ImagepngEncoderFn
import typings.jimpPng.anon.MIMEPNG
import typings.jimpPng.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PNG extends js.Object {
  
  var `class`: PNGClass = js.native
  
  var constants: MIMEPNG = js.native
  
  var decoders: ImagepngDecoderFn = js.native
  
  var encoders: ImagepngEncoderFn = js.native
  
  var hasAlpha: `0` = js.native
  
  var mime: Imagepng = js.native
}
object PNG {
  
  @scala.inline
  def apply(
    `class`: PNGClass,
    constants: MIMEPNG,
    decoders: ImagepngDecoderFn,
    encoders: ImagepngEncoderFn,
    hasAlpha: `0`,
    mime: Imagepng
  ): PNG = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], hasAlpha = hasAlpha.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNG]
  }
  
  @scala.inline
  implicit class PNGOps[Self <: PNG] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClass(value: PNGClass): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstants(value: MIMEPNG): Self = this.set("constants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoders(value: ImagepngDecoderFn): Self = this.set("decoders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoders(value: ImagepngEncoderFn): Self = this.set("encoders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAlpha(value: `0`): Self = this.set("hasAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMime(value: Imagepng): Self = this.set("mime", value.asInstanceOf[js.Any])
  }
}
