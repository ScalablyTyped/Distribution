package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskInstantiationConfig extends StObject {
  
  /** Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance). */
  var autoDelete: js.UndefOr[Boolean] = js.undefined
  
  /** The custom source image to be used to restore this disk when instantiating this instance template. */
  var customImage: js.UndefOr[String] = js.undefined
  
  /** Specifies the device name of the disk to which the configurations apply to. */
  var deviceName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance's corresponding
    * disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance's corresponding
    * disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional
    * read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional
    * read-write disks, local SSDs, and read-only disks.
    */
  var instantiateFrom: js.UndefOr[String] = js.undefined
}
object DiskInstantiationConfig {
  
  inline def apply(): DiskInstantiationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskInstantiationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiskInstantiationConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
    
    inline def setCustomImage(value: String): Self = StObject.set(x, "customImage", value.asInstanceOf[js.Any])
    
    inline def setCustomImageUndefined: Self = StObject.set(x, "customImage", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setInstantiateFrom(value: String): Self = StObject.set(x, "instantiateFrom", value.asInstanceOf[js.Any])
    
    inline def setInstantiateFromUndefined: Self = StObject.set(x, "instantiateFrom", js.undefined)
  }
}
