package typings.matterDashJs.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollisionFilter extends js.Object {
  var category: js.UndefOr[Double] = js.undefined
  var group: js.UndefOr[Double] = js.undefined
  var mask: js.UndefOr[Double] = js.undefined
}

object ICollisionFilter {
  @scala.inline
  def apply(category: Int | Double = null, group: Int | Double = null, mask: Int | Double = null): ICollisionFilter = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionFilter]
  }
}

