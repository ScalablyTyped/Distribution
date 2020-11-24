package typings.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverwriteOptions extends js.Object {
  
  var contentOnly: js.UndefOr[Boolean] = js.native
  
  var storeName: js.UndefOr[Boolean] = js.native
}
object OverwriteOptions {
  
  @scala.inline
  def apply(): OverwriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverwriteOptions]
  }
  
  @scala.inline
  implicit class OverwriteOptionsOps[Self <: OverwriteOptions] (val x: Self) extends AnyVal {
    
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
    def setContentOnly(value: Boolean): Self = this.set("contentOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentOnly: Self = this.set("contentOnly", js.undefined)
    
    @scala.inline
    def setStoreName(value: Boolean): Self = this.set("storeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreName: Self = this.set("storeName", js.undefined)
  }
}
