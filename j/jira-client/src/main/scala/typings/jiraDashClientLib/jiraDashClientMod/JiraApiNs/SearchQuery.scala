package typings
package jiraDashClientLib.jiraDashClientMod.JiraApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchQuery extends js.Object {
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  var startAt: js.UndefOr[scala.Double] = js.undefined
}

object SearchQuery {
  @scala.inline
  def apply(
    fields: js.Array[java.lang.String] = null,
    maxResults: scala.Int | scala.Double = null,
    startAt: scala.Int | scala.Double = null
  ): SearchQuery = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuery]
  }
}

