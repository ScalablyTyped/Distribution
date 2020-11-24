package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of iOS device configurations in which the test is to be executed.
  */
@js.native
trait SchemaIosDeviceList extends js.Object {
  
  /**
    * Required. A list of iOS devices.
    */
  var iosDevices: js.UndefOr[js.Array[SchemaIosDevice]] = js.native
}
object SchemaIosDeviceList {
  
  @scala.inline
  def apply(): SchemaIosDeviceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosDeviceList]
  }
  
  @scala.inline
  implicit class SchemaIosDeviceListOps[Self <: SchemaIosDeviceList] (val x: Self) extends AnyVal {
    
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
    def setIosDevicesVarargs(value: SchemaIosDevice*): Self = this.set("iosDevices", js.Array(value :_*))
    
    @scala.inline
    def setIosDevices(value: js.Array[SchemaIosDevice]): Self = this.set("iosDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosDevices: Self = this.set("iosDevices", js.undefined)
  }
}
