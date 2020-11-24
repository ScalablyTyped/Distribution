package typings.ipAddress.ipv6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseFormOptions extends js.Object {
  
  var omitSuffix: js.UndefOr[Boolean] = js.native
}
object ReverseFormOptions {
  
  @scala.inline
  def apply(): ReverseFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReverseFormOptions]
  }
  
  @scala.inline
  implicit class ReverseFormOptionsOps[Self <: ReverseFormOptions] (val x: Self) extends AnyVal {
    
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
    def setOmitSuffix(value: Boolean): Self = this.set("omitSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitSuffix: Self = this.set("omitSuffix", js.undefined)
  }
}
