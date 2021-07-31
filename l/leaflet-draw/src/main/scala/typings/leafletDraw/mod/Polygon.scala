package typings.leafletDraw.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Polygon {
  
  @JSImport("leaflet", "Polygon")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks a polygon for any intersecting line segments.
    * Ignores holes.
    */
  @scala.inline
  def intersects(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("intersects")().asInstanceOf[Boolean]
}
