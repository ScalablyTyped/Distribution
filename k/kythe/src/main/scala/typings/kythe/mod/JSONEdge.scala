package typings.kythe.mod

import typings.kythe.kytheStrings.Slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEdge extends js.Object {
  var edge_kind: EdgeKind | OrdinalEdge = js.native
  var fact_name: Slash = js.native
  var source: VName = js.native
  var target: VName = js.native
}

object JSONEdge {
  @scala.inline
  def apply(edge_kind: EdgeKind | OrdinalEdge, fact_name: Slash, source: VName, target: VName): JSONEdge = {
    val __obj = js.Dynamic.literal(edge_kind = edge_kind.asInstanceOf[js.Any], fact_name = fact_name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEdge]
  }
  @scala.inline
  implicit class JSONEdgeOps[Self <: JSONEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEdge_kind(value: EdgeKind | OrdinalEdge): Self = this.set("edge_kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setFact_name(value: Slash): Self = this.set("fact_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: VName): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: VName): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

