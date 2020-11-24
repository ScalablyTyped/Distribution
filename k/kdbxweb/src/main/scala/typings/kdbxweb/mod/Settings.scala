package typings.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  var binaries: js.UndefOr[Boolean] = js.native
  
  var customIcons: js.UndefOr[Boolean] = js.native
  
  var historyRules: js.UndefOr[Boolean] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
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
    def setBinaries(value: Boolean): Self = this.set("binaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaries: Self = this.set("binaries", js.undefined)
    
    @scala.inline
    def setCustomIcons(value: Boolean): Self = this.set("customIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomIcons: Self = this.set("customIcons", js.undefined)
    
    @scala.inline
    def setHistoryRules(value: Boolean): Self = this.set("historyRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryRules: Self = this.set("historyRules", js.undefined)
  }
}
