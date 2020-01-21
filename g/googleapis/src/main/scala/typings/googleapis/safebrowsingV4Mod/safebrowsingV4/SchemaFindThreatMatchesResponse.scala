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
  def apply(matches: js.Array[SchemaThreatMatch] = null): SchemaFindThreatMatchesResponse = {
    val __obj = js.Dynamic.literal()
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFindThreatMatchesResponse]
  }
}

