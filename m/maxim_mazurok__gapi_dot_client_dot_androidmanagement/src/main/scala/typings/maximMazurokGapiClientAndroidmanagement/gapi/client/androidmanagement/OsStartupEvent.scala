package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OsStartupEvent extends StObject {
  
  /** Verified Boot state. */
  var verifiedBootState: js.UndefOr[String] = js.undefined
  
  /** dm-verity mode. */
  var verityMode: js.UndefOr[String] = js.undefined
}
object OsStartupEvent {
  
  inline def apply(): OsStartupEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OsStartupEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OsStartupEvent] (val x: Self) extends AnyVal {
    
    inline def setVerifiedBootState(value: String): Self = StObject.set(x, "verifiedBootState", value.asInstanceOf[js.Any])
    
    inline def setVerifiedBootStateUndefined: Self = StObject.set(x, "verifiedBootState", js.undefined)
    
    inline def setVerityMode(value: String): Self = StObject.set(x, "verityMode", value.asInstanceOf[js.Any])
    
    inline def setVerityModeUndefined: Self = StObject.set(x, "verityMode", js.undefined)
  }
}
