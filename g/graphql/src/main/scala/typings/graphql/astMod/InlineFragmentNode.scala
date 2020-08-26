package typings.graphql.astMod

import typings.graphql.graphqlStrings.InlineFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineFragmentNode
  extends ASTNode
     with SelectionNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  val kind: InlineFragment = js.native
  val loc: js.UndefOr[Location] = js.native
  val selectionSet: SelectionSetNode = js.native
  val typeCondition: js.UndefOr[NamedTypeNode] = js.native
}

object InlineFragmentNode {
  @scala.inline
  def apply(kind: InlineFragment, selectionSet: SelectionSetNode): InlineFragmentNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineFragmentNode]
  }
  @scala.inline
  implicit class InlineFragmentNodeOps[Self <: InlineFragmentNode] (val x: Self) extends AnyVal {
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
    def setKind(value: InlineFragment): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionSet(value: SelectionSetNode): Self = this.set("selectionSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectivesVarargs(value: DirectiveNode*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[DirectiveNode]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    @scala.inline
    def setTypeCondition(value: NamedTypeNode): Self = this.set("typeCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeCondition: Self = this.set("typeCondition", js.undefined)
  }
  
}

