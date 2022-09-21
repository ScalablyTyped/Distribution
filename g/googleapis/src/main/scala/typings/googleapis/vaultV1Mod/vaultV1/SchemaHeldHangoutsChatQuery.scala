package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHeldHangoutsChatQuery extends StObject {
  
  /**
    * To include messages in Chat spaces the user was a member of, set to **true**.
    */
  var includeRooms: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaHeldHangoutsChatQuery {
  
  inline def apply(): SchemaHeldHangoutsChatQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldHangoutsChatQuery]
  }
  
  extension [Self <: SchemaHeldHangoutsChatQuery](x: Self) {
    
    inline def setIncludeRooms(value: Boolean): Self = StObject.set(x, "includeRooms", value.asInstanceOf[js.Any])
    
    inline def setIncludeRoomsNull: Self = StObject.set(x, "includeRooms", null)
    
    inline def setIncludeRoomsUndefined: Self = StObject.set(x, "includeRooms", js.undefined)
  }
}
