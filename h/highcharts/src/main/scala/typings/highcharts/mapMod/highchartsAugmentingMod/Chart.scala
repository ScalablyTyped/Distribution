package typings.highcharts.mapMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart extends js.Object {
  
  /**
    * Highmaps only. Get chart coordinates from latitude/longitude. Returns
    * an object with x and y values corresponding to the `xAxis` and
    * `yAxis`.
    *
    * @param latLon
    *        Coordinates.
    *
    * @return X and Y coordinates in terms of chart axis values.
    */
  def fromLatLonToPoint(latLon: MapLatLonObject): MapCoordinateObject = js.native
  
  /**
    * Highmaps only. Calculate latitude/longitude values for a point.
    * Returns an object with the numeric properties `lat` and `lon`.
    *
    * @param point
    *        A `Point` instance or anything containing `x` and `y`
    *        properties with numeric values.
    *
    * @return An object with `lat` and `lon` properties.
    */
  def fromPointToLatLon(point: MapCoordinateObject): js.UndefOr[MapLatLonObject] = js.native
  def fromPointToLatLon(point: Point): js.UndefOr[MapLatLonObject] = js.native
  
  /**
    * Highmaps only. Zoom in or out of the map. See also Point#zoomTo. See
    * Chart#fromLatLonToPoint for how to get the `centerX` and `centerY`
    * parameters for a geographic location.
    *
    * @param howMuch
    *        How much to zoom the map. Values less than 1 zooms in. 0.5
    *        zooms in to half the current view. 2 zooms to twice the
    *        current view. If omitted, the zoom is reset.
    *
    * @param centerX
    *        The X axis position to center around if available space.
    *
    * @param centerY
    *        The Y axis position to center around if available space.
    *
    * @param mouseX
    *        Fix the zoom to this position if possible. This is used for
    *        example in mousewheel events, where the area under the mouse
    *        should be fixed as we zoom in.
    *
    * @param mouseY
    *        Fix the zoom to this position if possible.
    */
  def mapZoom(): Unit = js.native
  def mapZoom(
    howMuch: js.UndefOr[scala.Nothing],
    centerX: js.UndefOr[scala.Nothing],
    centerY: js.UndefOr[scala.Nothing],
    mouseX: js.UndefOr[scala.Nothing],
    mouseY: Double
  ): Unit = js.native
  def mapZoom(
    howMuch: js.UndefOr[scala.Nothing],
    centerX: js.UndefOr[scala.Nothing],
    centerY: js.UndefOr[scala.Nothing],
    mouseX: Double
  ): Unit = js.native
  def mapZoom(
    howMuch: js.UndefOr[scala.Nothing],
    centerX: js.UndefOr[scala.Nothing],
    centerY: js.UndefOr[scala.Nothing],
    mouseX: Double,
    mouseY: Double
  ): Unit = js.native
  def mapZoom(howMuch: js.UndefOr[scala.Nothing], centerX: js.UndefOr[scala.Nothing], centerY: Double): Unit = js.native
  def mapZoom(
    howMuch: js.UndefOr[scala.Nothing],
    centerX: js.UndefOr[scala.Nothing],
    centerY: Double,
    mouseX: js.UndefOr[scala.Nothing],
    mouseY: Double
  ): Unit = js.native
  def mapZoom(
    howMuch: js.UndefOr[scala.Nothing],
    centerX: js.UndefOr[scala.Nothing],
    centerY: Double,
    mouseX: Double
  ): Unit = js.native
  def mapZoom(
    howMuch: js.UndefOr[scala.Nothing],
    centerX: js.UndefOr[scala.Nothing],
    centerY: Double,
    mouseX: Double,
    mouseY: Double
  ): Unit = js.native
  def mapZoom(howMuch: js.UndefOr[scala.Nothing], centerX: Double): Unit = js.native
  def mapZoom(
    howMuch: js.UndefOr[scala.Nothing],
    centerX: Double,
    centerY: js.UndefOr[scala.Nothing],
    mouseX: js.UndefOr[scala.Nothing],
    mouseY: Double
  ): Unit = js.native
  def mapZoom(
    howMuch: js.UndefOr[scala.Nothing],
    centerX: Double,
    centerY: js.UndefOr[scala.Nothing],
    mouseX: Double
  ): Unit = js.native
  def mapZoom(
    howMuch: js.UndefOr[scala.Nothing],
    centerX: Double,
    centerY: js.UndefOr[scala.Nothing],
    mouseX: Double,
    mouseY: Double
  ): Unit = js.native
  def mapZoom(howMuch: js.UndefOr[scala.Nothing], centerX: Double, centerY: Double): Unit = js.native
  def mapZoom(
    howMuch: js.UndefOr[scala.Nothing],
    centerX: Double,
    centerY: Double,
    mouseX: js.UndefOr[scala.Nothing],
    mouseY: Double
  ): Unit = js.native
  def mapZoom(howMuch: js.UndefOr[scala.Nothing], centerX: Double, centerY: Double, mouseX: Double): Unit = js.native
  def mapZoom(
    howMuch: js.UndefOr[scala.Nothing],
    centerX: Double,
    centerY: Double,
    mouseX: Double,
    mouseY: Double
  ): Unit = js.native
  def mapZoom(howMuch: Double): Unit = js.native
  def mapZoom(
    howMuch: Double,
    centerX: js.UndefOr[scala.Nothing],
    centerY: js.UndefOr[scala.Nothing],
    mouseX: js.UndefOr[scala.Nothing],
    mouseY: Double
  ): Unit = js.native
  def mapZoom(
    howMuch: Double,
    centerX: js.UndefOr[scala.Nothing],
    centerY: js.UndefOr[scala.Nothing],
    mouseX: Double
  ): Unit = js.native
  def mapZoom(
    howMuch: Double,
    centerX: js.UndefOr[scala.Nothing],
    centerY: js.UndefOr[scala.Nothing],
    mouseX: Double,
    mouseY: Double
  ): Unit = js.native
  def mapZoom(howMuch: Double, centerX: js.UndefOr[scala.Nothing], centerY: Double): Unit = js.native
  def mapZoom(
    howMuch: Double,
    centerX: js.UndefOr[scala.Nothing],
    centerY: Double,
    mouseX: js.UndefOr[scala.Nothing],
    mouseY: Double
  ): Unit = js.native
  def mapZoom(howMuch: Double, centerX: js.UndefOr[scala.Nothing], centerY: Double, mouseX: Double): Unit = js.native
  def mapZoom(
    howMuch: Double,
    centerX: js.UndefOr[scala.Nothing],
    centerY: Double,
    mouseX: Double,
    mouseY: Double
  ): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double): Unit = js.native
  def mapZoom(
    howMuch: Double,
    centerX: Double,
    centerY: js.UndefOr[scala.Nothing],
    mouseX: js.UndefOr[scala.Nothing],
    mouseY: Double
  ): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double, centerY: js.UndefOr[scala.Nothing], mouseX: Double): Unit = js.native
  def mapZoom(
    howMuch: Double,
    centerX: Double,
    centerY: js.UndefOr[scala.Nothing],
    mouseX: Double,
    mouseY: Double
  ): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double, centerY: Double): Unit = js.native
  def mapZoom(
    howMuch: Double,
    centerX: Double,
    centerY: Double,
    mouseX: js.UndefOr[scala.Nothing],
    mouseY: Double
  ): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double, centerY: Double, mouseX: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double, centerY: Double, mouseX: Double, mouseY: Double): Unit = js.native
  
  /**
    * Highmaps only. Get point from latitude and longitude using specified
    * transform definition.
    *
    * @param latLon
    *        A latitude/longitude object.
    *
    * @param transform
    *        The transform definition to use as explained in the
    *        documentation.
    *
    * @return An object with `x` and `y` properties.
    */
  def transformFromLatLon(latLon: MapLatLonObject, transform: js.Any): MapCoordinateObject = js.native
  
  /**
    * Highmaps only. Get latLon from point using specified transform
    * definition. The method returns an object with the numeric properties
    * `lat` and `lon`.
    *
    * @param point
    *        A `Point` instance, or any object containing the properties
    *        `x` and `y` with numeric values.
    *
    * @param transform
    *        The transform definition to use as explained in the
    *        documentation.
    *
    * @return An object with `lat` and `lon` properties.
    */
  def transformToLatLon(point: MapCoordinateObject, transform: js.Any): js.UndefOr[MapLatLonObject] = js.native
  def transformToLatLon(point: Point, transform: js.Any): js.UndefOr[MapLatLonObject] = js.native
}
