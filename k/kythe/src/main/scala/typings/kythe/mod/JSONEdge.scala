package typings.kythe.mod

import typings.kythe.kytheStrings.Slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEdge extends js.Object {
  var edge_kind: EdgeKind | OrdinalEdge
  var fact_name: Slash
  var source: VName
  var target: VName
}

object JSONEdge {
  @scala.inline
  def apply(edge_kind: EdgeKind | OrdinalEdge, fact_name: Slash, source: VName, target: VName): JSONEdge = {
    val __obj = js.Dynamic.literal(edge_kind = edge_kind.asInstanceOf[js.Any], fact_name = fact_name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSONEdge]
  }
}

