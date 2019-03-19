package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryIndex extends js.Object {
  var dirty: scala.Boolean
  var name: java.lang.String
  var values: js.Array[scala.Double]
}

object BinaryIndex {
  @scala.inline
  def apply(dirty: scala.Boolean, name: java.lang.String, values: js.Array[scala.Double]): BinaryIndex = {
    val __obj = js.Dynamic.literal(dirty = dirty, name = name, values = values)
  
    __obj.asInstanceOf[BinaryIndex]
  }
}

