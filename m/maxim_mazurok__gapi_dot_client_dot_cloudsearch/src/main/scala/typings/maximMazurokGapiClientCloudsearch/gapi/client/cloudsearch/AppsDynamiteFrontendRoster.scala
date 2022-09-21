package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteFrontendRoster extends StObject {
  
  var avatarUrl: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[AppsDynamiteRosterId] = js.undefined
  
  var membershipCount: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /** Roster gaia key, usually an email address. Set in looking up rosters response. */
  var rosterGaiaKey: js.UndefOr[String] = js.undefined
  
  /** Roster deletion state - considered active unless set to deleted */
  var rosterState: js.UndefOr[String] = js.undefined
}
object AppsDynamiteFrontendRoster {
  
  inline def apply(): AppsDynamiteFrontendRoster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteFrontendRoster]
  }
  
  extension [Self <: AppsDynamiteFrontendRoster](x: Self) {
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
    
    inline def setId(value: AppsDynamiteRosterId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMembershipCount(value: Double): Self = StObject.set(x, "membershipCount", value.asInstanceOf[js.Any])
    
    inline def setMembershipCountUndefined: Self = StObject.set(x, "membershipCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRosterGaiaKey(value: String): Self = StObject.set(x, "rosterGaiaKey", value.asInstanceOf[js.Any])
    
    inline def setRosterGaiaKeyUndefined: Self = StObject.set(x, "rosterGaiaKey", js.undefined)
    
    inline def setRosterState(value: String): Self = StObject.set(x, "rosterState", value.asInstanceOf[js.Any])
    
    inline def setRosterStateUndefined: Self = StObject.set(x, "rosterState", js.undefined)
  }
}
