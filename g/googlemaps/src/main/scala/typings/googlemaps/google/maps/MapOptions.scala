package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapOptions extends StObject {
  
  /**
    * Color used for the background of the Map div. This color will be visible
    * when tiles have not yet loaded as the user pans. This option can only be
    * set when the map is initialized.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /** The initial Map center. Required. */
  var center: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  
  /**
    * When false, map icons are not clickable. A map icon represents a point of
    * interest, also known as a POI. By default map icons are clickable.
    */
  var clickableIcons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Size in pixels of the controls appearing on the map. This value must be
    * supplied directly when creating the Map, updating this value later may
    * bring the controls into an undefined state. Only governs the controls
    * made by the Maps API itself. Does not scale developer created custom
    * controls.
    */
  var controlSize: js.UndefOr[Double] = js.undefined
  
  /** Enables/disables all default UI. May be overridden individually. */
  var disableDefaultUI: js.UndefOr[Boolean] = js.undefined
  
  /** Enables/disables zoom and center on double click. Enabled by default. */
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If false, prevents the map from being dragged. Dragging is enabled by
    * default.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name or url of the cursor to display when mousing over a draggable
    * map. This property uses the css cursor attribute to change the icon. As
    * with the css property, you must specify at least one fallback cursor that
    * is not a URL. For example: draggableCursor:
    * 'url(http://www.example.com/icon.png), auto;'.
    */
  var draggableCursor: js.UndefOr[String] = js.undefined
  
  /**
    * The name or url of the cursor to display when the map is being dragged.
    * This property uses the css cursor attribute to change the icon. As with
    * the css property, you must specify at least one fallback cursor that is
    * not a URL. For example: draggingCursor:
    * 'url(http://www.example.com/icon.png), auto;'.
    */
  var draggingCursor: js.UndefOr[String] = js.undefined
  
  /** The enabled/disabled state of the Fullscreen control. */
  var fullscreenControl: js.UndefOr[Boolean] = js.undefined
  
  /** The display options for the Fullscreen control. */
  var fullscreenControlOptions: js.UndefOr[FullscreenControlOptions] = js.undefined
  
  /**
    * This setting controls how gestures on the map are handled.
    */
  var gestureHandling: js.UndefOr[GestureHandlingOptions] = js.undefined
  
  /**
    * The heading for aerial imagery in degrees measured clockwise from
    * cardinal direction North. Headings are snapped to the nearest available
    * angle for which imagery is available.
    */
  var heading: js.UndefOr[Double] = js.undefined
  
  /**
    * If false, prevents the map from being controlled by the keyboard.
    * Keyboard shortcuts are enabled by default.
    */
  var keyboardShortcuts: js.UndefOr[Boolean] = js.undefined
  
  /** The initial enabled/disabled state of the Map type control. */
  var mapTypeControl: js.UndefOr[Boolean] = js.undefined
  
  /** The initial display options for the Map type control. */
  var mapTypeControlOptions: js.UndefOr[MapTypeControlOptions] = js.undefined
  
  /** The initial Map mapTypeId. Defaults to ROADMAP. */
  var mapTypeId: js.UndefOr[MapTypeId | String] = js.undefined
  
  /**
    * The maximum zoom level which will be displayed on the map. If omitted, or
    * set to null, the maximum zoom from the current map type is used instead.
    * Valid values: Integers between zero, and up to the supported maximum zoom
    * level.
    */
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum zoom level which will be displayed on the map. If omitted, or
    * set to null, the minimum zoom from the current map type is used instead.
    * Valid values: Integers between zero, and up to the supported maximum zoom
    * level.
    */
  var minZoom: js.UndefOr[Double] = js.undefined
  
  /** If true, do not clear the contents of the Map div. */
  var noClear: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The enabled/disabled state of the Pan control.
    * Note: The Pan control is not available in the new set of controls
    * introduced in v3.22 of the Google Maps JavaScript API. While using v3.22
    * and v3.23, you can choose to use the earlier set of controls rather than
    * the new controls, thus making the Pan control available as part of the
    * old control set. See {@link
    * https://developers.google.com/maps/articles/v322-controls-diff|What's New
    * in the v3.22 Map Controls}.
    */
  var panControl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The display options for the Pan control.
    * Note: The Pan control is not available in the new set of controls
    * introduced in v3.22 of the Google Maps JavaScript API. While using v3.22
    * and v3.23, you can choose to use the earlier set of controls rather than
    * the new controls, thus making the Pan control available as part of the
    * old control set. See {@link
    * https://developers.google.com/maps/articles/v322-controls-diff|What's New
    * in the v3.22 Map Controls}.
    */
  var panControlOptions: js.UndefOr[PanControlOptions] = js.undefined
  
  /**
    * Defines a boundary that restricts the area of the map accessible to users.
    * When set, a user can only pan and zoom while the camera view stays inside the
    * limits of the boundary.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#MapOptions.restriction Maps JavaScript API}
    */
  var restriction: js.UndefOr[MapRestriction] = js.undefined
  
  /** The enabled/disabled state of the Rotate control. */
  var rotateControl: js.UndefOr[Boolean] = js.undefined
  
  /** The display options for the Rotate control. */
  var rotateControlOptions: js.UndefOr[RotateControlOptions] = js.undefined
  
  /** The initial enabled/disabled state of the Scale control. */
  var scaleControl: js.UndefOr[Boolean] = js.undefined
  
  /** The initial display options for the Scale control. */
  var scaleControlOptions: js.UndefOr[ScaleControlOptions] = js.undefined
  
  /**
    * If false, disables scrollwheel zooming on the map. The scrollwheel is
    * enabled by default.
    */
  var scrollwheel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A StreetViewPanorama to display when the Street View pegman is dropped on
    * the map. If no panorama is specified, a default StreetViewPanorama will
    * be displayed in the map's div when the pegman is dropped.
    */
  var streetView: js.UndefOr[StreetViewPanorama] = js.undefined
  
  /**
    * The initial enabled/disabled state of the Street View Pegman control.
    * This control is part of the default UI, and should be set to false when
    * displaying a map type on which the Street View road overlay should not
    * appear (e.g. a non-Earth map type).
    */
  var streetViewControl: js.UndefOr[Boolean] = js.undefined
  
  /** The initial display options for the Street View Pegman control. */
  var streetViewControlOptions: js.UndefOr[StreetViewControlOptions] = js.undefined
  
  /**
    * Styles to apply to each of the default map types. Note that for
    * satellite/hybrid and terrain modes, these styles will only apply to
    * labels and geometry.
    */
  var styles: js.UndefOr[js.Array[MapTypeStyle]] = js.undefined
  
  /**
    * Controls the automatic switching behavior for the angle of incidence of
    * the map. The only allowed values are 0 and 45. The value 0 causes the map
    * to always use a 0° overhead view regardless of the zoom level and
    * viewport. The value 45 causes the tilt angle to automatically switch to
    * 45 whenever 45° imagery is available for the current zoom level and
    * viewport, and switch back to 0 whenever 45° imagery is not available
    * (this is the default behavior). 45° imagery is only available for
    * satellite and hybrid map types, within some locations, and at some zoom
    * levels. Note: getTilt returns the current tilt angle, not the value
    * specified by this option. Because getTilt and this option refer to
    * different things, do not bind() the tilt property; doing so may yield
    * unpredictable effects.
    */
  var tilt: js.UndefOr[Double] = js.undefined
  
  /**
    * The initial Map zoom level. Required. Valid values: Integers between
    * zero, and up to the supported maximum zoom level.
    */
  var zoom: js.UndefOr[Double] = js.undefined
  
  /** The enabled/disabled state of the Zoom control. */
  var zoomControl: js.UndefOr[Boolean] = js.undefined
  
  /** The display options for the Zoom control. */
  var zoomControlOptions: js.UndefOr[ZoomControlOptions] = js.undefined
}
object MapOptions {
  
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setCenter(value: LatLng | LatLngLiteral): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setClickableIcons(value: Boolean): Self = StObject.set(x, "clickableIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableIconsUndefined: Self = StObject.set(x, "clickableIcons", js.undefined)
    
    @scala.inline
    def setControlSize(value: Double): Self = StObject.set(x, "controlSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlSizeUndefined: Self = StObject.set(x, "controlSize", js.undefined)
    
    @scala.inline
    def setDisableDefaultUI(value: Boolean): Self = StObject.set(x, "disableDefaultUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDefaultUIUndefined: Self = StObject.set(x, "disableDefaultUI", js.undefined)
    
    @scala.inline
    def setDisableDoubleClickZoom(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDoubleClickZoomUndefined: Self = StObject.set(x, "disableDoubleClickZoom", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableCursor(value: String): Self = StObject.set(x, "draggableCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableCursorUndefined: Self = StObject.set(x, "draggableCursor", js.undefined)
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setDraggingCursor(value: String): Self = StObject.set(x, "draggingCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggingCursorUndefined: Self = StObject.set(x, "draggingCursor", js.undefined)
    
    @scala.inline
    def setFullscreenControl(value: Boolean): Self = StObject.set(x, "fullscreenControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenControlOptions(value: FullscreenControlOptions): Self = StObject.set(x, "fullscreenControlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenControlOptionsUndefined: Self = StObject.set(x, "fullscreenControlOptions", js.undefined)
    
    @scala.inline
    def setFullscreenControlUndefined: Self = StObject.set(x, "fullscreenControl", js.undefined)
    
    @scala.inline
    def setGestureHandling(value: GestureHandlingOptions): Self = StObject.set(x, "gestureHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureHandlingUndefined: Self = StObject.set(x, "gestureHandling", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardShortcutsUndefined: Self = StObject.set(x, "keyboardShortcuts", js.undefined)
    
    @scala.inline
    def setMapTypeControl(value: Boolean): Self = StObject.set(x, "mapTypeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypeControlOptions(value: MapTypeControlOptions): Self = StObject.set(x, "mapTypeControlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypeControlOptionsUndefined: Self = StObject.set(x, "mapTypeControlOptions", js.undefined)
    
    @scala.inline
    def setMapTypeControlUndefined: Self = StObject.set(x, "mapTypeControl", js.undefined)
    
    @scala.inline
    def setMapTypeId(value: MapTypeId | String): Self = StObject.set(x, "mapTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypeIdUndefined: Self = StObject.set(x, "mapTypeId", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setNoClear(value: Boolean): Self = StObject.set(x, "noClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoClearUndefined: Self = StObject.set(x, "noClear", js.undefined)
    
    @scala.inline
    def setPanControl(value: Boolean): Self = StObject.set(x, "panControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanControlOptions(value: PanControlOptions): Self = StObject.set(x, "panControlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanControlOptionsUndefined: Self = StObject.set(x, "panControlOptions", js.undefined)
    
    @scala.inline
    def setPanControlUndefined: Self = StObject.set(x, "panControl", js.undefined)
    
    @scala.inline
    def setRestriction(value: MapRestriction): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionUndefined: Self = StObject.set(x, "restriction", js.undefined)
    
    @scala.inline
    def setRotateControl(value: Boolean): Self = StObject.set(x, "rotateControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateControlOptions(value: RotateControlOptions): Self = StObject.set(x, "rotateControlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateControlOptionsUndefined: Self = StObject.set(x, "rotateControlOptions", js.undefined)
    
    @scala.inline
    def setRotateControlUndefined: Self = StObject.set(x, "rotateControl", js.undefined)
    
    @scala.inline
    def setScaleControl(value: Boolean): Self = StObject.set(x, "scaleControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleControlOptions(value: ScaleControlOptions): Self = StObject.set(x, "scaleControlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleControlOptionsUndefined: Self = StObject.set(x, "scaleControlOptions", js.undefined)
    
    @scala.inline
    def setScaleControlUndefined: Self = StObject.set(x, "scaleControl", js.undefined)
    
    @scala.inline
    def setScrollwheel(value: Boolean): Self = StObject.set(x, "scrollwheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollwheelUndefined: Self = StObject.set(x, "scrollwheel", js.undefined)
    
    @scala.inline
    def setStreetView(value: StreetViewPanorama): Self = StObject.set(x, "streetView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetViewControl(value: Boolean): Self = StObject.set(x, "streetViewControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetViewControlOptions(value: StreetViewControlOptions): Self = StObject.set(x, "streetViewControlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetViewControlOptionsUndefined: Self = StObject.set(x, "streetViewControlOptions", js.undefined)
    
    @scala.inline
    def setStreetViewControlUndefined: Self = StObject.set(x, "streetViewControl", js.undefined)
    
    @scala.inline
    def setStreetViewUndefined: Self = StObject.set(x, "streetView", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Array[MapTypeStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: MapTypeStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomControl(value: Boolean): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomControlOptions(value: ZoomControlOptions): Self = StObject.set(x, "zoomControlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomControlOptionsUndefined: Self = StObject.set(x, "zoomControlOptions", js.undefined)
    
    @scala.inline
    def setZoomControlUndefined: Self = StObject.set(x, "zoomControl", js.undefined)
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
