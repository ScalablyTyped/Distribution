package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a Quest Milestone resource.
  */
@js.native
trait SchemaQuestMilestone extends StObject {
  
  /**
    * The completion reward data of the milestone, represented as a
    * Base64-encoded string. This is a developer-specified binary blob with
    * size between 0 and 2 KB before encoding.
    */
  var completionRewardData: js.UndefOr[String] = js.native
  
  /**
    * The criteria of the milestone.
    */
  var criteria: js.UndefOr[js.Array[SchemaQuestCriterion]] = js.native
  
  /**
    * The milestone ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#questMilestone.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The current state of the milestone. Possible values are:   -
    * &quot;COMPLETED_NOT_CLAIMED&quot; - The milestone is complete, but has
    * not yet been claimed.  - &quot;CLAIMED&quot; - The milestone is complete
    * and has been claimed.  - &quot;NOT_COMPLETED&quot; - The milestone has
    * not yet been completed.  - &quot;NOT_STARTED&quot; - The milestone is for
    * a quest that has not yet been accepted.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaQuestMilestone {
  
  @scala.inline
  def apply(): SchemaQuestMilestone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuestMilestone]
  }
  
  @scala.inline
  implicit class SchemaQuestMilestoneMutableBuilder[Self <: SchemaQuestMilestone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionRewardData(value: String): Self = StObject.set(x, "completionRewardData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionRewardDataUndefined: Self = StObject.set(x, "completionRewardData", js.undefined)
    
    @scala.inline
    def setCriteria(value: js.Array[SchemaQuestCriterion]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setCriteriaVarargs(value: SchemaQuestCriterion*): Self = StObject.set(x, "criteria", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
