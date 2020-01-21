package typings.kythe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends Entry {
  var kind: String
  var target: VName
}

object Edge {
  @scala.inline
  def apply(kind: String, label: String, source: VName, target: VName): Edge = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Edge]
  }
}

