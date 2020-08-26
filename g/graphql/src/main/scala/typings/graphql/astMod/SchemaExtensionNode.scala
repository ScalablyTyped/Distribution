package typings.graphql.astMod

import typings.graphql.graphqlStrings.SchemaExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExtensionNode
  extends TypeSystemExtensionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  val kind: SchemaExtension = js.native
  val loc: js.UndefOr[Location] = js.native
  val operationTypes: js.UndefOr[js.Array[OperationTypeDefinitionNode]] = js.native
}

object SchemaExtensionNode {
  @scala.inline
  def apply(kind: SchemaExtension): SchemaExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExtensionNode]
  }
  @scala.inline
  implicit class SchemaExtensionNodeOps[Self <: SchemaExtensionNode] (val x: Self) extends AnyVal {
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
    def setKind(value: SchemaExtension): Self = this.set("kind", value.asInstanceOf[js.Any])
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
    def setOperationTypesVarargs(value: OperationTypeDefinitionNode*): Self = this.set("operationTypes", js.Array(value :_*))
    @scala.inline
    def setOperationTypes(value: js.Array[OperationTypeDefinitionNode]): Self = this.set("operationTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationTypes: Self = this.set("operationTypes", js.undefined)
  }
  
}

