package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAchievementResetResponse extends StObject {
  
  /**
    * The current state of the achievement. This is the same as the initial state of the achievement. Possible values are: - "`HIDDEN`"- Achievement is hidden. - "`REVEALED`" - Achievement is revealed. - "`UNLOCKED`" - Achievement is unlocked.
    */
  var currentState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of an achievement for which player state has been updated.
    */
  var definitionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#achievementResetResponse`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flag to indicate if the requested update actually occurred.
    */
  var updateOccurred: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAchievementResetResponse {
  
  inline def apply(): SchemaAchievementResetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementResetResponse]
  }
  
  extension [Self <: SchemaAchievementResetResponse](x: Self) {
    
    inline def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateNull: Self = StObject.set(x, "currentState", null)
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    inline def setDefinitionId(value: String): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setDefinitionIdNull: Self = StObject.set(x, "definitionId", null)
    
    inline def setDefinitionIdUndefined: Self = StObject.set(x, "definitionId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUpdateOccurred(value: Boolean): Self = StObject.set(x, "updateOccurred", value.asInstanceOf[js.Any])
    
    inline def setUpdateOccurredNull: Self = StObject.set(x, "updateOccurred", null)
    
    inline def setUpdateOccurredUndefined: Self = StObject.set(x, "updateOccurred", js.undefined)
  }
}
