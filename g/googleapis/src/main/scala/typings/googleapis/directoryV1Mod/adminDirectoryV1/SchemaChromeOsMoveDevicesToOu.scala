package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChromeOsMoveDevicesToOu extends StObject {
  
  /**
    * Chrome OS devices to be moved to OU
    */
  var deviceIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaChromeOsMoveDevicesToOu {
  
  inline def apply(): SchemaChromeOsMoveDevicesToOu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsMoveDevicesToOu]
  }
  
  extension [Self <: SchemaChromeOsMoveDevicesToOu](x: Self) {
    
    inline def setDeviceIds(value: js.Array[String]): Self = StObject.set(x, "deviceIds", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdsNull: Self = StObject.set(x, "deviceIds", null)
    
    inline def setDeviceIdsUndefined: Self = StObject.set(x, "deviceIds", js.undefined)
    
    inline def setDeviceIdsVarargs(value: String*): Self = StObject.set(x, "deviceIds", js.Array(value*))
  }
}
