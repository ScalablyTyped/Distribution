package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an achievement unlock response
  */
@js.native
trait SchemaAchievementUnlockResponse extends js.Object {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUnlockResponse.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Whether this achievement was newly unlocked (that is, whether the unlock
    * request for the achievement was the first for the player).
    */
  var newlyUnlocked: js.UndefOr[Boolean] = js.native
}
object SchemaAchievementUnlockResponse {
  
  @scala.inline
  def apply(): SchemaAchievementUnlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUnlockResponse]
  }
  
  @scala.inline
  implicit class SchemaAchievementUnlockResponseOps[Self <: SchemaAchievementUnlockResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNewlyUnlocked(value: Boolean): Self = this.set("newlyUnlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewlyUnlocked: Self = this.set("newlyUnlocked", js.undefined)
  }
}
