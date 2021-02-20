package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * volumeDevice describes a mapping of a raw block device within a container.
  */
@js.native
trait SchemaVolumeDevice extends StObject {
  
  /**
    * devicePath is the path inside of the container that the device will be
    * mapped to.
    */
  var devicePath: js.UndefOr[String] = js.native
  
  /**
    * name must match the name of a persistentVolumeClaim in the pod
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaVolumeDevice {
  
  @scala.inline
  def apply(): SchemaVolumeDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeDevice]
  }
  
  @scala.inline
  implicit class SchemaVolumeDeviceMutableBuilder[Self <: SchemaVolumeDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicePath(value: String): Self = StObject.set(x, "devicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePathUndefined: Self = StObject.set(x, "devicePath", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
