package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Back extends js.Object {
  /**
    * Defines the back panel of the frame around 3D charts.
    * @since 4.0
    */
  var back: js.UndefOr[highchartsLib.highchartsMod.ChartOptions3dFrame] = js.undefined
  /**
    * The bottom of the frame around a 3D chart.
    * @since 4.0
    */
  var bottom: js.UndefOr[highchartsLib.highchartsMod.ChartOptions3dFrame] = js.undefined
  /**
    * The side for the frame around a 3D chart.
    * @since 4.0
    */
  var side: js.UndefOr[highchartsLib.highchartsMod.ChartOptions3dFrame] = js.undefined
}

object Anon_Back {
  @scala.inline
  def apply(
    back: highchartsLib.highchartsMod.ChartOptions3dFrame = null,
    bottom: highchartsLib.highchartsMod.ChartOptions3dFrame = null,
    side: highchartsLib.highchartsMod.ChartOptions3dFrame = null
  ): Anon_Back = {
    val __obj = js.Dynamic.literal()
    if (back != null) __obj.updateDynamic("back")(back)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (side != null) __obj.updateDynamic("side")(side)
    __obj.asInstanceOf[Anon_Back]
  }
}

