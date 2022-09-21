package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoster extends StObject {
  
  var avatarUrl: js.UndefOr[String | Null] = js.undefined
  
  var id: js.UndefOr[SchemaRosterId] = js.undefined
  
  var membershipCount: js.UndefOr[Double | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Roster gaia key, usually an email address. Set in looking up rosters response.
    */
  var rosterGaiaKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Roster deletion state - considered active unless set to deleted
    */
  var rosterState: js.UndefOr[String | Null] = js.undefined
}
object SchemaRoster {
  
  inline def apply(): SchemaRoster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoster]
  }
  
  extension [Self <: SchemaRoster](x: Self) {
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setAvatarUrlNull: Self = StObject.set(x, "avatarUrl", null)
    
    inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
    
    inline def setId(value: SchemaRosterId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMembershipCount(value: Double): Self = StObject.set(x, "membershipCount", value.asInstanceOf[js.Any])
    
    inline def setMembershipCountNull: Self = StObject.set(x, "membershipCount", null)
    
    inline def setMembershipCountUndefined: Self = StObject.set(x, "membershipCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRosterGaiaKey(value: String): Self = StObject.set(x, "rosterGaiaKey", value.asInstanceOf[js.Any])
    
    inline def setRosterGaiaKeyNull: Self = StObject.set(x, "rosterGaiaKey", null)
    
    inline def setRosterGaiaKeyUndefined: Self = StObject.set(x, "rosterGaiaKey", js.undefined)
    
    inline def setRosterState(value: String): Self = StObject.set(x, "rosterState", value.asInstanceOf[js.Any])
    
    inline def setRosterStateNull: Self = StObject.set(x, "rosterState", null)
    
    inline def setRosterStateUndefined: Self = StObject.set(x, "rosterState", js.undefined)
  }
}
