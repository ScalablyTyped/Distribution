package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of achievement update requests.
  */
@js.native
trait SchemaAchievementUpdateMultipleRequest extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUpdateMultipleRequest.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The individual achievement update requests.
    */
  var updates: js.UndefOr[js.Array[SchemaAchievementUpdateRequest]] = js.native
}
object SchemaAchievementUpdateMultipleRequest {
  
  @scala.inline
  def apply(): SchemaAchievementUpdateMultipleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUpdateMultipleRequest]
  }
  
  @scala.inline
  implicit class SchemaAchievementUpdateMultipleRequestMutableBuilder[Self <: SchemaAchievementUpdateMultipleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUpdates(value: js.Array[SchemaAchievementUpdateRequest]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    @scala.inline
    def setUpdatesVarargs(value: SchemaAchievementUpdateRequest*): Self = StObject.set(x, "updates", js.Array(value :_*))
  }
}
