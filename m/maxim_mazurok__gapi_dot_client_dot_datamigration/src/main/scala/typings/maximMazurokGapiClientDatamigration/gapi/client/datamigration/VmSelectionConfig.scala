package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VmSelectionConfig extends StObject {
  
  /** Required. The Google Cloud Platform zone the VM is located. */
  var vmZone: js.UndefOr[String] = js.undefined
}
object VmSelectionConfig {
  
  @scala.inline
  def apply(): VmSelectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmSelectionConfig]
  }
  
  @scala.inline
  implicit class VmSelectionConfigMutableBuilder[Self <: VmSelectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVmZone(value: String): Self = StObject.set(x, "vmZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmZoneUndefined: Self = StObject.set(x, "vmZone", js.undefined)
  }
}
