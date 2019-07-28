package typings.kythe.kytheMod

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
    val __obj = js.Dynamic.literal(kind = kind, label = label, source = source, target = target)
  
    __obj.asInstanceOf[Edge]
  }
}

