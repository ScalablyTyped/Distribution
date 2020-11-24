package typings.libp2pNoise.anon

import typings.libp2pNoise.mod.LengthEncoderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  lengthEncoder :libp2p-noise.it-length-prefixed.LengthEncoderFunction}> */
@js.native
trait PartiallengthEncoderLengt extends js.Object {
  
  var lengthEncoder: js.UndefOr[LengthEncoderFunction] = js.native
}
object PartiallengthEncoderLengt {
  
  @scala.inline
  def apply(): PartiallengthEncoderLengt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartiallengthEncoderLengt]
  }
  
  @scala.inline
  implicit class PartiallengthEncoderLengtOps[Self <: PartiallengthEncoderLengt] (val x: Self) extends AnyVal {
    
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
    def setLengthEncoder(value: LengthEncoderFunction): Self = this.set("lengthEncoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthEncoder: Self = this.set("lengthEncoder", js.undefined)
  }
}
