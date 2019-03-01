package typings
package jsforceLib.salesforceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOptions extends js.Object {
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
}

object FindOptions {
  @scala.inline
  def apply(
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    skip: scala.Int | scala.Double = null
  ): FindOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOptions]
  }
}

