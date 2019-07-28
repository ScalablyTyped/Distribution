package typings.jiraDashClient.jiraDashClientMod.JiraApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchQuery extends js.Object {
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var startAt: js.UndefOr[Double] = js.undefined
}

object SearchQuery {
  @scala.inline
  def apply(fields: js.Array[String] = null, maxResults: Int | Double = null, startAt: Int | Double = null): SearchQuery = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuery]
  }
}

