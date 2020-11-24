package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON request template for moving ChromeOs Device to given OU in Directory
  * Devices API.
  */
@js.native
trait SchemaChromeOsMoveDevicesToOu extends js.Object {
  
  /**
    * ChromeOs Devices to be moved to OU
    */
  var deviceIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaChromeOsMoveDevicesToOu {
  
  @scala.inline
  def apply(): SchemaChromeOsMoveDevicesToOu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsMoveDevicesToOu]
  }
  
  @scala.inline
  implicit class SchemaChromeOsMoveDevicesToOuOps[Self <: SchemaChromeOsMoveDevicesToOu] (val x: Self) extends AnyVal {
    
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
    def setDeviceIdsVarargs(value: String*): Self = this.set("deviceIds", js.Array(value :_*))
    
    @scala.inline
    def setDeviceIds(value: js.Array[String]): Self = this.set("deviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIds: Self = this.set("deviceIds", js.undefined)
  }
}
