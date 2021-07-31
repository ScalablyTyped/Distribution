package typings.heremaps.global.H.map

import typings.heremaps.H.map.Spatial.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a spatial shape in geographic space. It is defined by a path containing the vertices of the shape (lat, lng, alt values).
  */
@JSGlobal("H.map.GeoShape")
@js.native
class GeoShape protected ()
  extends StObject
     with typings.heremaps.H.map.GeoShape {
  /**
    * Constructor
    * @param isClosed {boolean} - Indicates whether this geographical shape is closed (a polygon)
    * @param options {H.map.Spatial.Options} - The options to apply
    */
  def this(isClosed: Boolean, options: Options) = this()
}
