package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteMemberId extends StObject {
  
  /** Unique, immutable ID of the Roster. */
  var rosterId: js.UndefOr[AppsDynamiteRosterId] = js.undefined
  
  /** Unique, immutable ID of the User. */
  var userId: js.UndefOr[AppsDynamiteUserId] = js.undefined
}
object AppsDynamiteMemberId {
  
  inline def apply(): AppsDynamiteMemberId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteMemberId]
  }
  
  extension [Self <: AppsDynamiteMemberId](x: Self) {
    
    inline def setRosterId(value: AppsDynamiteRosterId): Self = StObject.set(x, "rosterId", value.asInstanceOf[js.Any])
    
    inline def setRosterIdUndefined: Self = StObject.set(x, "rosterId", js.undefined)
    
    inline def setUserId(value: AppsDynamiteUserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
