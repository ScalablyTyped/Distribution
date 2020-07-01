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
  def apply(data: String = null, dataAvailable: js.UndefOr[Boolean] = js.undefined, kind: String = null): SchemaTurnBasedMatchData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(dataAvailable)) __obj.updateDynamic("dataAvailable")(dataAvailable.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTurnBasedMatchData]
  }
}

