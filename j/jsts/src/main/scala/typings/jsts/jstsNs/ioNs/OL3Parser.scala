package typings.jsts.jstsNs.ioNs

import typings.jsts.jstsNs.geomNs.Geometry
import typings.jsts.jstsNs.geomNs.GeometryFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.io.OL3Parser")
@js.native
class OL3Parser () extends js.Object {
  def this(geometryFactory: GeometryFactory) = this()
  def read(geometry: js.Any): Geometry = js.native
  def write(geometry: Geometry): js.Any = js.native
}

