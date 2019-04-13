package typings
package atHapiPodiumLib.atHapiPodiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CriteriaFilterOptionsObject extends js.Object {
  /** if true, all tags must be present for the event update to match the subscription. Defaults to false (at least one matching tag). */
  var all: js.UndefOr[scala.Boolean] = js.undefined
  /** a tag string or array of tag strings. */
  var tags: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object CriteriaFilterOptionsObject {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    tags: java.lang.String | js.Array[java.lang.String] = null
  ): CriteriaFilterOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CriteriaFilterOptionsObject]
  }
}

