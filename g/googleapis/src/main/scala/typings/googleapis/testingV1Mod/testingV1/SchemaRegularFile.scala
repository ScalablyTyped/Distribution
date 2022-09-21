package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegularFile extends StObject {
  
  /**
    * Required. The source file.
    */
  var content: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * Required. Where to put the content on the device. Must be an absolute, allowlisted path. If the file exists, it will be replaced. The following device-side directories and any of their subdirectories are allowlisted: ${EXTERNAL_STORAGE\}, /sdcard, or /storage ${ANDROID_DATA\}/local/tmp, or /data/local/tmp Specifying a path outside of these directory trees is invalid. The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device and copy the file there. It is strongly advised to use the Environment API in app and test code to access files on the device in a portable way.
    */
  var devicePath: js.UndefOr[String | Null] = js.undefined
}
object SchemaRegularFile {
  
  inline def apply(): SchemaRegularFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegularFile]
  }
  
  extension [Self <: SchemaRegularFile](x: Self) {
    
    inline def setContent(value: SchemaFileReference): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDevicePath(value: String): Self = StObject.set(x, "devicePath", value.asInstanceOf[js.Any])
    
    inline def setDevicePathNull: Self = StObject.set(x, "devicePath", null)
    
    inline def setDevicePathUndefined: Self = StObject.set(x, "devicePath", js.undefined)
  }
}
