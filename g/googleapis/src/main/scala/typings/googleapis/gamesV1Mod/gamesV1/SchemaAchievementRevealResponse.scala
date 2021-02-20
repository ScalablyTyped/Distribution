package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an achievement reveal response
  */
@js.native
trait SchemaAchievementRevealResponse extends StObject {
  
  /**
    * The current state of the achievement for which a reveal was attempted.
    * This might be UNLOCKED if the achievement was already unlocked. Possible
    * values are:   - &quot;REVEALED&quot; - Achievement is revealed.  -
    * &quot;UNLOCKED&quot; - Achievement is unlocked.
    */
  var currentState: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementRevealResponse.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAchievementRevealResponse {
  
  @scala.inline
  def apply(): SchemaAchievementRevealResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementRevealResponse]
  }
  
  @scala.inline
  implicit class SchemaAchievementRevealResponseMutableBuilder[Self <: SchemaAchievementRevealResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
