package typings
package kytheLib.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var label: java.lang.String
  var source: VName
}

object Entry {
  @scala.inline
  def apply(label: java.lang.String, source: VName): Entry = {
    val __obj = js.Dynamic.literal(label = label, source = source)
  
    __obj.asInstanceOf[Entry]
  }
}

