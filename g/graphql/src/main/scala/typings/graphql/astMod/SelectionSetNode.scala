package typings.graphql.astMod

import typings.graphql.graphqlStrings.SelectionSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionSetNode extends ASTNode {
  var kind: SelectionSet = js.native
  var loc: js.UndefOr[Location] = js.native
  var selections: js.Array[SelectionNode] = js.native
}

object SelectionSetNode {
  @scala.inline
  def apply(kind: SelectionSet, selections: js.Array[SelectionNode]): SelectionSetNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionSetNode]
  }
  @scala.inline
  implicit class SelectionSetNodeOps[Self <: SelectionSetNode] (val x: Self) extends AnyVal {
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
    def setKind(value: SelectionSet): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionsVarargs(value: SelectionNode*): Self = this.set("selections", js.Array(value :_*))
    @scala.inline
    def setSelections(value: js.Array[SelectionNode]): Self = this.set("selections", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

