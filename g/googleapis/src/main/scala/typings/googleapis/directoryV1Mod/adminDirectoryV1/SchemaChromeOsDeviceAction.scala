package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChromeOsDeviceAction extends StObject {
  
  /**
    * Action to be taken on the Chrome OS device.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only used when the action is `deprovision`. With the `deprovision` action, this field is required. *Note*: The deprovision reason is audited because it might have implications on licenses for perpetual subscription customers.
    */
  var deprovisionReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaChromeOsDeviceAction {
  
  inline def apply(): SchemaChromeOsDeviceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsDeviceAction]
  }
  
  extension [Self <: SchemaChromeOsDeviceAction](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDeprovisionReason(value: String): Self = StObject.set(x, "deprovisionReason", value.asInstanceOf[js.Any])
    
    inline def setDeprovisionReasonNull: Self = StObject.set(x, "deprovisionReason", null)
    
    inline def setDeprovisionReasonUndefined: Self = StObject.set(x, "deprovisionReason", js.undefined)
  }
}
