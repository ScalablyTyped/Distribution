package typings.jui.anon

import typings.jui.juiStrings.flat
import typings.jui.juiStrings.horizontal
import typings.jui.juiStrings.simple
import typings.jui.juiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animated extends js.Object {
     // or true
  var animated: js.UndefOr[Boolean] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
   // or vertical,
  var min: js.UndefOr[Double] = js.undefined
         // simple or flat
  var orient: js.UndefOr[horizontal | vertical] = js.undefined
  var striped: js.UndefOr[Boolean] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[simple | flat] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Animated {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    orient: horizontal | vertical = null,
    striped: js.UndefOr[Boolean] = js.undefined,
    tpl: js.Any = null,
    `type`: simple | flat = null,
    value: js.UndefOr[Double] = js.undefined
  ): Animated = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.get.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animated]
  }
}

