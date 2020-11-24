package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMigrate extends js.Object {
  
  var autoMigrate: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
}
object AutoMigrate {
  
  @scala.inline
  def apply(): AutoMigrate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMigrate]
  }
  
  @scala.inline
  implicit class AutoMigrateOps[Self <: AutoMigrate] (val x: Self) extends AnyVal {
    
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
    def setAutoMigrate(value: Boolean): Self = this.set("autoMigrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMigrate: Self = this.set("autoMigrate", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
