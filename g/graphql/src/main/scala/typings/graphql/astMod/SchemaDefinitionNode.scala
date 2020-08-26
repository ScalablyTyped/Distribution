package typings.graphql.astMod

import typings.graphql.graphqlStrings.SchemaDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDefinitionNode
  extends TypeSystemDefinitionNode
     with ASTNode {
  val description: js.UndefOr[StringValueNode] = js.native
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  val kind: SchemaDefinition = js.native
  val loc: js.UndefOr[Location] = js.native
  val operationTypes: js.Array[OperationTypeDefinitionNode] = js.native
}

object SchemaDefinitionNode {
  @scala.inline
  def apply(kind: SchemaDefinition, operationTypes: js.Array[OperationTypeDefinitionNode]): SchemaDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operationTypes = operationTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDefinitionNode]
  }
  @scala.inline
  implicit class SchemaDefinitionNodeOps[Self <: SchemaDefinitionNode] (val x: Self) extends AnyVal {
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
    def setKind(value: SchemaDefinition): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationTypesVarargs(value: OperationTypeDefinitionNode*): Self = this.set("operationTypes", js.Array(value :_*))
    @scala.inline
    def setOperationTypes(value: js.Array[OperationTypeDefinitionNode]): Self = this.set("operationTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: StringValueNode): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
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
  }
  
}

