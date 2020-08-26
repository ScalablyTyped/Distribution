package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  /**
    * Color used for the background of the Map div. This color will be visible
    * when tiles have not yet loaded as the user pans. This option can only be
    * set when the map is initialized.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** The initial Map center. Required. */
  var center: js.UndefOr[LatLng | LatLngLiteral] = js.native
  /**
    * When false, map icons are not clickable. A map icon represents a point of
    * interest, also known as a POI. By default map icons are clickable.
    */
  var clickableIcons: js.UndefOr[Boolean] = js.native
  /**
    * Size in pixels of the controls appearing on the map. This value must be
    * supplied directly when creating the Map, updating this value later may
    * bring the controls into an undefined state. Only governs the controls
    * made by the Maps API itself. Does not scale developer created custom
    * controls.
    */
  var controlSize: js.UndefOr[Double] = js.native
  /** Enables/disables all default UI. May be overridden individually. */
  var disableDefaultUI: js.UndefOr[Boolean] = js.native
  /** Enables/disables zoom and center on double click. Enabled by default. */
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.native
  /**
    * If false, prevents the map from being dragged. Dragging is enabled by
    * default.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * The name or url of the cursor to display when mousing over a draggable
    * map. This property uses the css cursor attribute to change the icon. As
    * with the css property, you must specify at least one fallback cursor that
    * is not a URL. For example: draggableCursor:
    * 'url(http://www.example.com/icon.png), auto;'.
    */
  var draggableCursor: js.UndefOr[String] = js.native
  /**
    * The name or url of the cursor to display when the map is being dragged.
    * This property uses the css cursor attribute to change the icon. As with
    * the css property, you must specify at least one fallback cursor that is
    * not a URL. For example: draggingCursor:
    * 'url(http://www.example.com/icon.png), auto;'.
    */
  var draggingCursor: js.UndefOr[String] = js.native
  /** The enabled/disabled state of the Fullscreen control. */
  var fullscreenControl: js.UndefOr[Boolean] = js.native
  /** The display options for the Fullscreen control. */
  var fullscreenControlOptions: js.UndefOr[FullscreenControlOptions] = js.native
  /**
    * This setting controls how gestures on the map are handled.
    */
  var gestureHandling: js.UndefOr[GestureHandlingOptions] = js.native
  /**
    * The heading for aerial imagery in degrees measured clockwise from
    * cardinal direction North. Headings are snapped to the nearest available
    * angle for which imagery is available.
    */
  var heading: js.UndefOr[Double] = js.native
  /**
    * If false, prevents the map from being controlled by the keyboard.
    * Keyboard shortcuts are enabled by default.
    */
  var keyboardShortcuts: js.UndefOr[Boolean] = js.native
  /** The initial enabled/disabled state of the Map type control. */
  var mapTypeControl: js.UndefOr[Boolean] = js.native
  /** The initial display options for the Map type control. */
  var mapTypeControlOptions: js.UndefOr[MapTypeControlOptions] = js.native
  /** The initial Map mapTypeId. Defaults to ROADMAP. */
  var mapTypeId: js.UndefOr[MapTypeId | String] = js.native
  /**
    * The maximum zoom level which will be displayed on the map. If omitted, or
    * set to null, the maximum zoom from the current map type is used instead.
    * Valid values: Integers between zero, and up to the supported maximum zoom
    * level.
    */
  var maxZoom: js.UndefOr[Double] = js.native
  /**
    * The minimum zoom level which will be displayed on the map. If omitted, or
    * set to null, the minimum zoom from the current map type is used instead.
    * Valid values: Integers between zero, and up to the supported maximum zoom
    * level.
    */
  var minZoom: js.UndefOr[Double] = js.native
  /** If true, do not clear the contents of the Map div. */
  var noClear: js.UndefOr[Boolean] = js.native
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
  var panControl: js.UndefOr[Boolean] = js.native
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
  var panControlOptions: js.UndefOr[PanControlOptions] = js.native
  /**
    * Defines a boundary that restricts the area of the map accessible to users.
    * When set, a user can only pan and zoom while the camera view stays inside the
    * limits of the boundary.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#MapOptions.restriction Maps JavaScript API}
    */
  var restriction: js.UndefOr[MapRestriction] = js.native
  /** The enabled/disabled state of the Rotate control. */
  var rotateControl: js.UndefOr[Boolean] = js.native
  /** The display options for the Rotate control. */
  var rotateControlOptions: js.UndefOr[RotateControlOptions] = js.native
  /** The initial enabled/disabled state of the Scale control. */
  var scaleControl: js.UndefOr[Boolean] = js.native
  /** The initial display options for the Scale control. */
  var scaleControlOptions: js.UndefOr[ScaleControlOptions] = js.native
  /**
    * If false, disables scrollwheel zooming on the map. The scrollwheel is
    * enabled by default.
    */
  var scrollwheel: js.UndefOr[Boolean] = js.native
  /**
    * A StreetViewPanorama to display when the Street View pegman is dropped on
    * the map. If no panorama is specified, a default StreetViewPanorama will
    * be displayed in the map's div when the pegman is dropped.
    */
  var streetView: js.UndefOr[StreetViewPanorama] = js.native
  /**
    * The initial enabled/disabled state of the Street View Pegman control.
    * This control is part of the default UI, and should be set to false when
    * displaying a map type on which the Street View road overlay should not
    * appear (e.g. a non-Earth map type).
    */
  var streetViewControl: js.UndefOr[Boolean] = js.native
  /** The initial display options for the Street View Pegman control. */
  var streetViewControlOptions: js.UndefOr[StreetViewControlOptions] = js.native
  /**
    * Styles to apply to each of the default map types. Note that for
    * satellite/hybrid and terrain modes, these styles will only apply to
    * labels and geometry.
    */
  var styles: js.UndefOr[js.Array[MapTypeStyle]] = js.native
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
  var tilt: js.UndefOr[Double] = js.native
  /**
    * The initial Map zoom level. Required. Valid values: Integers between
    * zero, and up to the supported maximum zoom level.
    */
  var zoom: js.UndefOr[Double] = js.native
  /** The enabled/disabled state of the Zoom control. */
  var zoomControl: js.UndefOr[Boolean] = js.native
  /** The display options for the Zoom control. */
  var zoomControlOptions: js.UndefOr[ZoomControlOptions] = js.native
}

object MapOptions {
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setCenter(value: LatLng | LatLngLiteral): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setClickableIcons(value: Boolean): Self = this.set("clickableIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickableIcons: Self = this.set("clickableIcons", js.undefined)
    @scala.inline
    def setControlSize(value: Double): Self = this.set("controlSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlSize: Self = this.set("controlSize", js.undefined)
    @scala.inline
    def setDisableDefaultUI(value: Boolean): Self = this.set("disableDefaultUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDefaultUI: Self = this.set("disableDefaultUI", js.undefined)
    @scala.inline
    def setDisableDoubleClickZoom(value: Boolean): Self = this.set("disableDoubleClickZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDoubleClickZoom: Self = this.set("disableDoubleClickZoom", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setDraggableCursor(value: String): Self = this.set("draggableCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggableCursor: Self = this.set("draggableCursor", js.undefined)
    @scala.inline
    def setDraggingCursor(value: String): Self = this.set("draggingCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggingCursor: Self = this.set("draggingCursor", js.undefined)
    @scala.inline
    def setFullscreenControl(value: Boolean): Self = this.set("fullscreenControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreenControl: Self = this.set("fullscreenControl", js.undefined)
    @scala.inline
    def setFullscreenControlOptions(value: FullscreenControlOptions): Self = this.set("fullscreenControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreenControlOptions: Self = this.set("fullscreenControlOptions", js.undefined)
    @scala.inline
    def setGestureHandling(value: GestureHandlingOptions): Self = this.set("gestureHandling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureHandling: Self = this.set("gestureHandling", js.undefined)
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    @scala.inline
    def setKeyboardShortcuts(value: Boolean): Self = this.set("keyboardShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardShortcuts: Self = this.set("keyboardShortcuts", js.undefined)
    @scala.inline
    def setMapTypeControl(value: Boolean): Self = this.set("mapTypeControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeControl: Self = this.set("mapTypeControl", js.undefined)
    @scala.inline
    def setMapTypeControlOptions(value: MapTypeControlOptions): Self = this.set("mapTypeControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeControlOptions: Self = this.set("mapTypeControlOptions", js.undefined)
    @scala.inline
    def setMapTypeId(value: MapTypeId | String): Self = this.set("mapTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeId: Self = this.set("mapTypeId", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setNoClear(value: Boolean): Self = this.set("noClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoClear: Self = this.set("noClear", js.undefined)
    @scala.inline
    def setPanControl(value: Boolean): Self = this.set("panControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanControl: Self = this.set("panControl", js.undefined)
    @scala.inline
    def setPanControlOptions(value: PanControlOptions): Self = this.set("panControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanControlOptions: Self = this.set("panControlOptions", js.undefined)
    @scala.inline
    def setRestriction(value: MapRestriction): Self = this.set("restriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestriction: Self = this.set("restriction", js.undefined)
    @scala.inline
    def setRotateControl(value: Boolean): Self = this.set("rotateControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateControl: Self = this.set("rotateControl", js.undefined)
    @scala.inline
    def setRotateControlOptions(value: RotateControlOptions): Self = this.set("rotateControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateControlOptions: Self = this.set("rotateControlOptions", js.undefined)
    @scala.inline
    def setScaleControl(value: Boolean): Self = this.set("scaleControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleControl: Self = this.set("scaleControl", js.undefined)
    @scala.inline
    def setScaleControlOptions(value: ScaleControlOptions): Self = this.set("scaleControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleControlOptions: Self = this.set("scaleControlOptions", js.undefined)
    @scala.inline
    def setScrollwheel(value: Boolean): Self = this.set("scrollwheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollwheel: Self = this.set("scrollwheel", js.undefined)
    @scala.inline
    def setStreetView(value: StreetViewPanorama): Self = this.set("streetView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetView: Self = this.set("streetView", js.undefined)
    @scala.inline
    def setStreetViewControl(value: Boolean): Self = this.set("streetViewControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetViewControl: Self = this.set("streetViewControl", js.undefined)
    @scala.inline
    def setStreetViewControlOptions(value: StreetViewControlOptions): Self = this.set("streetViewControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetViewControlOptions: Self = this.set("streetViewControlOptions", js.undefined)
    @scala.inline
    def setStylesVarargs(value: MapTypeStyle*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[MapTypeStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTilt(value: Double): Self = this.set("tilt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilt: Self = this.set("tilt", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    @scala.inline
    def setZoomControl(value: Boolean): Self = this.set("zoomControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomControl: Self = this.set("zoomControl", js.undefined)
    @scala.inline
    def setZoomControlOptions(value: ZoomControlOptions): Self = this.set("zoomControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomControlOptions: Self = this.set("zoomControlOptions", js.undefined)
  }
  
}

