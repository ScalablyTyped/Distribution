package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HexOptions extends js.Object {
  
  /**
    * hex decoded representation must be byte aligned.
    * @default false
    */
  var byteAligned: js.UndefOr[Boolean] = js.native
}
object HexOptions {
  
  @scala.inline
  def apply(): HexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HexOptions]
  }
  
  @scala.inline
  implicit class HexOptionsOps[Self <: HexOptions] (val x: Self) extends AnyVal {
    
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
    def setByteAligned(value: Boolean): Self = this.set("byteAligned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteAligned: Self = this.set("byteAligned", js.undefined)
  }
}
