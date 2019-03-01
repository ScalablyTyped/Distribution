package typings
package jqueryDashSortableLib.JQuerySortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerOptions extends js.Object {
  var drag: js.UndefOr[scala.Boolean] = js.undefined
  var drop: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[java.lang.String] = js.undefined
  var nested: js.UndefOr[scala.Boolean] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object ContainerOptions {
  @scala.inline
  def apply(
    drag: js.UndefOr[scala.Boolean] = js.undefined,
    drop: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: java.lang.String = null,
    nested: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
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

