package typings.jssha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputFormatOptions extends js.Object {
  
  var b64Pad: js.UndefOr[String] = js.native
  
  var outputUpper: js.UndefOr[Boolean] = js.native
  
  var shakeLen: js.UndefOr[Double] = js.native
}
object OutputFormatOptions {
  
  @scala.inline
  def apply(): OutputFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputFormatOptions]
  }
  
  @scala.inline
  implicit class OutputFormatOptionsOps[Self <: OutputFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setB64Pad(value: String): Self = this.set("b64Pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB64Pad: Self = this.set("b64Pad", js.undefined)
    
    @scala.inline
    def setOutputUpper(value: Boolean): Self = this.set("outputUpper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputUpper: Self = this.set("outputUpper", js.undefined)
    
    @scala.inline
    def setShakeLen(value: Double): Self = this.set("shakeLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShakeLen: Self = this.set("shakeLen", js.undefined)
  }
}
