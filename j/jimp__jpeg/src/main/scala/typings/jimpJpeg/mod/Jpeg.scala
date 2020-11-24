package typings.jimpJpeg.mod

import typings.jimpJpeg.anon.Imagejpeg
import typings.jimpJpeg.anon.ImagejpegDecoderFn
import typings.jimpJpeg.anon.ImagejpegEncoderFn
import typings.jimpJpeg.anon.MIMEJPEG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jpeg extends js.Object {
  
  var `class`: JpegClass = js.native
  
  var constants: MIMEJPEG = js.native
  
  var decoders: ImagejpegDecoderFn = js.native
  
  var encoders: ImagejpegEncoderFn = js.native
  
  var mime: Imagejpeg = js.native
}
object Jpeg {
  
  @scala.inline
  def apply(
    `class`: JpegClass,
    constants: MIMEJPEG,
    decoders: ImagejpegDecoderFn,
    encoders: ImagejpegEncoderFn,
    mime: Imagejpeg
  ): Jpeg = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jpeg]
  }
  
  @scala.inline
  implicit class JpegOps[Self <: Jpeg] (val x: Self) extends AnyVal {
    
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
    def setClass(value: JpegClass): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstants(value: MIMEJPEG): Self = this.set("constants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoders(value: ImagejpegDecoderFn): Self = this.set("decoders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoders(value: ImagejpegEncoderFn): Self = this.set("encoders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMime(value: Imagejpeg): Self = this.set("mime", value.asInstanceOf[js.Any])
  }
}
