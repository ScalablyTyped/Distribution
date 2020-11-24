package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of Android device configurations in which the test is to be
  * executed.
  */
@js.native
trait SchemaAndroidDeviceList extends js.Object {
  
  /**
    * Required. A list of Android devices.
    */
  var androidDevices: js.UndefOr[js.Array[SchemaAndroidDevice]] = js.native
}
object SchemaAndroidDeviceList {
  
  @scala.inline
  def apply(): SchemaAndroidDeviceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidDeviceList]
  }
  
  @scala.inline
  implicit class SchemaAndroidDeviceListOps[Self <: SchemaAndroidDeviceList] (val x: Self) extends AnyVal {
    
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
    def setAndroidDevicesVarargs(value: SchemaAndroidDevice*): Self = this.set("androidDevices", js.Array(value :_*))
    
    @scala.inline
    def setAndroidDevices(value: js.Array[SchemaAndroidDevice]): Self = this.set("androidDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidDevices: Self = this.set("androidDevices", js.undefined)
  }
}
