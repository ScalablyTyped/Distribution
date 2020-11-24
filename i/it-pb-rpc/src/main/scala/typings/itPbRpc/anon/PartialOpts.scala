package typings.itPbRpc.anon

import typings.itPbRpc.mod.LengthDecoderFunction
import typings.itPbRpc.mod.LengthEncoderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<it-pb-rpc.it-pb-rpc.Opts> */
@js.native
trait PartialOpts extends js.Object {
  
  var lengthDecoder: js.UndefOr[LengthDecoderFunction] = js.native
  
  var lengthEncoder: js.UndefOr[LengthEncoderFunction] = js.native
  
  var maxDataLength: js.UndefOr[Double] = js.native
  
  var maxLengthLength: js.UndefOr[Double] = js.native
  
  var minPoolSize: js.UndefOr[Double] = js.native
  
  var poolSize: js.UndefOr[Double] = js.native
}
object PartialOpts {
  
  @scala.inline
  def apply(): PartialOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOpts]
  }
  
  @scala.inline
  implicit class PartialOptsOps[Self <: PartialOpts] (val x: Self) extends AnyVal {
    
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
    def setLengthEncoder(value: LengthEncoderFunction): Self = this.set("lengthEncoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthEncoder: Self = this.set("lengthEncoder", js.undefined)
    
    @scala.inline
    def setMaxDataLength(value: Double): Self = this.set("maxDataLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDataLength: Self = this.set("maxDataLength", js.undefined)
    
    @scala.inline
    def setMaxLengthLength(value: Double): Self = this.set("maxLengthLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLengthLength: Self = this.set("maxLengthLength", js.undefined)
    
    @scala.inline
    def setMinPoolSize(value: Double): Self = this.set("minPoolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPoolSize: Self = this.set("minPoolSize", js.undefined)
    
    @scala.inline
    def setPoolSize(value: Double): Self = this.set("poolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolSize: Self = this.set("poolSize", js.undefined)
  }
}
