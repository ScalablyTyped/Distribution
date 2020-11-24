package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of achievement update requests.
  */
@js.native
trait SchemaAchievementUpdateMultipleRequest extends js.Object {
  
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
  implicit class SchemaAchievementUpdateMultipleRequestOps[Self <: SchemaAchievementUpdateMultipleRequest] (val x: Self) extends AnyVal {
    
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
    def setUpdatesVarargs(value: SchemaAchievementUpdateRequest*): Self = this.set("updates", js.Array(value :_*))
    
    @scala.inline
    def setUpdates(value: js.Array[SchemaAchievementUpdateRequest]): Self = this.set("updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdates: Self = this.set("updates", js.undefined)
  }
}
