package typings.heremaps.H.geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiGeometry[T] extends AbstractGeometry {
  /**
    * Returns the bounding rectangle of the geometry.
    * @return {H.geo.Rect} - the bounding rectangle of the geometry or null if the bounding rectangle can't be computed (e.g. for a geometry without coordinates)
    */
  def getBounds(): Rect = js.native
  /**
    * Returns the aggregated geometries of the multi-geometry. The returned geometries must be treated as read-only to not violate the integrity of the multi-geometry.
    * @return {T[]} - An array of geometries
    */
  def getGeometries(): js.Array[T] = js.native
  /**
    * Adds the specified geometry to the current multi-geometry.
    * @param geometry {T} - A geometry which will be added to the current multi-geometry
    * @throws {H.lang.InvalidArgumentError} - in case of invalid geometry argument
    */
  def push(geometry: T): Unit = js.native
  /**
    * Removes the specified geometry from the multi-geometry
    * @param geometry {T} - The geometry (by reference) to remove from this multi-geometry.
    * @return {T} - the removed geometry or null if the geometry was not found
    */
  def remove(geometry: T): T = js.native
  /**
    * Removes a contained geometry at the given index.
    * @param index {number} - The index of the geometry to remove.
    * @return {T} - the removed geometry.
    * @throws {H.lang.OutOfRangeError} - if no geometry exists at the given index.
    */
  def removeAt(index: Double): T = js.native
  /**
    * This method splices the specified MultiGeometry at the provided index, removing the specified number of items at that index and inserting new items.
    * @param index {number} - The index at which to start changing the list.
    * @param opt_deleteCount {number=} - The number of geometries to remove.
    * @param opt_items {T[]=} - The geometries to add.
    * @return {T[]} - the removed geometries.
    */
  def splice(index: Double): js.Array[T] = js.native
  def splice(index: Double, opt_deleteCount: Double): js.Array[T] = js.native
  def splice(index: Double, opt_deleteCount: Double, opt_items: js.Array[T]): js.Array[T] = js.native
}

