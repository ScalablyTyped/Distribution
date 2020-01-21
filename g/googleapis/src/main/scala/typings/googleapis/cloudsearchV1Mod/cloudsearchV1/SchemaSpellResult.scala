package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSpellResult extends js.Object {
  /**
    * The suggested spelling of the query.
    */
  var suggestedQuery: js.UndefOr[String] = js.native
}

object SchemaSpellResult {
  @scala.inline
  def apply(suggestedQuery: String = null): SchemaSpellResult = {
    val __obj = js.Dynamic.literal()
    if (suggestedQuery != null) __obj.updateDynamic("suggestedQuery")(suggestedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpellResult]
  }
}

