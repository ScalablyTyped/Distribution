package typings.jsts.jsts.io

import typings.jsts.jsts.geom.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OL3Parser extends js.Object {
  def read(geometry: js.Any): Geometry
  def write(geometry: Geometry): js.Any
}

object OL3Parser {
  @scala.inline
  def apply(read: js.Any => Geometry, write: Geometry => js.Any): OL3Parser = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[OL3Parser]
  }
}

