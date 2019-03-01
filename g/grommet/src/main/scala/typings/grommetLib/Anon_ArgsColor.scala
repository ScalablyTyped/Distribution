package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsColor extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  var label: java.lang.String
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var value: scala.Double
}

object Anon_ArgsColor {
  @scala.inline
  def apply(
    label: java.lang.String,
    value: scala.Double,
    color: java.lang.String = null,
    highlight: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: js.Function1[/* repeated */ js.Any, _] = null,
    onHover: js.Function1[/* repeated */ js.Any, _] = null
  ): Anon_ArgsColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("value")(value)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onHover != null) __obj.updateDynamic("onHover")(onHover)
    __obj.asInstanceOf[Anon_ArgsColor]
  }
}

