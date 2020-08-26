package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a turn-based match data object.
  */
@js.native
trait SchemaTurnBasedMatchData extends js.Object {
  /**
    * The byte representation of the data (limited to 128 kB), as a
    * Base64-encoded string with the URL_SAFE encoding option.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * True if this match has data available but it wasn&#39;t returned in a
    * list response; fetching the match individually will retrieve this data.
    */
  var dataAvailable: js.UndefOr[Boolean] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchData.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaTurnBasedMatchData {
  @scala.inline
  def apply(): SchemaTurnBasedMatchData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchData]
  }
  @scala.inline
  implicit class SchemaTurnBasedMatchDataOps[Self <: SchemaTurnBasedMatchData] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataAvailable(value: Boolean): Self = this.set("dataAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataAvailable: Self = this.set("dataAvailable", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

