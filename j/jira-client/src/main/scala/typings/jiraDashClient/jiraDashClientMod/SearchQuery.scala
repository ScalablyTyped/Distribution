package typings.jiraDashClient.jiraDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchQuery extends js.Object {
  var expand: js.UndefOr[js.Array[String]] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var startAt: js.UndefOr[Double] = js.undefined
}

object SearchQuery {
  @scala.inline
  def apply(
    expand: js.Array[String] = null,
    fields: js.Array[String] = null,
    maxResults: Int | Double = null,
    startAt: Int | Double = null
  ): SearchQuery = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuery]
  }
}

