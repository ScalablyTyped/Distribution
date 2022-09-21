package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosDeviceFile extends StObject {
  
  /**
    * The bundle id of the app where this file lives. iOS apps sandbox their own filesystem, so app files must specify which app installed on the device.
    */
  var bundleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The source file
    */
  var content: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * Location of the file on the device, inside the app's sandboxed filesystem
    */
  var devicePath: js.UndefOr[String | Null] = js.undefined
}
object SchemaIosDeviceFile {
  
  inline def apply(): SchemaIosDeviceFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosDeviceFile]
  }
  
  extension [Self <: SchemaIosDeviceFile](x: Self) {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setContent(value: SchemaFileReference): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDevicePath(value: String): Self = StObject.set(x, "devicePath", value.asInstanceOf[js.Any])
    
    inline def setDevicePathNull: Self = StObject.set(x, "devicePath", null)
    
    inline def setDevicePathUndefined: Self = StObject.set(x, "devicePath", js.undefined)
  }
}
