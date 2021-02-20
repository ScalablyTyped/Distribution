package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON request template for firing actions on ChromeOs Device in Directory
  * Devices API.
  */
@js.native
trait SchemaChromeOsDeviceAction extends StObject {
  
  /**
    * Action to be taken on the ChromeOs Device
    */
  var action: js.UndefOr[String] = js.native
  
  var deprovisionReason: js.UndefOr[String] = js.native
}
object SchemaChromeOsDeviceAction {
  
  @scala.inline
  def apply(): SchemaChromeOsDeviceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsDeviceAction]
  }
  
  @scala.inline
  implicit class SchemaChromeOsDeviceActionMutableBuilder[Self <: SchemaChromeOsDeviceAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setDeprovisionReason(value: String): Self = StObject.set(x, "deprovisionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprovisionReasonUndefined: Self = StObject.set(x, "deprovisionReason", js.undefined)
  }
}
