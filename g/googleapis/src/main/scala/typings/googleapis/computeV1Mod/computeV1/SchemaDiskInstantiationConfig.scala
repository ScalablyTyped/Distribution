package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A specification of the desired way to instantiate a disk in the instance
  * template when its created from a source instance.
  */
@js.native
trait SchemaDiskInstantiationConfig extends StObject {
  
  /**
    * Specifies whether the disk will be auto-deleted when the instance is
    * deleted (but not when the disk is detached from the instance).
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  
  /**
    * The custom source image to be used to restore this disk when
    * instantiating this instance template.
    */
  var customImage: js.UndefOr[String] = js.native
  
  /**
    * Specifies the device name of the disk to which the configurations apply
    * to.
    */
  var deviceName: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether to include the disk and what image to use. Possible
    * values are:   - source-image: to use the same image that was used to
    * create the source instance&#39;s corresponding disk. Applicable to the
    * boot disk and additional read-write disks.  - source-image-family: to use
    * the same image family that was used to create the source instance&#39;s
    * corresponding disk. Applicable to the boot disk and additional read-write
    * disks.  - custom-image: to use a user-provided image url for disk
    * creation. Applicable to the boot disk and additional read-write disks.  -
    * attach-read-only: to attach a read-only disk. Applicable to read-only
    * disks.  - do-not-include: to exclude a disk from the template. Applicable
    * to additional read-write disks, local SSDs, and read-only disks.
    */
  var instantiateFrom: js.UndefOr[String] = js.native
}
object SchemaDiskInstantiationConfig {
  
  @scala.inline
  def apply(): SchemaDiskInstantiationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskInstantiationConfig]
  }
  
  @scala.inline
  implicit class SchemaDiskInstantiationConfigMutableBuilder[Self <: SchemaDiskInstantiationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
    
    @scala.inline
    def setCustomImage(value: String): Self = StObject.set(x, "customImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomImageUndefined: Self = StObject.set(x, "customImage", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setInstantiateFrom(value: String): Self = StObject.set(x, "instantiateFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstantiateFromUndefined: Self = StObject.set(x, "instantiateFrom", js.undefined)
  }
}
