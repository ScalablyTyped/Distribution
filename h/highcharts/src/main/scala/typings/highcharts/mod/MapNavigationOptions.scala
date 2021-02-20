package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapNavigationOptions extends StObject {
  
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
  implicit class MapNavigationOptionsMutableBuilder[Self <: MapNavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonOptions(value: MapNavigationButtonOptions): Self = StObject.set(x, "buttonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonOptionsUndefined: Self = StObject.set(x, "buttonOptions", js.undefined)
    
    @scala.inline
    def setButtons(value: MapNavigationButtonsOptions): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setEnableButtons(value: Boolean): Self = StObject.set(x, "enableButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableButtonsUndefined: Self = StObject.set(x, "enableButtons", js.undefined)
    
    @scala.inline
    def setEnableDoubleClickZoom(value: Boolean): Self = StObject.set(x, "enableDoubleClickZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDoubleClickZoomTo(value: Boolean): Self = StObject.set(x, "enableDoubleClickZoomTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDoubleClickZoomToUndefined: Self = StObject.set(x, "enableDoubleClickZoomTo", js.undefined)
    
    @scala.inline
    def setEnableDoubleClickZoomUndefined: Self = StObject.set(x, "enableDoubleClickZoom", js.undefined)
    
    @scala.inline
    def setEnableMouseWheelZoom(value: Boolean): Self = StObject.set(x, "enableMouseWheelZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMouseWheelZoomUndefined: Self = StObject.set(x, "enableMouseWheelZoom", js.undefined)
    
    @scala.inline
    def setEnableTouchZoom(value: Boolean): Self = StObject.set(x, "enableTouchZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTouchZoomUndefined: Self = StObject.set(x, "enableTouchZoom", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMouseWheelSensitivity(value: Double): Self = StObject.set(x, "mouseWheelSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelSensitivityUndefined: Self = StObject.set(x, "mouseWheelSensitivity", js.undefined)
  }
}
