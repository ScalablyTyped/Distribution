package typings.jimpGif.mod

import typings.jimpGif.anon.Imagegif
import typings.jimpGif.anon.ImagegifDecoderFn
import typings.jimpGif.anon.MIMEGIF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gif extends js.Object {
  
  var constants: MIMEGIF = js.native
  
  var decoders: ImagegifDecoderFn = js.native
  
  var mime: Imagegif = js.native
}
object Gif {
  
  @scala.inline
  def apply(constants: MIMEGIF, decoders: ImagegifDecoderFn, mime: Imagegif): Gif = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gif]
  }
  
  @scala.inline
  implicit class GifOps[Self <: Gif] (val x: Self) extends AnyVal {
    
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
    def setConstants(value: MIMEGIF): Self = this.set("constants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoders(value: ImagegifDecoderFn): Self = this.set("decoders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMime(value: Imagegif): Self = this.set("mime", value.asInstanceOf[js.Any])
  }
}
