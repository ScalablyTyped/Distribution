package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var value: Double | js.Array[Double]
}

object Anon_Args {
  @scala.inline
  def apply(
    value: Double | js.Array[Double],
    label: String = null,
    onClick: /* repeated */ js.Any => _ = null,
    onHover: /* repeated */ js.Any => _ = null
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    __obj.asInstanceOf[Anon_Args]
  }
}

