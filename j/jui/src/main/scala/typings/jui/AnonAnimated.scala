package typings.jui

import typings.jui.juiStrings.flat
import typings.jui.juiStrings.horizontal
import typings.jui.juiStrings.simple
import typings.jui.juiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimated extends js.Object {
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

object AnonAnimated {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    max: Int | Double = null,
    min: Int | Double = null,
    orient: horizontal | vertical = null,
    striped: js.UndefOr[Boolean] = js.undefined,
    tpl: js.Any = null,
    `type`: simple | flat = null,
    value: Int | Double = null
  ): AnonAnimated = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimated]
  }
}

