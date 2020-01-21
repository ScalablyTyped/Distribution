package typings.keypressJs.mod

import typings.std.Element
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Combo extends js.Object {
  var is_counting: js.UndefOr[Boolean] = js.undefined
  var is_exclusive: js.UndefOr[Boolean] = js.undefined
  var is_sequence: js.UndefOr[Boolean] = js.undefined
  var is_solitary: js.UndefOr[Boolean] = js.undefined
  var is_unordered: js.UndefOr[Boolean] = js.undefined
  var keys: js.UndefOr[String] = js.undefined
  var on_keydown: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double], _]
  ] = js.undefined
  var on_keyup: js.UndefOr[js.Function1[/* event */ js.UndefOr[KeyboardEvent], _]] = js.undefined
  var on_release: js.UndefOr[js.Function1[/* event */ js.UndefOr[KeyboardEvent], _]] = js.undefined
  var prevent_default: js.UndefOr[Boolean] = js.undefined
  var prevent_repeat: js.UndefOr[Boolean] = js.undefined
  var `this`: js.UndefOr[Element] = js.undefined
}

object Combo {
  @scala.inline
  def apply(
    is_counting: js.UndefOr[Boolean] = js.undefined,
    is_exclusive: js.UndefOr[Boolean] = js.undefined,
    is_sequence: js.UndefOr[Boolean] = js.undefined,
    is_solitary: js.UndefOr[Boolean] = js.undefined,
    is_unordered: js.UndefOr[Boolean] = js.undefined,
    keys: String = null,
    on_keydown: (/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double]) => _ = null,
    on_keyup: /* event */ js.UndefOr[KeyboardEvent] => _ = null,
    on_release: /* event */ js.UndefOr[KeyboardEvent] => _ = null,
    prevent_default: js.UndefOr[Boolean] = js.undefined,
    prevent_repeat: js.UndefOr[Boolean] = js.undefined,
    `this`: Element = null
  ): Combo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(is_counting)) __obj.updateDynamic("is_counting")(is_counting.asInstanceOf[js.Any])
    if (!js.isUndefined(is_exclusive)) __obj.updateDynamic("is_exclusive")(is_exclusive.asInstanceOf[js.Any])
    if (!js.isUndefined(is_sequence)) __obj.updateDynamic("is_sequence")(is_sequence.asInstanceOf[js.Any])
    if (!js.isUndefined(is_solitary)) __obj.updateDynamic("is_solitary")(is_solitary.asInstanceOf[js.Any])
    if (!js.isUndefined(is_unordered)) __obj.updateDynamic("is_unordered")(is_unordered.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (on_keydown != null) __obj.updateDynamic("on_keydown")(js.Any.fromFunction2(on_keydown))
    if (on_keyup != null) __obj.updateDynamic("on_keyup")(js.Any.fromFunction1(on_keyup))
    if (on_release != null) __obj.updateDynamic("on_release")(js.Any.fromFunction1(on_release))
    if (!js.isUndefined(prevent_default)) __obj.updateDynamic("prevent_default")(prevent_default.asInstanceOf[js.Any])
    if (!js.isUndefined(prevent_repeat)) __obj.updateDynamic("prevent_repeat")(prevent_repeat.asInstanceOf[js.Any])
    if (`this` != null) __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Combo]
  }
}

