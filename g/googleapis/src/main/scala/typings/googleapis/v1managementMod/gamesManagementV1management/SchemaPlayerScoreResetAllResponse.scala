package typings.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of leaderboard reset resources.
  */
@js.native
trait SchemaPlayerScoreResetAllResponse extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#playerScoreResetResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The leaderboard reset results.
    */
  var results: js.UndefOr[js.Array[SchemaPlayerScoreResetResponse]] = js.native
}

object SchemaPlayerScoreResetAllResponse {
  @scala.inline
  def apply(): SchemaPlayerScoreResetAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreResetAllResponse]
  }
  @scala.inline
  implicit class SchemaPlayerScoreResetAllResponseOps[Self <: SchemaPlayerScoreResetAllResponse] (val x: Self) extends AnyVal {
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
    def setResultsVarargs(value: SchemaPlayerScoreResetResponse*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[SchemaPlayerScoreResetResponse]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

