package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorAxisDataClass extends js.Object {
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  var from: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[scala.Double] = js.undefined
}

object ColorAxisDataClass {
  @scala.inline
  def apply(
    color: java.lang.String | Gradient = null,
    from: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    to: scala.Int | scala.Double = null
  ): ColorAxisDataClass = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorAxisDataClass]
  }
}

