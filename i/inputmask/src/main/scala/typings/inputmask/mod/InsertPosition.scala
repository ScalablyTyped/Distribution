package typings.inputmask.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertPosition extends js.Object {
  /**
    * Character to insert.
    */
  var c: String
  /**
    * Position to insert.
    */
  var pos: Double
}

object InsertPosition {
  @scala.inline
  def apply(c: String, pos: Double): InsertPosition = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsertPosition]
  }
}

