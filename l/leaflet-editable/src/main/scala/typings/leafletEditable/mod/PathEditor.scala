package typings.leafletEditable.mod

import typings.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for all path editors.
  */
@js.native
trait PathEditor
  extends StObject
     with BaseEditor {
  
  /**
    * Append a new shape to the Polygon or Polyline.
    */
  def appendShape(shape: js.Array[LatLng_]): Unit = js.native
  
  /**
    * Remove a path shape at the given latlng.
    */
  def deleteShapeAt(): js.Array[LatLng_] = js.native
  def deleteShapeAt(latLng: LatLng_): js.Array[LatLng_] = js.native
  
  /**
    * Insert a new shape to the Polygon or Polyline at given index (default is to append).
    */
  def insertShape(shape: js.Array[LatLng_], index: Double): Unit = js.native
  
  /**
    * Add a new shape (Polyline, Polygon) in a multi, and setup up drawing tools to draw it;
    * if optional latlng is given, start a path at this point.
    */
  def newShape(): Unit = js.native
  def newShape(latLng: LatLng_): Unit = js.native
  
  /**
    * Programmatically remove last point (if any) while drawing.
    */
  def pop(): LatLng_ | Null = js.native
  
  /**
    * Prepend a new shape to the Polygon or Polyline.
    */
  def prependShape(shape: js.Array[LatLng_]): Unit = js.native
  
  /**
    * Programmatically add a point while drawing.
    */
  def push(): Unit = js.native
  
  /**
    * Rebuild edit elements (Vertex, MiddleMarker, etc.).
    */
  def reset(): Unit = js.native
}
