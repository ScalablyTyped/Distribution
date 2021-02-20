package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a Quest Criterion resource.
  */
@js.native
trait SchemaQuestCriterion extends StObject {
  
  /**
    * The total number of times the associated event must be incremented for
    * the player to complete this quest.
    */
  var completionContribution: js.UndefOr[SchemaQuestContribution] = js.native
  
  /**
    * The number of increments the player has made toward the completion count
    * event increments required to complete the quest. This value will not
    * exceed the completion contribution. There will be no currentContribution
    * until the player has accepted the quest.
    */
  var currentContribution: js.UndefOr[SchemaQuestContribution] = js.native
  
  /**
    * The ID of the event the criterion corresponds to.
    */
  var eventId: js.UndefOr[String] = js.native
  
  /**
    * The value of the event associated with this quest at the time that the
    * quest was accepted. This value may change if event increments that took
    * place before the start of quest are uploaded after the quest starts.
    * There will be no initialPlayerProgress until the player has accepted the
    * quest.
    */
  var initialPlayerProgress: js.UndefOr[SchemaQuestContribution] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#questCriterion.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaQuestCriterion {
  
  @scala.inline
  def apply(): SchemaQuestCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuestCriterion]
  }
  
  @scala.inline
  implicit class SchemaQuestCriterionMutableBuilder[Self <: SchemaQuestCriterion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionContribution(value: SchemaQuestContribution): Self = StObject.set(x, "completionContribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionContributionUndefined: Self = StObject.set(x, "completionContribution", js.undefined)
    
    @scala.inline
    def setCurrentContribution(value: SchemaQuestContribution): Self = StObject.set(x, "currentContribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentContributionUndefined: Self = StObject.set(x, "currentContribution", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setInitialPlayerProgress(value: SchemaQuestContribution): Self = StObject.set(x, "initialPlayerProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPlayerProgressUndefined: Self = StObject.set(x, "initialPlayerProgress", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
