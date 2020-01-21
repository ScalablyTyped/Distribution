package typings.handsontable.mod.Handsontable.nestedHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedHeader extends js.Object {
  var colspan: Double
  var label: String
}

object NestedHeader {
  @scala.inline
  def apply(colspan: Double, label: String): NestedHeader = {
    val __obj = js.Dynamic.literal(colspan = colspan.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NestedHeader]
  }
}

