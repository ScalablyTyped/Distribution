package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHangoutsChatOptions extends StObject {
  
  /**
    * For searches by account or organizational unit, set to **true** to include rooms.
    */
  var includeRooms: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaHangoutsChatOptions {
  
  inline def apply(): SchemaHangoutsChatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHangoutsChatOptions]
  }
  
  extension [Self <: SchemaHangoutsChatOptions](x: Self) {
    
    inline def setIncludeRooms(value: Boolean): Self = StObject.set(x, "includeRooms", value.asInstanceOf[js.Any])
    
    inline def setIncludeRoomsNull: Self = StObject.set(x, "includeRooms", null)
    
    inline def setIncludeRoomsUndefined: Self = StObject.set(x, "includeRooms", js.undefined)
  }
}
