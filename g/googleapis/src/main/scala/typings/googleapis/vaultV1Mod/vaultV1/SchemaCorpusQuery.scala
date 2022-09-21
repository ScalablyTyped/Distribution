package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCorpusQuery extends StObject {
  
  /**
    * Service-specific options for Drive holds. If set, **CorpusType** must be **DRIVE**.
    */
  var driveQuery: js.UndefOr[SchemaHeldDriveQuery] = js.undefined
  
  /**
    * Service-specific options for Groups holds. If set, **CorpusType** must be **GROUPS**.
    */
  var groupsQuery: js.UndefOr[SchemaHeldGroupsQuery] = js.undefined
  
  /**
    * Service-specific options for Chat holds. If set, **CorpusType** must be **HANGOUTS_CHAT**.
    */
  var hangoutsChatQuery: js.UndefOr[SchemaHeldHangoutsChatQuery] = js.undefined
  
  /**
    * Service-specific options for Gmail holds. If set, **CorpusType** must be **MAIL**.
    */
  var mailQuery: js.UndefOr[SchemaHeldMailQuery] = js.undefined
  
  /**
    * Service-specific options for Voice holds. If set, **CorpusType** must be **VOICE**.
    */
  var voiceQuery: js.UndefOr[SchemaHeldVoiceQuery] = js.undefined
}
object SchemaCorpusQuery {
  
  inline def apply(): SchemaCorpusQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorpusQuery]
  }
  
  extension [Self <: SchemaCorpusQuery](x: Self) {
    
    inline def setDriveQuery(value: SchemaHeldDriveQuery): Self = StObject.set(x, "driveQuery", value.asInstanceOf[js.Any])
    
    inline def setDriveQueryUndefined: Self = StObject.set(x, "driveQuery", js.undefined)
    
    inline def setGroupsQuery(value: SchemaHeldGroupsQuery): Self = StObject.set(x, "groupsQuery", value.asInstanceOf[js.Any])
    
    inline def setGroupsQueryUndefined: Self = StObject.set(x, "groupsQuery", js.undefined)
    
    inline def setHangoutsChatQuery(value: SchemaHeldHangoutsChatQuery): Self = StObject.set(x, "hangoutsChatQuery", value.asInstanceOf[js.Any])
    
    inline def setHangoutsChatQueryUndefined: Self = StObject.set(x, "hangoutsChatQuery", js.undefined)
    
    inline def setMailQuery(value: SchemaHeldMailQuery): Self = StObject.set(x, "mailQuery", value.asInstanceOf[js.Any])
    
    inline def setMailQueryUndefined: Self = StObject.set(x, "mailQuery", js.undefined)
    
    inline def setVoiceQuery(value: SchemaHeldVoiceQuery): Self = StObject.set(x, "voiceQuery", value.asInstanceOf[js.Any])
    
    inline def setVoiceQueryUndefined: Self = StObject.set(x, "voiceQuery", js.undefined)
  }
}
