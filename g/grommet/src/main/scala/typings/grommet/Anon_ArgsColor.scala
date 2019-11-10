package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var value: Double
}

object Anon_ArgsColor {
  @scala.inline
  def apply(
    value: Double,
    color: String = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    onClick: /* repeated */ js.Any => _ = null,
    onHover: /* repeated */ js.Any => _ = null
  ): Anon_ArgsColor = {
    val __obj = js.Dynamic.literal(value = value)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    __obj.asInstanceOf[Anon_ArgsColor]
  }
}

