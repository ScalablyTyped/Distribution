package typings.atHapiTopo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After[TGroup] extends js.Object {
  var after: js.UndefOr[TGroup | js.Array[TGroup]] = js.undefined
  var before: js.UndefOr[TGroup | js.Array[TGroup]] = js.undefined
  var group: js.UndefOr[TGroup] = js.undefined
  var sort: js.UndefOr[Double] = js.undefined
}

object Anon_After {
  @scala.inline
  def apply[TGroup](
    after: TGroup | js.Array[TGroup] = null,
    before: TGroup | js.Array[TGroup] = null,
    group: TGroup = null,
    sort: Int | Double = null
  ): Anon_After[TGroup] = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_After[TGroup]]
  }
}

