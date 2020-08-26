package typings.graphql.astMod

import typings.graphql.graphqlStrings.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentNode extends ASTNode {
  val definitions: js.Array[DefinitionNode] = js.native
  val kind: Document = js.native
  val loc: js.UndefOr[Location] = js.native
}

object DocumentNode {
  @scala.inline
  def apply(definitions: js.Array[DefinitionNode], kind: Document): DocumentNode = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentNode]
  }
  @scala.inline
  implicit class DocumentNodeOps[Self <: DocumentNode] (val x: Self) extends AnyVal {
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
    def setDefinitionsVarargs(value: DefinitionNode*): Self = this.set("definitions", js.Array(value :_*))
    @scala.inline
    def setDefinitions(value: js.Array[DefinitionNode]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: Document): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

