package typings.leafletEditable.mod

import typings.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Editor for Polyline.
  */
@js.native
trait PolylineEditor
  extends StObject
     with PathEditor
     with _Editor {
  
  /**
    * Set up drawing tools to continue the line backward.
    */
  def continueBackward(): Unit = js.native
  def continueBackward(latLngs: js.Array[LatLng_]): Unit = js.native
  
  /**
    * Set up drawing tools to continue the line forward.
    */
  def continueForward(): Unit = js.native
  def continueForward(latLngs: js.Array[LatLng_]): Unit = js.native
  
  /**
    * Split the given latlngs shape at index index and integrate new shape in instance latlngs.
    */
  def splitShape(latLngs: js.Array[LatLng_], index: Double): Unit = js.native
}
