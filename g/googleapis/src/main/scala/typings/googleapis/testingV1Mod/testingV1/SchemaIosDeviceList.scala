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
  
  inline def apply(): SchemaIosDeviceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosDeviceList]
  }
  
  extension [Self <: SchemaIosDeviceList](x: Self) {
    
    inline def setIosDevices(value: js.Array[SchemaIosDevice]): Self = StObject.set(x, "iosDevices", value.asInstanceOf[js.Any])
    
    inline def setIosDevicesUndefined: Self = StObject.set(x, "iosDevices", js.undefined)
    
    inline def setIosDevicesVarargs(value: SchemaIosDevice*): Self = StObject.set(x, "iosDevices", js.Array(value :_*))
  }
}
