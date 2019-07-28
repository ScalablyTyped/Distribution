package typings.mapsjs

import typings.mapsjs.mapsjsMod.envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bounds extends js.Object {
  var Bounds: js.Array[envelope]
  var Shapes: js.Array[_]
  var Values: js.Array[_]
}

object Anon_Bounds {
  @scala.inline
  def apply(Bounds: js.Array[envelope], Shapes: js.Array[_], Values: js.Array[_]): Anon_Bounds = {
    val __obj = js.Dynamic.literal(Bounds = Bounds, Shapes = Shapes, Values = Values)
  
    __obj.asInstanceOf[Anon_Bounds]
  }
}

