package typings.lwip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PngBufferParams extends js.Object {
  
  var compression: js.UndefOr[String] = js.native
  
  var interlaced: js.UndefOr[Boolean] = js.native
  
  var transparency: js.UndefOr[Boolean | String] = js.native
}
object PngBufferParams {
  
  @scala.inline
  def apply(): PngBufferParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PngBufferParams]
  }
  
  @scala.inline
  implicit class PngBufferParamsOps[Self <: PngBufferParams] (val x: Self) extends AnyVal {
    
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
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setInterlaced(value: Boolean): Self = this.set("interlaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterlaced: Self = this.set("interlaced", js.undefined)
    
    @scala.inline
    def setTransparency(value: Boolean | String): Self = this.set("transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
  }
}
