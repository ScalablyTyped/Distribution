package typings.jimpTiff.mod

import typings.jimpTiff.anon.Imagetiff
import typings.jimpTiff.anon.ImagetiffDecoderFn
import typings.jimpTiff.anon.ImagetiffEncoderFn
import typings.jimpTiff.anon.MIMETIFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tiff extends js.Object {
  
  var constants: MIMETIFF = js.native
  
  var decoders: ImagetiffDecoderFn = js.native
  
  var encoders: ImagetiffEncoderFn = js.native
  
  var mime: Imagetiff = js.native
}
object Tiff {
  
  @scala.inline
  def apply(constants: MIMETIFF, decoders: ImagetiffDecoderFn, encoders: ImagetiffEncoderFn, mime: Imagetiff): Tiff = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tiff]
  }
  
  @scala.inline
  implicit class TiffOps[Self <: Tiff] (val x: Self) extends AnyVal {
    
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
    def setConstants(value: MIMETIFF): Self = this.set("constants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoders(value: ImagetiffDecoderFn): Self = this.set("decoders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoders(value: ImagetiffEncoderFn): Self = this.set("encoders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMime(value: Imagetiff): Self = this.set("mime", value.asInstanceOf[js.Any])
  }
}
