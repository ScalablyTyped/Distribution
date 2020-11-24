package typings.libp2pNoise.anon

import typings.libp2pNoise.mod.LengthDecoderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-noise.it-length-prefixed.DecoderOptions> */
@js.native
trait PartialDecoderOptions extends js.Object {
  
  var lengthDecoder: js.UndefOr[LengthDecoderFunction] = js.native
  
  var maxDataLength: js.UndefOr[Double] = js.native
  
  var maxLengthLength: js.UndefOr[Double] = js.native
}
object PartialDecoderOptions {
  
  @scala.inline
  def apply(): PartialDecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDecoderOptions]
  }
  
  @scala.inline
  implicit class PartialDecoderOptionsOps[Self <: PartialDecoderOptions] (val x: Self) extends AnyVal {
    
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
    def setLengthDecoder(value: LengthDecoderFunction): Self = this.set("lengthDecoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthDecoder: Self = this.set("lengthDecoder", js.undefined)
    
    @scala.inline
    def setMaxDataLength(value: Double): Self = this.set("maxDataLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDataLength: Self = this.set("maxDataLength", js.undefined)
    
    @scala.inline
    def setMaxLengthLength(value: Double): Self = this.set("maxLengthLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLengthLength: Self = this.set("maxLengthLength", js.undefined)
  }
}
