package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceInfo extends StObject {
  
  /**
    * Device hardware version.
    */
  var hwVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Device manufacturer.
    */
  var manufacturer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Device model.
    */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Device software version.
    */
  var swVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceInfo {
  
  inline def apply(): SchemaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceInfo]
  }
  
  extension [Self <: SchemaDeviceInfo](x: Self) {
    
    inline def setHwVersion(value: String): Self = StObject.set(x, "hwVersion", value.asInstanceOf[js.Any])
    
    inline def setHwVersionNull: Self = StObject.set(x, "hwVersion", null)
    
    inline def setHwVersionUndefined: Self = StObject.set(x, "hwVersion", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setSwVersion(value: String): Self = StObject.set(x, "swVersion", value.asInstanceOf[js.Any])
    
    inline def setSwVersionNull: Self = StObject.set(x, "swVersion", null)
    
    inline def setSwVersionUndefined: Self = StObject.set(x, "swVersion", js.undefined)
  }
}
