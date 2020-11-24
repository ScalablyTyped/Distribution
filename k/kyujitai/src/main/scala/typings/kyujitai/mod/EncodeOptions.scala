package typings.kyujitai.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodeOptions extends js.Object {
  
  /**
    * `true` if you want to allow IVS for the encoded string
    * @default false
    */
  var IVD: js.UndefOr[Boolean] = js.native
}
object EncodeOptions {
  
  @scala.inline
  def apply(): EncodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodeOptions]
  }
  
  @scala.inline
  implicit class EncodeOptionsOps[Self <: EncodeOptions] (val x: Self) extends AnyVal {
    
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
    def setIVD(value: Boolean): Self = this.set("IVD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIVD: Self = this.set("IVD", js.undefined)
  }
}
