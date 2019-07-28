package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryIndex extends js.Object {
  var dirty: Boolean
  var name: String
  var values: js.Array[Double]
}

object BinaryIndex {
  @scala.inline
  def apply(dirty: Boolean, name: String, values: js.Array[Double]): BinaryIndex = {
    val __obj = js.Dynamic.literal(dirty = dirty, name = name, values = values)
  
    __obj.asInstanceOf[BinaryIndex]
  }
}

