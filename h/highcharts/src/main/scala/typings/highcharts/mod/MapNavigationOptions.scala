package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapNavigationOptions extends js.Object {
  /**
    * (Highmaps) General options for the map navigation buttons. Individual
    * options can be given from the mapNavigation.buttons option set.
    */
  var buttonOptions: js.UndefOr[MapNavigationButtonOptions] = js.undefined
  /**
    * (Highmaps) The individual buttons for the map navigation. This usually
    * includes the zoom in and zoom out buttons. Properties for each button is
    * inherited from mapNavigation.buttonOptions, while individual options can
    * be overridden. But default, the `onclick`, `text` and `y` options are
    * individual.
    */
  var buttons: js.UndefOr[MapNavigationButtonsOptions] = js.undefined
  /**
    * (Highmaps) Whether to enable navigation buttons. By default it inherits
    * the enabled setting.
    */
  var enableButtons: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) Enables zooming in on an area on double clicking in the map.
    * By default it inherits the enabled setting.
    */
  var enableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) Whether to zoom in on an area when that area is double
    * clicked.
    */
  var enableDoubleClickZoomTo: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) Enables zooming by mouse wheel. By default it inherits the
    * enabled setting.
    */
  var enableMouseWheelZoom: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) Whether to enable multitouch zooming. Note that if the chart
    * covers the viewport, this prevents the user from using multitouch and
    * touchdrag on the web page, so you should make sure the user is not
    * trapped inside the chart. By default it inherits the enabled setting.
    */
  var enableTouchZoom: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) Whether to enable map navigation. The default is not to enable
    * navigation, as many choropleth maps are simple and don't need it.
    * Additionally, when touch zoom and mousewheel zoom is enabled, it breaks
    * the default behaviour of these interactions in the website, and the
    * implementer should be aware of this.
    *
    * Individual interactions can be enabled separately, namely buttons,
    * multitouch zoom, double click zoom, double click zoom to element and
    * mousewheel zoom.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) Sensitivity of mouse wheel or trackpad scrolling. 1 is no
    * sensitivity, while with 2, one mousewheel delta will zoom in 50%.
    */
  var mouseWheelSensitivity: js.UndefOr[Double] = js.undefined
}

object MapNavigationOptions {
  @scala.inline
  def apply(
    buttonOptions: MapNavigationButtonOptions = null,
    buttons: MapNavigationButtonsOptions = null,
    enableButtons: js.UndefOr[Boolean] = js.undefined,
    enableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    enableDoubleClickZoomTo: js.UndefOr[Boolean] = js.undefined,
    enableMouseWheelZoom: js.UndefOr[Boolean] = js.undefined,
    enableTouchZoom: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    mouseWheelSensitivity: Int | Double = null
  ): MapNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (buttonOptions != null) __obj.updateDynamic("buttonOptions")(buttonOptions.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(enableButtons)) __obj.updateDynamic("enableButtons")(enableButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDoubleClickZoom)) __obj.updateDynamic("enableDoubleClickZoom")(enableDoubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDoubleClickZoomTo)) __obj.updateDynamic("enableDoubleClickZoomTo")(enableDoubleClickZoomTo.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseWheelZoom)) __obj.updateDynamic("enableMouseWheelZoom")(enableMouseWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTouchZoom)) __obj.updateDynamic("enableTouchZoom")(enableTouchZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (mouseWheelSensitivity != null) __obj.updateDynamic("mouseWheelSensitivity")(mouseWheelSensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapNavigationOptions]
  }
}

