package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapNavigationButtonsOptions extends js.Object {
  /**
    * (Highmaps) Options for the zoom in button. Properties for the zoom in and
    * zoom out buttons are inherited from mapNavigation.buttonOptions, while
    * individual options can be overridden. By default, the `onclick`, `text`
    * and `y` options are individual.
    */
  var zoomIn: js.UndefOr[MapNavigationButtonsZoomInOptions] = js.undefined
  /**
    * (Highmaps) Options for the zoom out button. Properties for the zoom in
    * and zoom out buttons are inherited from mapNavigation.buttonOptions,
    * while individual options can be overridden. By default, the `onclick`,
    * `text` and `y` options are individual.
    */
  var zoomOut: js.UndefOr[MapNavigationButtonsZoomOutOptions] = js.undefined
}

object MapNavigationButtonsOptions {
  @scala.inline
  def apply(
    zoomIn: MapNavigationButtonsZoomInOptions = null,
    zoomOut: MapNavigationButtonsZoomOutOptions = null
  ): MapNavigationButtonsOptions = {
    val __obj = js.Dynamic.literal()
    if (zoomIn != null) __obj.updateDynamic("zoomIn")(zoomIn.asInstanceOf[js.Any])
    if (zoomOut != null) __obj.updateDynamic("zoomOut")(zoomOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapNavigationButtonsOptions]
  }
}

