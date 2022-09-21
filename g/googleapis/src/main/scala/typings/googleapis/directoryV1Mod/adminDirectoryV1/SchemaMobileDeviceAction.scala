package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMobileDeviceAction extends StObject {
  
  /**
    * The action to be performed on the device.
    */
  var action: js.UndefOr[String | Null] = js.undefined
}
object SchemaMobileDeviceAction {
  
  inline def apply(): SchemaMobileDeviceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileDeviceAction]
  }
  
  extension [Self <: SchemaMobileDeviceAction](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
  }
}
