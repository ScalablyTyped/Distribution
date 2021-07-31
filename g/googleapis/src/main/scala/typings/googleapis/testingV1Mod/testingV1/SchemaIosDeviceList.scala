package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of iOS device configurations in which the test is to be executed.
  */
trait SchemaIosDeviceList extends StObject {
  
  /**
    * Required. A list of iOS devices.
    */
  var iosDevices: js.UndefOr[js.Array[SchemaIosDevice]] = js.undefined
}
object SchemaIosDeviceList {
  
  @scala.inline
  def apply(): SchemaIosDeviceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosDeviceList]
  }
  
  @scala.inline
  implicit class SchemaIosDeviceListMutableBuilder[Self <: SchemaIosDeviceList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIosDevices(value: js.Array[SchemaIosDevice]): Self = StObject.set(x, "iosDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosDevicesUndefined: Self = StObject.set(x, "iosDevices", js.undefined)
    
    @scala.inline
    def setIosDevicesVarargs(value: SchemaIosDevice*): Self = StObject.set(x, "iosDevices", js.Array(value :_*))
  }
}
