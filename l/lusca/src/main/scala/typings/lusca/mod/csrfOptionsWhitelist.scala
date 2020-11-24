package typings.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait csrfOptionsWhitelist extends csrfOptionsBlacklistOrWhitelist {
  
  var blacklist: js.UndefOr[scala.Nothing] = js.native
  
  var whitelist: js.UndefOr[js.Array[String]] = js.native
}
object csrfOptionsWhitelist {
  
  @scala.inline
  def apply(): csrfOptionsWhitelist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[csrfOptionsWhitelist]
  }
  
  @scala.inline
  implicit class csrfOptionsWhitelistOps[Self <: csrfOptionsWhitelist] (val x: Self) extends AnyVal {
    
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
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
}
