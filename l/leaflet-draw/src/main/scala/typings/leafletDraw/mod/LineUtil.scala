package typings.leafletDraw.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineUtil {
  
  @JSImport("leaflet", "LineUtil")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks to see if two line segments intersect.
    * Does not handle degenerate cases.
    */
  @scala.inline
  def segmentsIntersect(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("segmentsIntersect")().asInstanceOf[Boolean]
}
