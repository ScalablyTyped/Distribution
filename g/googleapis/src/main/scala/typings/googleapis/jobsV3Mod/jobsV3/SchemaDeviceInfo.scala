package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Device information collected from the job seeker, candidate, or other
  * entity conducting the job search. Providing this information improves the
  * quality of the search results across devices.
  */
@js.native
trait SchemaDeviceInfo extends StObject {
  
  /**
    * Optional.  Type of the device.
    */
  var deviceType: js.UndefOr[String] = js.native
  
  /**
    * Optional.  A device-specific ID. The ID must be a unique identifier that
    * distinguishes the device from other devices.
    */
  var id: js.UndefOr[String] = js.native
}
object SchemaDeviceInfo {
  
  @scala.inline
  def apply(): SchemaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceInfo]
  }
  
  @scala.inline
  implicit class SchemaDeviceInfoMutableBuilder[Self <: SchemaDeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
