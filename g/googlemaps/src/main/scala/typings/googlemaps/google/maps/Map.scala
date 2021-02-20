package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.bounds_changed
import typings.googlemaps.googlemapsStrings.center_changed
import typings.googlemaps.googlemapsStrings.click
import typings.googlemaps.googlemapsStrings.dblclick
import typings.googlemaps.googlemapsStrings.drag
import typings.googlemaps.googlemapsStrings.dragend
import typings.googlemaps.googlemapsStrings.dragstart
import typings.googlemaps.googlemapsStrings.heading_changed
import typings.googlemaps.googlemapsStrings.idle
import typings.googlemaps.googlemapsStrings.maptypeid_changed
import typings.googlemaps.googlemapsStrings.mousemove
import typings.googlemaps.googlemapsStrings.mouseout
import typings.googlemaps.googlemapsStrings.mouseover
import typings.googlemaps.googlemapsStrings.projection_changed
import typings.googlemaps.googlemapsStrings.rightclick
import typings.googlemaps.googlemapsStrings.tilesloaded
import typings.googlemaps.googlemapsStrings.tilt_changed
import typings.googlemaps.googlemapsStrings.zoom_changed
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map Maps JavaScript API} */
@js.native
trait Map[E /* <: Element */] extends MVCObject {
  
  /**
    * @see {@link MapHandlerMap#bounds_changed bounds_changed} event
    * @see {@link MapHandlerMap#center_changed center_changed} event
    * @see {@link MapHandlerMap#click click} event
    * @see {@link MapHandlerMap#dblclick dblclick} event
    * @see {@link MapHandlerMap#drag drag} event
    * @see {@link MapHandlerMap#dragend dragend} event
    * @see {@link MapHandlerMap#dragstart dragstart} event
    * @see {@link MapHandlerMap#heading_changed heading_changed} event
    * @see {@link MapHandlerMap#idle idle} event
    * @see {@link MapHandlerMap#maptypeid_changed maptypeid_changed} event
    * @see {@link MapHandlerMap#mousemove mousemove} event
    * @see {@link MapHandlerMap#mouseout mouseout} event
    * @see {@link MapHandlerMap#mouseover mouseover} event
    * @see {@link MapHandlerMap#projection_changed projection_changed} event
    * @see {@link MapHandlerMap#rightclick rightclick} event
    * @see {@link MapHandlerMap#tilesloaded tilesloaded} event
    * @see {@link MapHandlerMap#tilt_changed tilt_changed} event
    * @see {@link MapHandlerMap#zoom_changed zoom_changed} event
    */
  def addListener[N /* <: /* keyof googlemaps.google.maps.MapHandlerMap<this> */ bounds_changed | center_changed | click | dblclick | drag | dragend | dragstart | heading_changed | idle | maptypeid_changed | mousemove | mouseout | mouseover | projection_changed | rightclick | tilesloaded | tilt_changed | zoom_changed */](
    eventName: N,
    handler: /* import warning: importer.ImportType#apply Failed type conversion: googlemaps.google.maps.MapHandlerMap<this>[N] */ js.Any
  ): MapsEventListener = js.native
  
  /**
    * Additional controls to attach to the map.
    * To add a control to the map, add the control's `<div>` to the {@link MVCArray} corresponding to the {@link ControlPosition} where it should be rendered.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.controls Maps JavaScript API}
    */
  var controls: js.Array[MVCArray[Node]] = js.native
  
  /**
    * An instance of {@link Data}, bound to the map.
    * Add features to this Data object to conveniently display them on this map.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.data Maps JavaScript API}
    */
  var data: Data = js.native
  
  /**
    * Sets the viewport to contain the given bounds.
    * Note: When the map is set to `display: none`, the `fitBounds` function reads the map's size as 0x0, and therefore does not do anything.
    * To change the viewport while the map is hidden, set the map to `visibility: hidden`, thereby ensuring the map div has an actual size.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.fitBounds Maps JavaScript API}
    * @see {@link MapHandlerMap#bounds_changed event bounds_changed}
    * @see {@link getBounds}
    * @see {@link panBy}
    * @see {@link panTo}
    * @see {@link panToBounds}
    * @see {@link setCenter}
    */
  def fitBounds(bounds: LatLngBounds): Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral): Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral, padding: Double): Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral, padding: Padding): Unit = js.native
  def fitBounds(bounds: LatLngBounds, padding: Double): Unit = js.native
  def fitBounds(bounds: LatLngBounds, padding: Padding): Unit = js.native
  
  /**
    * Returns the lat/lng bounds of the current viewport.
    * If more than one copy of the world is visible, the bounds range in longitude from -180 to 180 degrees inclusive.
    * If the map is not yet initialized (i.e. the mapType is still null), or center and zoom have not been set then the result is `null` or `undefined`.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.getBounds Maps JavaScript API}
    * @see {@link MapHandlerMap#bounds_changed bounds_changed} event
    * @see {@link fitBounds}
    * @see {@link getCenter}
    * @see {@link panToBounds}
    */
  def getBounds(): js.UndefOr[LatLngBounds | Null] = js.native
  
  /**
    * Returns the position displayed at the center of the map.
    * Note that this {@link LatLng} object is not wrapped.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.getCenter Maps JavaScript API}
    * @see {@link MapOptions#center}
    * @see {@link MapHandlerMap#center_changed center_changed} event
    * @see {@link getBounds}
    * @see {@link setCenter}
    */
  def getCenter(): LatLng = js.native
  
  /**
    * Returns the clickability of the map icons.
    * A map icon represents a point of interest, also known as a POI.
    * If the returned value is true, then the icons are clickable on the map.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.getClickableIcons Maps JavaScript API}
    * @see {@link MapOptions#clickableIcons}
    * @see {@link setClickableIcons}
    */
  def getClickableIcons(): Boolean = js.native
  
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.getDiv Maps JavaScript API} */
  def getDiv(): E = js.native
  
  /**
    * Returns the compass heading of aerial imagery.
    * The heading value is measured in degrees (clockwise) from cardinal direction North.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.getHeading Maps JavaScript API}
    * @see {@link MapOptions#heading}
    * @see {@link MapHandlerMap#heading_changed heading_changed} event
    * @see {@link setHeading}
    */
  def getHeading(): Double = js.native
  
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.getMapTypeId Maps JavaScript API}
    * @see {@link MapOptions#mapTypeId}
    * @see {@link MapHandlerMap#maptypeid_changed maptypeid_changed} event
    * @see {@link setMapTypeId}
    * @see {@link mapTypes}
    * @see {@link overlayMapTypes}
    */
  def getMapTypeId(): MapTypeId = js.native
  
  /**
    * If the map is not yet initialized (i.e. the mapType is still `null`) then the result is `null`.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.getProjection Maps JavaScript API}
    * @see {@link MapHandlerMap#projection_changed projection_changed} event
    */
  def getProjection(): Projection | Null = js.native
  
  /**
    * Returns the default {@link StreetViewPanorama} bound to the map, which may be a default panorama embedded within the map, or the panorama set using {@link setStreetView}().
    * Changes to the map's {@link MapOptions#streetViewControl streetViewControl} will be reflected in the display of such a bound panorama.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.getStreetView Maps JavaScript API}
    * @see {@link MapOptions#streetView}
    * @see {@link setStreetView}
    */
  def getStreetView(): StreetViewPanorama = js.native
  
  /**
    * Returns the current angle of incidence of the map, in degrees from the viewport plane to the map plane.
    * The result will be 0 for imagery taken directly overhead or 45 for 45° imagery.
    * 45° imagery is only available for satellite and hybrid map types, within some locations, and at some zoom levels.
    * Note: This method does not return the value set by setTilt. See setTilt for details.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.getTilt Maps JavaScript API}
    * @see {@link MapOptions#tilt}
    * @see {@link MapHandlerMap#tilt_changed tilt_changed} event
    * @see {@link setTilt}
    */
  def getTilt(): Double = js.native
  
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.getZoom Maps JavaScript API}
    * @see {@link MapOptions#zoom}
    * @see {@link MapHandlerMap#zoom_changed zoom_changed} event
    * @see {@link getBounds}
    * @see {@link setZoom}
    */
  def getZoom(): Double = js.native
  
  /**
    * A registry of {@link MapType} instances by string ID.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.mapTypes Maps JavaScript API}
    */
  var mapTypes: MapTypeRegistry = js.native
  
  /**
    * Additional map types to overlay.
    * Overlay map types will display on top of the base map they are attached to, in the order in which they appear in the
    * `overlayMapTypes` array (overlays with higher index values are displayed in front of overlays with lower index values).
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.overlayMapTypes Maps JavaScript API}
    */
  var overlayMapTypes: MVCArray[MapType] = js.native
  
  /**
    * Changes the center of the map by the given distance in pixels.
    * If the distance is less than both the width and height of the map, the transition will be smoothly animated.
    * Note that the map coordinate system increases from west to east (for x values) and north to south (for y values).
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.panBy Maps JavaScript API}
    * @see {@link panTo}
    * @see {@link panToBounds}
    * @see {@link setCenter}
    */
  def panBy(x: Double, y: Double): Unit = js.native
  
  /**
    * Changes the center of the map to the given {@link LatLng}.
    * If the change is less than both the width and height of the map, the transition will be smoothly animated.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.panTo Maps JavaScript API}
    * @see {@link panBy}
    * @see {@link panToBounds}
    * @see {@link setCenter}
    */
  def panTo(latLng: LatLng): Unit = js.native
  def panTo(latLng: LatLngLiteral): Unit = js.native
  
  /**
    * Pans the map by the minimum amount necessary to contain the given {@link LatLngBounds}.
    * It makes no guarantee where on the map the bounds will be,
    * except that the map will be panned to show as much of the bounds as possible inside `{currentMapSizeInPx} - {padding}`.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.panToBounds Maps JavaScript API}
    * @see {@link panBy}
    * @see {@link panTo}
    * @see {@link setCenter}
    */
  def panToBounds(latLngBounds: LatLngBounds): Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral): Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral, padding: Double): Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral, padding: Padding): Unit = js.native
  def panToBounds(latLngBounds: LatLngBounds, padding: Double): Unit = js.native
  def panToBounds(latLngBounds: LatLngBounds, padding: Padding): Unit = js.native
  
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.setCenter Maps JavaScript API}
    * @see {@link MapOptions#center}
    * @see {@link MapHandlerMap#center_changed center_changed} event
    * @see {@link fitBounds}
    * @see {@link getCenter}
    * @see {@link panBy}
    * @see {@link panTo}
    * @see {@link panToBounds}
    */
  def setCenter(latlng: LatLng): Unit = js.native
  def setCenter(latlng: LatLngLiteral): Unit = js.native
  
  /**
    * Controls whether the map icons are clickable or not. A map icon represents a point of interest, also known as a POI.
    * To disable the clickability of map icons, pass a value of `false` to this method.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.setClickableIcons Maps JavaScript API}
    * @see {@link MapOptions#clickableIcons}
    * @see {@link getClickableIcons}
    */
  def setClickableIcons(clickable: Boolean): Unit = js.native
  
  /**
    * Sets the compass heading for aerial imagery measured in degrees from cardinal direction North.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.setHeading Maps JavaScript API}
    * @see {@link MapOptions#heading}
    * @see {@link MapHandlerMap#heading_changed} event
    * @see {@link getHeading}
    */
  def setHeading(heading: Double): Unit = js.native
  
  def setMapTypeId(mapTypeId: String): Unit = js.native
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.setMapTypeId Maps JavaScript API}
    * @see {@link MapOptions#mapTypeId}
    * @see {@link MapHandlerMap#maptypeid_changed} event
    * @see {@link getMapTypeId}
    * @see {@link mapTypes}
    * @see {@link overlayMapTypes}
    */
  def setMapTypeId(mapTypeId: MapTypeId): Unit = js.native
  
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.setOptions Maps JavaScript API} */
  def setOptions(options: MapOptions): Unit = js.native
  
  /**
    * Binds a {@link StreetViewPanorama} to the map.
    * This panorama overrides the default {@link StreetViewPanorama}, allowing the map to bind to an external panorama outside of the map.
    * Setting the panorama to `null` binds the default embedded panorama back to the map.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.setStreetView Maps JavaScript API}
    * @see {@link MapOptions#streetView}
    * @see {@link getStreetView}
    */
  def setStreetView(): Unit = js.native
  def setStreetView(panorama: StreetViewPanorama): Unit = js.native
  
  /**
    * Controls the automatic switching behavior for the angle of incidence of the map.
    * The only allowed values are `0` and `45`.
    * `setTilt(0)` causes the map to always use a 0° overhead view regardless of the zoom level and viewport.
    * `setTilt(45)` causes the tilt angle to automatically switch to 45 whenever 45° imagery is available for the current zoom level and viewport,
    * and switch back to 0 whenever 45° imagery is not available (this is the default behavior).
    * 45° imagery is only available for {@link MapTypeId.SATELLITE satellite} and {@link MapTypeId.HYBRID hybrid} map types, within some locations, and at some zoom levels.
    * Note: getTilt returns the current tilt angle, not the value set by `setTilt`.
    * Because getTilt and setTilt refer to different things, do not `bind`() the `tilt` property; doing so may yield unpredictable effects.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.setTilt Maps JavaScript API}
    * @see {@link MapOptions#tilt}
    * @see {@link MapHandlerMap#tilt_changed}
    * @see {@link getTilt}
    */
  def setTilt(tilt: Double): Unit = js.native
  
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.setZoom Maps JavaScript API}
    * @see {@link MapOptions#zoom}
    * @see {@link MapHandlerMap#zoom_changed zoom_changed} event
    * @see {@link fitBounds}
    * @see {@link getZoom}
    * @see {@link panToBounds}
    */
  def setZoom(zoom: Double): Unit = js.native
}
