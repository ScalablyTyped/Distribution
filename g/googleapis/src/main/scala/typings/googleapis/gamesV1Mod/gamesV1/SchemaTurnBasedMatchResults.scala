package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a turn-based match results object.
  */
@js.native
trait SchemaTurnBasedMatchResults extends js.Object {
  /**
    * The final match data.
    */
  var data: js.UndefOr[SchemaTurnBasedMatchDataRequest] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchResults.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The version of the match being updated.
    */
  var matchVersion: js.UndefOr[Double] = js.native
  /**
    * The match results for the participants in the match.
    */
  var results: js.UndefOr[js.Array[SchemaParticipantResult]] = js.native
}

object SchemaTurnBasedMatchResults {
  @scala.inline
  def apply(): SchemaTurnBasedMatchResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchResults]
  }
  @scala.inline
  implicit class SchemaTurnBasedMatchResultsOps[Self <: SchemaTurnBasedMatchResults] (val x: Self) extends AnyVal {
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
    def setData(value: SchemaTurnBasedMatchDataRequest): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMatchVersion(value: Double): Self = this.set("matchVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchVersion: Self = this.set("matchVersion", js.undefined)
    @scala.inline
    def setResultsVarargs(value: SchemaParticipantResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[SchemaParticipantResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

