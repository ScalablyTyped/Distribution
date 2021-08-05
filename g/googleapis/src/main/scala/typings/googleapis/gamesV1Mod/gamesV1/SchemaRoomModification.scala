package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for room modification metadata.
  */
trait SchemaRoomModification extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomModification.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp at which they modified the room, in milliseconds since the
    * epoch in UTC.
    */
  var modifiedTimestampMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the participant that modified the room.
    */
  var participantId: js.UndefOr[String] = js.undefined
}
object SchemaRoomModification {
  
  inline def apply(): SchemaRoomModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomModification]
  }
  
  extension [Self <: SchemaRoomModification](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setModifiedTimestampMillis(value: String): Self = StObject.set(x, "modifiedTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimestampMillisUndefined: Self = StObject.set(x, "modifiedTimestampMillis", js.undefined)
    
    inline def setParticipantId(value: String): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
  }
}
