package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInfo extends StObject {
  
  /** Information of a blue-green upgrade. */
  var blueGreenInfo: js.UndefOr[BlueGreenInfo] = js.undefined
}
object UpdateInfo {
  
  inline def apply(): UpdateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateInfo] (val x: Self) extends AnyVal {
    
    inline def setBlueGreenInfo(value: BlueGreenInfo): Self = StObject.set(x, "blueGreenInfo", value.asInstanceOf[js.Any])
    
    inline def setBlueGreenInfoUndefined: Self = StObject.set(x, "blueGreenInfo", js.undefined)
  }
}
