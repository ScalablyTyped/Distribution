package typings.mapsjs.anon

import typings.mapsjs.mod.envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  var Bounds: js.Array[envelope]
  var Shapes: js.Array[_]
  var Values: js.Array[_]
}

object Bounds {
  @scala.inline
  def apply(Bounds: js.Array[envelope], Shapes: js.Array[_], Values: js.Array[_]): Bounds = {
    val __obj = js.Dynamic.literal(Bounds = Bounds.asInstanceOf[js.Any], Shapes = Shapes.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
}

