package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import typings.highcharts.anon.PartialMapViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The map view handles zooming and centering on the map, and various
  * client-side projection capabilities.
  *
  * On a chart instance of `MapChart`, the map view is available as
  * `chart.mapView`.
  */
@js.native
trait MapView extends StObject {
  
  /**
    * The current center of the view in terms of `[longitude, latitude]`.
    */
  val center: LonLatArray = js.native
  
  /**
    * Fit the view to given bounds
    *
    * @param bounds
    *        Bounds in terms of projected units given as `{ x1, y1, x2, y2
    *        }`. If not set, fit to the bounds of the current data set
    *
    * @param padding
    *        Padding inside the bounds. A number signifies pixels, while a
    *        percentage string (like `5%`) can be used as a fraction of the
    *        plot area size.
    *
    * @param redraw
    *        Whether to redraw the chart immediately
    *
    * @param animation
    *        What animation to use for redraw
    */
  def fitToBounds(bounds: js.Object): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: String): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: String, redraw: Boolean): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: String, redraw: Boolean, animation: Boolean): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: String, redraw: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: String, redraw: Unit, animation: Boolean): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: String, redraw: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: Double): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: Double, redraw: Boolean): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: Double, redraw: Boolean, animation: Boolean): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: Double, redraw: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: Double, redraw: Unit, animation: Boolean): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: Double, redraw: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: Unit, redraw: Boolean): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: Unit, redraw: Boolean, animation: Boolean): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: Unit, redraw: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: Unit, redraw: Unit, animation: Boolean): Unit = js.native
  def fitToBounds(bounds: js.Object, padding: Unit, redraw: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  
  /**
    * Convert map coordinates in longitude/latitude to pixels
    *
    * @param lonLat
    *        The map coordinates
    *
    * @return The pixel position
    */
  def lonLatToPixels(lonLat: MapLonLatObject): js.UndefOr[PositionObject] = js.native
  
  /**
    * Get projected units from longitude/latitude. Insets are accounted
    * for. Returns an object with x and y values corresponding to positions
    * on the projected plane.
    *
    * @param lonLat
    *        Coordinates.
    *
    * @return X and Y coordinates in terms of projected values
    */
  def lonLatToProjectedUnits(lonLat: MapLonLatObject): typings.highcharts.modulesMapMod.highchartsAugmentingMod.ProjectedXY = js.native
  
  /**
    * Convert pixel position to longitude and latitude.
    *
    * @param pos
    *        The position in pixels
    *
    * @return The map coordinates
    */
  def pixelsToLonLat(pos: PositionObject): js.UndefOr[MapLonLatObject] = js.native
  
  /**
    * Convert pixel position to projected units
    *
    * @param pos
    *        The position in pixels
    *
    * @return The position in projected units
    */
  def pixelsToProjectedUnits(pos: PositionObject): PositionObject = js.native
  
  /**
    * Calculate longitude/latitude values for a point or position. Returns
    * an object with the numeric properties `lon` and `lat`.
    *
    * @param point
    *        A `Point` instance or anything containing `x` and `y`
    *        properties with numeric values.
    *
    * @return An object with `lat` and `lon` properties.
    */
  def projectedUnitsToLonLat(point: typings.highcharts.modulesMapMod.highchartsAugmentingMod.Point): js.UndefOr[MapLonLatObject] = js.native
  def projectedUnitsToLonLat(point: typings.highcharts.modulesMapMod.highchartsAugmentingMod.ProjectedXY): js.UndefOr[MapLonLatObject] = js.native
  
  /**
    * Convert projected units to pixel position
    *
    * @param pos
    *        The position in projected units
    *
    * @return The position in pixels
    */
  def projectedUnitsToPixels(pos: PositionObject): PositionObject = js.native
  
  def setView(center: Unit, zoom: Double): Unit = js.native
  def setView(center: Unit, zoom: Double, redraw: Boolean): Unit = js.native
  def setView(center: Unit, zoom: Double, redraw: Boolean, animation: Boolean): Unit = js.native
  def setView(center: Unit, zoom: Double, redraw: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def setView(center: Unit, zoom: Double, redraw: Unit, animation: Boolean): Unit = js.native
  def setView(center: Unit, zoom: Double, redraw: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  /**
    * Set the view to given center and zoom values.
    *
    * @param center
    *        The center point
    *
    * @param zoom
    *        The zoom level
    *
    * @param redraw
    *        Whether to redraw immediately
    *
    * @param animation
    *        Animation options for the redraw
    */
  def setView(center: LonLatArray, zoom: Double): Unit = js.native
  def setView(center: LonLatArray, zoom: Double, redraw: Boolean): Unit = js.native
  def setView(center: LonLatArray, zoom: Double, redraw: Boolean, animation: Boolean): Unit = js.native
  def setView(center: LonLatArray, zoom: Double, redraw: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def setView(center: LonLatArray, zoom: Double, redraw: Unit, animation: Boolean): Unit = js.native
  def setView(center: LonLatArray, zoom: Double, redraw: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  
  /**
    * Update the view with given options
    *
    * @param options
    *        The new map view options to apply
    *
    * @param redraw
    *        Whether to redraw immediately
    *
    * @param animation
    *        The animation to apply to a the redraw
    */
  def update(options: PartialMapViewOptions): Unit = js.native
  def update(options: PartialMapViewOptions, redraw: Boolean): Unit = js.native
  def update(options: PartialMapViewOptions, redraw: Boolean, animation: Boolean): Unit = js.native
  def update(options: PartialMapViewOptions, redraw: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def update(options: PartialMapViewOptions, redraw: Unit, animation: Boolean): Unit = js.native
  def update(options: PartialMapViewOptions, redraw: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  
  /**
    * The current zoom level of the view.
    */
  val zoom: Double = js.native
  
  /**
    * Zoom the map view by a given number
    *
    * @param howMuch
    *        The amount of zoom to apply. 1 zooms in on half the current
    *        view, -1 zooms out. Pass `undefined` to zoom to the full
    *        bounds of the map.
    *
    * @param coords
    *        Optional map coordinates to keep fixed
    *
    * @param chartCoords
    *        Optional chart coordinates to keep fixed, in pixels
    *
    * @param animation
    *        The animation to apply to a the redraw
    */
  def zoomBy(): Unit = js.native
  def zoomBy(howMuch: Double): Unit = js.native
  def zoomBy(howMuch: Double, coords: Unit, chartCoords: js.Array[Double]): Unit = js.native
  def zoomBy(howMuch: Double, coords: Unit, chartCoords: js.Array[Double], animation: Boolean): Unit = js.native
  def zoomBy(howMuch: Double, coords: Unit, chartCoords: js.Array[Double], animation: PartialAnimationOptionsOb): Unit = js.native
  def zoomBy(howMuch: Double, coords: Unit, chartCoords: Unit, animation: Boolean): Unit = js.native
  def zoomBy(howMuch: Double, coords: Unit, chartCoords: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  def zoomBy(howMuch: Double, coords: LonLatArray): Unit = js.native
  def zoomBy(howMuch: Double, coords: LonLatArray, chartCoords: js.Array[Double]): Unit = js.native
  def zoomBy(howMuch: Double, coords: LonLatArray, chartCoords: js.Array[Double], animation: Boolean): Unit = js.native
  def zoomBy(
    howMuch: Double,
    coords: LonLatArray,
    chartCoords: js.Array[Double],
    animation: PartialAnimationOptionsOb
  ): Unit = js.native
  def zoomBy(howMuch: Double, coords: LonLatArray, chartCoords: Unit, animation: Boolean): Unit = js.native
  def zoomBy(howMuch: Double, coords: LonLatArray, chartCoords: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  def zoomBy(howMuch: Unit, coords: Unit, chartCoords: js.Array[Double]): Unit = js.native
  def zoomBy(howMuch: Unit, coords: Unit, chartCoords: js.Array[Double], animation: Boolean): Unit = js.native
  def zoomBy(howMuch: Unit, coords: Unit, chartCoords: js.Array[Double], animation: PartialAnimationOptionsOb): Unit = js.native
  def zoomBy(howMuch: Unit, coords: Unit, chartCoords: Unit, animation: Boolean): Unit = js.native
  def zoomBy(howMuch: Unit, coords: Unit, chartCoords: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  def zoomBy(howMuch: Unit, coords: LonLatArray): Unit = js.native
  def zoomBy(howMuch: Unit, coords: LonLatArray, chartCoords: js.Array[Double]): Unit = js.native
  def zoomBy(howMuch: Unit, coords: LonLatArray, chartCoords: js.Array[Double], animation: Boolean): Unit = js.native
  def zoomBy(
    howMuch: Unit,
    coords: LonLatArray,
    chartCoords: js.Array[Double],
    animation: PartialAnimationOptionsOb
  ): Unit = js.native
  def zoomBy(howMuch: Unit, coords: LonLatArray, chartCoords: Unit, animation: Boolean): Unit = js.native
  def zoomBy(howMuch: Unit, coords: LonLatArray, chartCoords: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
}
