package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON request template for firing commands on Mobile Device in Directory
  * Devices API.
  */
trait SchemaMobileDeviceAction extends StObject {
  
  /**
    * Action to be taken on the Mobile Device
    */
  var action: js.UndefOr[String] = js.undefined
}
object SchemaMobileDeviceAction {
  
  @scala.inline
  def apply(): SchemaMobileDeviceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileDeviceAction]
  }
  
  @scala.inline
  implicit class SchemaMobileDeviceActionMutableBuilder[Self <: SchemaMobileDeviceAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
  }
}
