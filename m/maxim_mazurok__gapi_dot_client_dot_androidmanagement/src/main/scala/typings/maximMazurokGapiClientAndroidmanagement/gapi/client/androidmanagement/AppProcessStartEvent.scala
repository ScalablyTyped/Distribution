package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppProcessStartEvent extends StObject {
  
  /** Information about a process. */
  var processInfo: js.UndefOr[AppProcessInfo] = js.undefined
}
object AppProcessStartEvent {
  
  inline def apply(): AppProcessStartEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppProcessStartEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppProcessStartEvent] (val x: Self) extends AnyVal {
    
    inline def setProcessInfo(value: AppProcessInfo): Self = StObject.set(x, "processInfo", value.asInstanceOf[js.Any])
    
    inline def setProcessInfoUndefined: Self = StObject.set(x, "processInfo", js.undefined)
  }
}
