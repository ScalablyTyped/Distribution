package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMemberId extends StObject {
  
  /**
    * Unique, immutable ID of the Roster.
    */
  var rosterId: js.UndefOr[SchemaRosterId] = js.undefined
  
  /**
    * Unique, immutable ID of the User.
    */
  var userId: js.UndefOr[SchemaUserId] = js.undefined
}
object SchemaMemberId {
  
  inline def apply(): SchemaMemberId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemberId]
  }
  
  extension [Self <: SchemaMemberId](x: Self) {
    
    inline def setRosterId(value: SchemaRosterId): Self = StObject.set(x, "rosterId", value.asInstanceOf[js.Any])
    
    inline def setRosterIdUndefined: Self = StObject.set(x, "rosterId", js.undefined)
    
    inline def setUserId(value: SchemaUserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
