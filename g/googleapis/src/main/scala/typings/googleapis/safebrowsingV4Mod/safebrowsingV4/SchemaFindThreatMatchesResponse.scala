package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFindThreatMatchesResponse extends js.Object {
  /**
    * The threat list matches.
    */
  var matches: js.UndefOr[js.Array[SchemaThreatMatch]] = js.native
}

object SchemaFindThreatMatchesResponse {
  @scala.inline
  def apply(): SchemaFindThreatMatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindThreatMatchesResponse]
  }
  @scala.inline
  implicit class SchemaFindThreatMatchesResponseOps[Self <: SchemaFindThreatMatchesResponse] (val x: Self) extends AnyVal {
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
    def setMatchesVarargs(value: SchemaThreatMatch*): Self = this.set("matches", js.Array(value :_*))
    @scala.inline
    def setMatches(value: js.Array[SchemaThreatMatch]): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
  }
  
}

