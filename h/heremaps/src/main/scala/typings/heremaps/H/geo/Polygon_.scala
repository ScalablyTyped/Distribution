package typings.heremaps.H.geo

import typings.heremaps.H.geo.Polygon.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @link https://developer.here.com/documentation/maps/api_reference/H.geo.Polygon.html
  */
@js.native
trait Polygon_ extends AbstractGeometry {
  
  def getExterior(): LineString = js.native
  
  def getInteriors(): js.Array[LineString] = js.native
  
  def getPoleCovering(): Direction = js.native
  
  /**
    * To add an interior ring.
    * @param interior - The interior ring to add.
    * @throws {@link H.lang.InvalidArgumentError}
    */
  def pushInterior(interior: LineString): Unit = js.native
  
  /**
    * To remove the specified interior ring.
    * @param interior - The interior ring to remove.
    */
  def removeInterior(interior: LineString): js.UndefOr[LineString] = js.native
  
  /**
    * To remove an interior ring at the given index.
    * @param opt_index - The index of the interior ring to remove, defaults to 0.
    */
  def removeInteriorAt(): js.UndefOr[LineString] = js.native
  def removeInteriorAt(opt_index: Double): js.UndefOr[LineString] = js.native
  
  /**
    * To set the exterior ring of the polygon.
    * @param exterior - The exterior ring to set
    */
  def setExterior(exterior: LineString): Unit = js.native
  
  /**
    * To specify whether this polygon covers the North or the South Pole.
    * This information is only needed for very special polygons that are defined as a line string around the world on longitude axis (for example along the coast of the Antarctic).
    * In such cases, an additional information is needed to know if the southern part of the Earth (Antarctic) or the northern part (anything except Antarctic) should be covered.
    * @param direction - The direction to set.
    */
  def setPoleCovering(direction: Direction): Polygon = js.native
  
  def spliceInteriors(
    opt_index: js.UndefOr[scala.Nothing],
    opt_deleteCount: js.UndefOr[scala.Nothing],
    var_args: LineString*
  ): js.Array[LineString] = js.native
  def spliceInteriors(opt_index: js.UndefOr[scala.Nothing], opt_deleteCount: Double, var_args: LineString*): js.Array[LineString] = js.native
  def spliceInteriors(opt_index: Double, opt_deleteCount: js.UndefOr[scala.Nothing], var_args: LineString*): js.Array[LineString] = js.native
  /**
    * Applies a splice-operation on the list of interior rings of the polygon.
    * @param opt_index - The index at which to start changing the list, defaults to 0.
    * @param opt_deleteCount - The number of interior rings to remove, defaults to Infinity.
    * @param var_args - repeatable, The interior rings to insert.
    */
  def spliceInteriors(opt_index: Double, opt_deleteCount: Double, var_args: LineString*): js.Array[LineString] = js.native
}
