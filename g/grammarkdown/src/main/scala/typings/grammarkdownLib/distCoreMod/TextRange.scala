package typings
package grammarkdownLib.distCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRange extends js.Object {
  var end: scala.Double
  var pos: scala.Double
}

object TextRange {
  @scala.inline
  def apply(end: scala.Double, pos: scala.Double): TextRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("pos")(pos)
    __obj.asInstanceOf[TextRange]
  }
}

