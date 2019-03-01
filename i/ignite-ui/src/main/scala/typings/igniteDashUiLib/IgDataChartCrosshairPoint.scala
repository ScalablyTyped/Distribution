package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDataChartCrosshairPoint
  extends /**
	 * Option for IgDataChartCrosshairPoint
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * The x coordinate.
  	 */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The y coordinate.
  	 */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object IgDataChartCrosshairPoint {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgDataChartCrosshairPoint
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): IgDataChartCrosshairPoint = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgDataChartCrosshairPoint]
  }
}

