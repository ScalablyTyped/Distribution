package typings
package inputmaskLib.inputmaskMod.InputmaskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertPosition extends js.Object {
  /**
    * Character to insert.
    */
  var c: java.lang.String
  /**
    * Position to insert.
    */
  var pos: scala.Double
}

object InsertPosition {
  @scala.inline
  def apply(c: java.lang.String, pos: scala.Double): InsertPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("c")(c)
    __obj.updateDynamic("pos")(pos)
    __obj.asInstanceOf[InsertPosition]
  }
}

