package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of achievement objects.
  */
@js.native
trait SchemaPlayerAchievementListResponse extends js.Object {
  /**
    * The achievements.
    */
  var items: js.UndefOr[js.Array[SchemaPlayerAchievement]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerAchievementListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token corresponding to the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaPlayerAchievementListResponse {
  @scala.inline
  def apply(): SchemaPlayerAchievementListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerAchievementListResponse]
  }
  @scala.inline
  implicit class SchemaPlayerAchievementListResponseOps[Self <: SchemaPlayerAchievementListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaPlayerAchievement*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaPlayerAchievement]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

