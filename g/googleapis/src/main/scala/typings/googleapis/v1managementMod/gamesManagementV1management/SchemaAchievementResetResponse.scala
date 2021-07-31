package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an achievement reset response.
  */
trait SchemaAchievementResetResponse extends StObject {
  
  /**
    * The current state of the achievement. This is the same as the initial
    * state of the achievement. Possible values are:   - &quot;HIDDEN&quot;-
    * Achievement is hidden.  - &quot;REVEALED&quot; - Achievement is revealed.
    * - &quot;UNLOCKED&quot; - Achievement is unlocked.
    */
  var currentState: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of an achievement for which player state has been updated.
    */
  var definitionId: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#achievementResetResponse.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Flag to indicate if the requested update actually occurred.
    */
  var updateOccurred: js.UndefOr[Boolean] = js.undefined
}
object SchemaAchievementResetResponse {
  
  @scala.inline
  def apply(): SchemaAchievementResetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementResetResponse]
  }
  
  @scala.inline
  implicit class SchemaAchievementResetResponseMutableBuilder[Self <: SchemaAchievementResetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    @scala.inline
    def setDefinitionId(value: String): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionIdUndefined: Self = StObject.set(x, "definitionId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUpdateOccurred(value: Boolean): Self = StObject.set(x, "updateOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOccurredUndefined: Self = StObject.set(x, "updateOccurred", js.undefined)
  }
}
