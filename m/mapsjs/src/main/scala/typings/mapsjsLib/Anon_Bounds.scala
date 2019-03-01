package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bounds extends js.Object {
  var Bounds: js.Array[mapsjsLib.mapsjsMod.envelope]
  var Shapes: js.Array[_]
  var Values: js.Array[_]
}

object Anon_Bounds {
  @scala.inline
  def apply(Bounds: js.Array[mapsjsLib.mapsjsMod.envelope], Shapes: js.Array[_], Values: js.Array[_]): Anon_Bounds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bounds")(Bounds)
    __obj.updateDynamic("Shapes")(Shapes)
    __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[Anon_Bounds]
  }
}

