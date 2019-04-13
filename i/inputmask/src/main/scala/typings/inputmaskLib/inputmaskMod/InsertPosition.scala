package typings
package inputmaskLib.inputmaskMod

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
    val __obj = js.Dynamic.literal(c = c, pos = pos)
  
    __obj.asInstanceOf[InsertPosition]
  }
}

