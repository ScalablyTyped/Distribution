package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Device information collected from the job seeker, candidate, or other
  * entity conducting the job search. Providing this information improves the
  * quality of the search results across devices.
  */
@js.native
trait SchemaDeviceInfo extends js.Object {
  
  /**
    * Optional.  Type of the device.
    */
  var deviceType: js.UndefOr[String] = js.native
  
  /**
    * Optional.  A device-specific ID. The ID must be a unique identifier that
    * distinguishes the device from other devices.
    */
  var id: js.UndefOr[String] = js.native
}
object SchemaDeviceInfo {
  
  @scala.inline
  def apply(): SchemaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceInfo]
  }
  
  @scala.inline
  implicit class SchemaDeviceInfoOps[Self <: SchemaDeviceInfo] (val x: Self) extends AnyVal {
    
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
    def setDeviceType(value: String): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceType: Self = this.set("deviceType", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
