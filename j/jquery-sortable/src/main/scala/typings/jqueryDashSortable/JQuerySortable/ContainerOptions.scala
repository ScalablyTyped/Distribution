package typings.jqueryDashSortable.JQuerySortable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerOptions extends js.Object {
  var drag: js.UndefOr[Boolean] = js.undefined
  var drop: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[String] = js.undefined
  var nested: js.UndefOr[Boolean] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ContainerOptions {
  @scala.inline
  def apply(
    drag: js.UndefOr[Boolean] = js.undefined,
    drop: js.UndefOr[Boolean] = js.undefined,
    exclude: String = null,
    nested: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ContainerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag)
    if (!js.isUndefined(drop)) __obj.updateDynamic("drop")(drop)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (!js.isUndefined(nested)) __obj.updateDynamic("nested")(nested)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ContainerOptions]
  }
}

