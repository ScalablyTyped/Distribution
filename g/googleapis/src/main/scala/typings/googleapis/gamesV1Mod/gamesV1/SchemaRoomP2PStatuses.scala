package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an update on the status of peers in a room.
  */
trait SchemaRoomP2PStatuses extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomP2PStatuses.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The updates for the peers.
    */
  var updates: js.UndefOr[js.Array[SchemaRoomP2PStatus]] = js.undefined
}
object SchemaRoomP2PStatuses {
  
  inline def apply(): SchemaRoomP2PStatuses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomP2PStatuses]
  }
  
  extension [Self <: SchemaRoomP2PStatuses](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUpdates(value: js.Array[SchemaRoomP2PStatus]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    inline def setUpdatesVarargs(value: SchemaRoomP2PStatus*): Self = StObject.set(x, "updates", js.Array(value :_*))
  }
}
