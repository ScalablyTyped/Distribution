package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapNavigationOptions extends js.Object {
  
  /**
    * (Highmaps) General options for the map navigation buttons. Individual
    * options can be given from the mapNavigation.buttons option set.
    */
  var buttonOptions: js.UndefOr[MapNavigationButtonOptions] = js.native
  
  /**
    * (Highmaps) The individual buttons for the map navigation. This usually
    * includes the zoom in and zoom out buttons. Properties for each button is
    * inherited from mapNavigation.buttonOptions, while individual options can
    * be overridden. But default, the `onclick`, `text` and `y` options are
    * individual.
    */
  var buttons: js.UndefOr[MapNavigationButtonsOptions] = js.native
  
  /**
    * (Highmaps) Whether to enable navigation buttons. By default it inherits
    * the enabled setting.
    */
  var enableButtons: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highmaps) Enables zooming in on an area on double clicking in the map.
    * By default it inherits the enabled setting.
    */
  var enableDoubleClickZoom: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highmaps) Whether to zoom in on an area when that area is double
    * clicked.
    */
  var enableDoubleClickZoomTo: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highmaps) Enables zooming by mouse wheel. By default it inherits the
    * enabled setting.
    */
  var enableMouseWheelZoom: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highmaps) Whether to enable multitouch zooming. Note that if the chart
    * covers the viewport, this prevents the user from using multitouch and
    * touchdrag on the web page, so you should make sure the user is not
    * trapped inside the chart. By default it inherits the enabled setting.
    */
  var enableTouchZoom: js.UndefOr[Boolean] = js.native
  
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
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highmaps) Sensitivity of mouse wheel or trackpad scrolling. 1 is no
    * sensitivity, while with 2, one mousewheel delta will zoom in 50%.
    */
  var mouseWheelSensitivity: js.UndefOr[Double] = js.native
}
object MapNavigationOptions {
  
  @scala.inline
  def apply(): MapNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapNavigationOptions]
  }
  
  @scala.inline
  implicit class MapNavigationOptionsOps[Self <: MapNavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setButtonOptions(value: MapNavigationButtonOptions): Self = this.set("buttonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonOptions: Self = this.set("buttonOptions", js.undefined)
    
    @scala.inline
    def setButtons(value: MapNavigationButtonsOptions): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setEnableButtons(value: Boolean): Self = this.set("enableButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableButtons: Self = this.set("enableButtons", js.undefined)
    
    @scala.inline
    def setEnableDoubleClickZoom(value: Boolean): Self = this.set("enableDoubleClickZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDoubleClickZoom: Self = this.set("enableDoubleClickZoom", js.undefined)
    
    @scala.inline
    def setEnableDoubleClickZoomTo(value: Boolean): Self = this.set("enableDoubleClickZoomTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDoubleClickZoomTo: Self = this.set("enableDoubleClickZoomTo", js.undefined)
    
    @scala.inline
    def setEnableMouseWheelZoom(value: Boolean): Self = this.set("enableMouseWheelZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMouseWheelZoom: Self = this.set("enableMouseWheelZoom", js.undefined)
    
    @scala.inline
    def setEnableTouchZoom(value: Boolean): Self = this.set("enableTouchZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTouchZoom: Self = this.set("enableTouchZoom", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setMouseWheelSensitivity(value: Double): Self = this.set("mouseWheelSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseWheelSensitivity: Self = this.set("mouseWheelSensitivity", js.undefined)
  }
}
