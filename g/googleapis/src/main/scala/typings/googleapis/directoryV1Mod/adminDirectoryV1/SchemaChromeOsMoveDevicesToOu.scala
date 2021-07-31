package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON request template for moving ChromeOs Device to given OU in Directory
  * Devices API.
  */
trait SchemaChromeOsMoveDevicesToOu extends StObject {
  
  /**
    * ChromeOs Devices to be moved to OU
    */
  var deviceIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaChromeOsMoveDevicesToOu {
  
  @scala.inline
  def apply(): SchemaChromeOsMoveDevicesToOu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsMoveDevicesToOu]
  }
  
  @scala.inline
  implicit class SchemaChromeOsMoveDevicesToOuMutableBuilder[Self <: SchemaChromeOsMoveDevicesToOu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceIds(value: js.Array[String]): Self = StObject.set(x, "deviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdsUndefined: Self = StObject.set(x, "deviceIds", js.undefined)
    
    @scala.inline
    def setDeviceIdsVarargs(value: String*): Self = StObject.set(x, "deviceIds", js.Array(value :_*))
  }
}
