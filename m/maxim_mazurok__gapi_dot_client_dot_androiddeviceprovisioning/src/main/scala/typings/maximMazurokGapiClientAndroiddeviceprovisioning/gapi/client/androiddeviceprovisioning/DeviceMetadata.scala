package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMetadata extends StObject {
  
  /** Metadata entries recorded as key-value pairs. */
  var entries: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientAndroiddeviceprovisioning.maximMazurokGapiClientAndroiddeviceprovisioningStrings.DeviceMetadata & TopLevel[js.Any]
  ] = js.undefined
}
object DeviceMetadata {
  
  @scala.inline
  def apply(): DeviceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMetadata]
  }
  
  @scala.inline
  implicit class DeviceMetadataMutableBuilder[Self <: DeviceMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientAndroiddeviceprovisioning.maximMazurokGapiClientAndroiddeviceprovisioningStrings.DeviceMetadata & TopLevel[js.Any]
    ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
  }
}
