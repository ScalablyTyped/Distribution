package typings.graphql.astMod

import typings.graphql.graphqlStrings.Directive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveNode extends ASTNode {
  val arguments: js.UndefOr[js.Array[ArgumentNode]] = js.native
  val kind: Directive = js.native
  val loc: js.UndefOr[Location] = js.native
  val name: NameNode = js.native
}

object DirectiveNode {
  @scala.inline
  def apply(kind: Directive, name: NameNode): DirectiveNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveNode]
  }
  @scala.inline
  implicit class DirectiveNodeOps[Self <: DirectiveNode] (val x: Self) extends AnyVal {
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
    def setKind(value: Directive): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NameNode): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgumentsVarargs(value: ArgumentNode*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[ArgumentNode]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

