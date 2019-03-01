package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animated extends js.Object {
     // or true
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
   // or vertical,
  var min: js.UndefOr[scala.Double] = js.undefined
         // simple or flat
  var orient: js.UndefOr[juiLib.juiLibStrings.horizontal | juiLib.juiLibStrings.vertical] = js.undefined
  var striped: js.UndefOr[scala.Boolean] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[juiLib.juiLibStrings.simple | juiLib.juiLibStrings.flat] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Animated {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    event: js.Any = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    orient: juiLib.juiLibStrings.horizontal | juiLib.juiLibStrings.vertical = null,
    striped: js.UndefOr[scala.Boolean] = js.undefined,
    tpl: js.Any = null,
    `type`: juiLib.juiLibStrings.simple | juiLib.juiLibStrings.flat = null,
    value: scala.Int | scala.Double = null
  ): Anon_Animated = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (event != null) __obj.updateDynamic("event")(event)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Animated]
  }
}

