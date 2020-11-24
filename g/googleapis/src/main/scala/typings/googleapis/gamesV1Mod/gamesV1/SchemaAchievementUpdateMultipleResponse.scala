package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an achievement unlock response.
  */
@js.native
trait SchemaAchievementUpdateMultipleResponse extends js.Object {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUpdateListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The updated state of the achievements.
    */
  var updatedAchievements: js.UndefOr[js.Array[SchemaAchievementUpdateResponse]] = js.native
}
object SchemaAchievementUpdateMultipleResponse {
  
  @scala.inline
  def apply(): SchemaAchievementUpdateMultipleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUpdateMultipleResponse]
  }
  
  @scala.inline
  implicit class SchemaAchievementUpdateMultipleResponseOps[Self <: SchemaAchievementUpdateMultipleResponse] (val x: Self) extends AnyVal {
    
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
    def setUpdatedAchievementsVarargs(value: SchemaAchievementUpdateResponse*): Self = this.set("updatedAchievements", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedAchievements(value: js.Array[SchemaAchievementUpdateResponse]): Self = this.set("updatedAchievements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAchievements: Self = this.set("updatedAchievements", js.undefined)
  }
}
