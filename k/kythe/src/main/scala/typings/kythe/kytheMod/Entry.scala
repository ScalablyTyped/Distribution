package typings.kythe.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var label: String
  var source: VName
}

object Entry {
  @scala.inline
  def apply(label: String, source: VName): Entry = {
    val __obj = js.Dynamic.literal(label = label, source = source)
  
    __obj.asInstanceOf[Entry]
  }
}

