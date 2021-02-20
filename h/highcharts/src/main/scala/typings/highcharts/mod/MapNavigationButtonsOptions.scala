package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapNavigationButtonsOptions extends StObject {
  
  /**
    * (Highmaps) Options for the zoom in button. Properties for the zoom in and
    * zoom out buttons are inherited from mapNavigation.buttonOptions, while
    * individual options can be overridden. By default, the `onclick`, `text`
    * and `y` options are individual.
    */
  var zoomIn: js.UndefOr[MapNavigationButtonsZoomInOptions] = js.native
  
  /**
    * (Highmaps) Options for the zoom out button. Properties for the zoom in
    * and zoom out buttons are inherited from mapNavigation.buttonOptions,
    * while individual options can be overridden. By default, the `onclick`,
    * `text` and `y` options are individual.
    */
  var zoomOut: js.UndefOr[MapNavigationButtonsZoomOutOptions] = js.native
}
object MapNavigationButtonsOptions {
  
  @scala.inline
  def apply(): MapNavigationButtonsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapNavigationButtonsOptions]
  }
  
  @scala.inline
  implicit class MapNavigationButtonsOptionsMutableBuilder[Self <: MapNavigationButtonsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZoomIn(value: MapNavigationButtonsZoomInOptions): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
    
    @scala.inline
    def setZoomOut(value: MapNavigationButtonsZoomOutOptions): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
  }
}
