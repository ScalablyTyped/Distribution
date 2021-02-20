package typings.heremaps.H.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a spatial shape in geographic space. It is defined by a path containing the vertices of the shape (lat, lng, alt values).
  */
@js.native
trait GeoShape extends Spatial {
  
  /**
    * This method returns the bounding rectangle for this object. The rectangle is the smallest rectangle which encloses all points of the spatial object.
    * @returns {H.geo.Rect}
    */
  def getBoundingBox(): typings.heremaps.H.geo.Rect = js.native
}
