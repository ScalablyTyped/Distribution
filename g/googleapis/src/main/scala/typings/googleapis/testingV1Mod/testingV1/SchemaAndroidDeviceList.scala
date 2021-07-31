package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of Android device configurations in which the test is to be
  * executed.
  */
trait SchemaAndroidDeviceList extends StObject {
  
  /**
    * Required. A list of Android devices.
    */
  var androidDevices: js.UndefOr[js.Array[SchemaAndroidDevice]] = js.undefined
}
object SchemaAndroidDeviceList {
  
  @scala.inline
  def apply(): SchemaAndroidDeviceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidDeviceList]
  }
  
  @scala.inline
  implicit class SchemaAndroidDeviceListMutableBuilder[Self <: SchemaAndroidDeviceList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidDevices(value: js.Array[SchemaAndroidDevice]): Self = StObject.set(x, "androidDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidDevicesUndefined: Self = StObject.set(x, "androidDevices", js.undefined)
    
    @scala.inline
    def setAndroidDevicesVarargs(value: SchemaAndroidDevice*): Self = StObject.set(x, "androidDevices", js.Array(value :_*))
  }
}
