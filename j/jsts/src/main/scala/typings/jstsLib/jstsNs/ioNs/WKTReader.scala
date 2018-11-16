package typings
package jstsLib.jstsNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.io.WKTReader")
@js.native
class WKTReader () extends js.Object {
  /**
               * @constructor
               */
  def this(geometryFactory: jstsLib.jstsNs.geomNs.GeometryFactory) = this()
  /**
               * Reads a Well-Known Text representation of a {@link Geometry}
               *
               * @param {string}
               *          wkt a <Geometry Tagged Text> string (see the OpenGIS Simple Features
               *          Specification).
               * @return {jsts.geom.Geometry} a <code>Geometry</code> read from
               *         <code>string.</code>
               */
  def read(wkt: java.lang.String): jstsLib.jstsNs.geomNs.Geometry = js.native
  def reducePrecision(geometry: jstsLib.jstsNs.geomNs.Geometry): scala.Unit = js.native
}

