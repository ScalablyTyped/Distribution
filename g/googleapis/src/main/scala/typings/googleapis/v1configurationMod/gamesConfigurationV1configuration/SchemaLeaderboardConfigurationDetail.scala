package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a leaderboard configuration detail.
  */
@js.native
trait SchemaLeaderboardConfigurationDetail extends js.Object {
  /**
    * The icon url of this leaderboard. Writes to this field are ignored.
    */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#leaderboardConfigurationDetail.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Localized strings for the leaderboard name.
    */
  var name: js.UndefOr[SchemaLocalizedStringBundle] = js.native
  /**
    * The score formatting for the leaderboard.
    */
  var scoreFormat: js.UndefOr[SchemaGamesNumberFormatConfiguration] = js.native
  /**
    * The sort rank of this leaderboard. Writes to this field are ignored.
    */
  var sortRank: js.UndefOr[Double] = js.native
}

object SchemaLeaderboardConfigurationDetail {
  @scala.inline
  def apply(): SchemaLeaderboardConfigurationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardConfigurationDetail]
  }
  @scala.inline
  implicit class SchemaLeaderboardConfigurationDetailOps[Self <: SchemaLeaderboardConfigurationDetail] (val x: Self) extends AnyVal {
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
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: SchemaLocalizedStringBundle): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setScoreFormat(value: SchemaGamesNumberFormatConfiguration): Self = this.set("scoreFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreFormat: Self = this.set("scoreFormat", js.undefined)
    @scala.inline
    def setSortRank(value: Double): Self = this.set("sortRank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortRank: Self = this.set("sortRank", js.undefined)
  }
  
}

