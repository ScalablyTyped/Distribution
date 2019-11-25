package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNetworkgraphLinkOptions extends js.Object {
  /**
    * (Highcharts) Color of the link between two nodes.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) A name for the dash style to use for links.
    */
  var dashStyle: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Width (px) of the link between two nodes.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PlotNetworkgraphLinkOptions {
  @scala.inline
  def apply(color: String = null, dashStyle: String = null, width: Int | Double = null): PlotNetworkgraphLinkOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotNetworkgraphLinkOptions]
  }
}

