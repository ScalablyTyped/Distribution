package typings.graphql.astMod

import typings.graphql.graphqlStrings.OperationTypeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationTypeDefinitionNode extends ASTNode {
  val kind: OperationTypeDefinition = js.native
  val loc: js.UndefOr[Location] = js.native
  val operation: OperationTypeNode = js.native
  val `type`: NamedTypeNode = js.native
}

object OperationTypeDefinitionNode {
  @scala.inline
  def apply(kind: OperationTypeDefinition, operation: OperationTypeNode, `type`: NamedTypeNode): OperationTypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationTypeDefinitionNode]
  }
  @scala.inline
  implicit class OperationTypeDefinitionNodeOps[Self <: OperationTypeDefinitionNode] (val x: Self) extends AnyVal {
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
    def setKind(value: OperationTypeDefinition): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: OperationTypeNode): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NamedTypeNode): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

