package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for turn-based match modification metadata.
  */
trait SchemaTurnBasedMatchModification extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchModification.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp at which they modified the match, in milliseconds since the
    * epoch in UTC.
    */
  var modifiedTimestampMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the participant that modified the match.
    */
  var participantId: js.UndefOr[String] = js.undefined
}
object SchemaTurnBasedMatchModification {
  
  inline def apply(): SchemaTurnBasedMatchModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchModification]
  }
  
  extension [Self <: SchemaTurnBasedMatchModification](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setModifiedTimestampMillis(value: String): Self = StObject.set(x, "modifiedTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimestampMillisUndefined: Self = StObject.set(x, "modifiedTimestampMillis", js.undefined)
    
    inline def setParticipantId(value: String): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
  }
}
