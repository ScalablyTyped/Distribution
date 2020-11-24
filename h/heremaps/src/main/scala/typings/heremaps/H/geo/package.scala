package typings.heremaps.H

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object geo {
  
  /**
    * A Geographic coordinate that specifies the height of a point in meters. A value of undefined is treated as 0.
    */
  type Altitude = scala.Double
  
  /**
    * A geographic coordinate that specifies the north-south position of a point on the Earth's surface in the range from -90 to + 90 degrees, inclusive.
    */
  type Latitude = scala.Double
  
  /**
    * A Geographic coordinate that specifies the east-west position of a point on the Earth's surface in the range from -180 to 180 degrees, inclusive.
    */
  type Longitude = scala.Double
  
  type MultiPoint = typings.heremaps.H.geo.MultiGeometry[typings.heremaps.H.geo.Point]
  
  type MultiPolygon = typings.heremaps.H.geo.MultiGeometry[typings.heremaps.H.geo.Polygon]
  
  type Polygon = typings.heremaps.H.geo.Polygon_
}
