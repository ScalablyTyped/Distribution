package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an leaderboard configuration resource.
  */
@js.native
trait SchemaLeaderboardConfiguration extends js.Object {
  
  /**
    * The draft data of the leaderboard.
    */
  var draft: js.UndefOr[SchemaLeaderboardConfigurationDetail] = js.native
  
  /**
    * The ID of the leaderboard.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#leaderboardConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The read-only published data of the leaderboard.
    */
  var published: js.UndefOr[SchemaLeaderboardConfigurationDetail] = js.native
  
  /**
    * Maximum score that can be posted to this leaderboard.
    */
  var scoreMax: js.UndefOr[String] = js.native
  
  /**
    * Minimum score that can be posted to this leaderboard.
    */
  var scoreMin: js.UndefOr[String] = js.native
  
  /**
    * The type of the leaderboard. Possible values are:   -
    * &quot;LARGER_IS_BETTER&quot; - Larger scores posted are ranked higher.  -
    * &quot;SMALLER_IS_BETTER&quot; - Smaller scores posted are ranked higher.
    */
  var scoreOrder: js.UndefOr[String] = js.native
  
  /**
    * The token for this resource.
    */
  var token: js.UndefOr[String] = js.native
}
object SchemaLeaderboardConfiguration {
  
  @scala.inline
  def apply(): SchemaLeaderboardConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardConfiguration]
  }
  
  @scala.inline
  implicit class SchemaLeaderboardConfigurationOps[Self <: SchemaLeaderboardConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDraft(value: SchemaLeaderboardConfigurationDetail): Self = this.set("draft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraft: Self = this.set("draft", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPublished(value: SchemaLeaderboardConfigurationDetail): Self = this.set("published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    
    @scala.inline
    def setScoreMax(value: String): Self = this.set("scoreMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoreMax: Self = this.set("scoreMax", js.undefined)
    
    @scala.inline
    def setScoreMin(value: String): Self = this.set("scoreMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoreMin: Self = this.set("scoreMin", js.undefined)
    
    @scala.inline
    def setScoreOrder(value: String): Self = this.set("scoreOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoreOrder: Self = this.set("scoreOrder", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
