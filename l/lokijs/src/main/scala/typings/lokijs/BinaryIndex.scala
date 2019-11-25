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
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BinaryIndex]
  }
}

