package typings.handsontable.mod.Handsontable.autoColumnSize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  var syncLimit: js.UndefOr[String | Double] = js.native
  
  var useHeaders: js.UndefOr[Boolean] = js.native
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
    def setSyncLimit(value: String | Double): Self = this.set("syncLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncLimit: Self = this.set("syncLimit", js.undefined)
    
    @scala.inline
    def setUseHeaders(value: Boolean): Self = this.set("useHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHeaders: Self = this.set("useHeaders", js.undefined)
  }
}
