package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerOptions
  extends StObject
     with InteractiveLayerOptions {
  
  /** Text for the `alt` attribute of the icon image (useful for accessibility). */
  var alt: js.UndefOr[String] = js.undefined
  
  /** Whether to pan the map when dragging this marker near its edge or not. */
  var autoPan: js.UndefOr[Boolean] = js.undefined
  
  /** Distance (in pixels to the left/right and to the top/bottom) of the map edge to start panning the map. */
  var autoPanPadding: js.UndefOr[PointExpression] = js.undefined
  
  /** Number of pixels the map should pan by. */
  var autoPanSpeed: js.UndefOr[Double] = js.undefined
  
  /** Whether the marker is draggable with mouse/touch or not. */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
  
  /** Whether the marker can be tabbed to with a keyboard and clicked by pressing enter. */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  
  /** The opacity of the marker. */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /** The z-index offset used for the `riseOnHover` feature. */
  var riseOffset: js.UndefOr[Double] = js.undefined
  
  /** If `true`, the marker will get on top of others when you hover the mouse over it. */
  var riseOnHover: js.UndefOr[Boolean] = js.undefined
  
  /** `Map pane` where the markers shadow will be added. */
  var shadowPane: js.UndefOr[String] = js.undefined
  
  /** Text for the browser tooltip that appear on marker hover (no tooltip by default). */
  var title: js.UndefOr[String] = js.undefined
  
  /** Option for putting the marker on top of all others (or below). */
  var zIndexOffset: js.UndefOr[Double] = js.undefined
}
object MarkerOptions {
  
  @scala.inline
  def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  
  @scala.inline
  implicit class MarkerOptionsMutableBuilder[Self <: MarkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setAutoPan(value: Boolean): Self = StObject.set(x, "autoPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanPadding(value: PointExpression): Self = StObject.set(x, "autoPanPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanPaddingUndefined: Self = StObject.set(x, "autoPanPadding", js.undefined)
    
    @scala.inline
    def setAutoPanSpeed(value: Double): Self = StObject.set(x, "autoPanSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanSpeedUndefined: Self = StObject.set(x, "autoPanSpeed", js.undefined)
    
    @scala.inline
    def setAutoPanUndefined: Self = StObject.set(x, "autoPan", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setRiseOffset(value: Double): Self = StObject.set(x, "riseOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiseOffsetUndefined: Self = StObject.set(x, "riseOffset", js.undefined)
    
    @scala.inline
    def setRiseOnHover(value: Boolean): Self = StObject.set(x, "riseOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiseOnHoverUndefined: Self = StObject.set(x, "riseOnHover", js.undefined)
    
    @scala.inline
    def setShadowPane(value: String): Self = StObject.set(x, "shadowPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowPaneUndefined: Self = StObject.set(x, "shadowPane", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setZIndexOffset(value: Double): Self = StObject.set(x, "zIndexOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexOffsetUndefined: Self = StObject.set(x, "zIndexOffset", js.undefined)
  }
}
