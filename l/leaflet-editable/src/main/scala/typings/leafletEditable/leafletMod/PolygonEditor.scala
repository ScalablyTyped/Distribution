package typings.leafletEditable.leafletMod

import typings.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Editor for Polygon.
  */
@js.native
trait PolygonEditor
  extends StObject
     with PathEditor
     with _Editor {
  
  /**
    * Set up drawing tools for creating a new hole on the polygon.
    * If the latlng param is given, a first point is created.
    *
    * Despite being described in the documentation,
    *   the index parameter is not specified in the method signature.
    */
  def newHole(): Unit = js.native
  def newHole(latlng: LatLng_): Unit = js.native
}
