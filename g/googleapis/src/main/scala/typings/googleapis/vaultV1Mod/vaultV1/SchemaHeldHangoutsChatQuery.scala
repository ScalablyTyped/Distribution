package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Query options for hangouts chat holds.
  */
trait SchemaHeldHangoutsChatQuery extends StObject {
  
  /**
    * If true, include rooms the user has participated in.
    */
  var includeRooms: js.UndefOr[Boolean] = js.undefined
}
object SchemaHeldHangoutsChatQuery {
  
  inline def apply(): SchemaHeldHangoutsChatQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldHangoutsChatQuery]
  }
  
  extension [Self <: SchemaHeldHangoutsChatQuery](x: Self) {
    
    inline def setIncludeRooms(value: Boolean): Self = StObject.set(x, "includeRooms", value.asInstanceOf[js.Any])
    
    inline def setIncludeRoomsUndefined: Self = StObject.set(x, "includeRooms", js.undefined)
  }
}
