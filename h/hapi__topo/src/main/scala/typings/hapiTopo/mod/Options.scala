package typings.hapiTopo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The group or groups the added items must come after
    */
  val after: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The group or groups the added items must come before
    */
  val before: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The sorting group the added items belong to
    */
  val group: js.UndefOr[String] = js.undefined
  /**
    * A number used to sort items with equal before/after requirements
    */
  val sort: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    after: String | js.Array[String] = null,
    before: String | js.Array[String] = null,
    group: String = null,
    sort: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

