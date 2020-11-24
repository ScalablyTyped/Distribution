package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an achievement increment response
  */
@js.native
trait SchemaAchievementIncrementResponse extends js.Object {
  
  /**
    * The current steps recorded for this incremental achievement.
    */
  var currentSteps: js.UndefOr[Double] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementIncrementResponse.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Whether the current steps for the achievement has reached the number of
    * steps required to unlock.
    */
  var newlyUnlocked: js.UndefOr[Boolean] = js.native
}
object SchemaAchievementIncrementResponse {
  
  @scala.inline
  def apply(): SchemaAchievementIncrementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementIncrementResponse]
  }
  
  @scala.inline
  implicit class SchemaAchievementIncrementResponseOps[Self <: SchemaAchievementIncrementResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentSteps(value: Double): Self = this.set("currentSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentSteps: Self = this.set("currentSteps", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNewlyUnlocked(value: Boolean): Self = this.set("newlyUnlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewlyUnlocked: Self = this.set("newlyUnlocked", js.undefined)
  }
}
