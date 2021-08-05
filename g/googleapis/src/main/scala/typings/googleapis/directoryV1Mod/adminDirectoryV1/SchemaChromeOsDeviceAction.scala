package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON request template for firing actions on ChromeOs Device in Directory
  * Devices API.
  */
trait SchemaChromeOsDeviceAction extends StObject {
  
  /**
    * Action to be taken on the ChromeOs Device
    */
  var action: js.UndefOr[String] = js.undefined
  
  var deprovisionReason: js.UndefOr[String] = js.undefined
}
object SchemaChromeOsDeviceAction {
  
  inline def apply(): SchemaChromeOsDeviceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsDeviceAction]
  }
  
  extension [Self <: SchemaChromeOsDeviceAction](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDeprovisionReason(value: String): Self = StObject.set(x, "deprovisionReason", value.asInstanceOf[js.Any])
    
    inline def setDeprovisionReasonUndefined: Self = StObject.set(x, "deprovisionReason", js.undefined)
  }
}
