package typings.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait csrfOptionsBlacklist extends csrfOptionsBlacklistOrWhitelist {
  
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  
  var whitelist: js.UndefOr[scala.Nothing] = js.native
}
object csrfOptionsBlacklist {
  
  @scala.inline
  def apply(): csrfOptionsBlacklist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[csrfOptionsBlacklist]
  }
  
  @scala.inline
  implicit class csrfOptionsBlacklistOps[Self <: csrfOptionsBlacklist] (val x: Self) extends AnyVal {
    
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
    def setBlacklistVarargs(value: String*): Self = this.set("blacklist", js.Array(value :_*))
    
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
  }
}
