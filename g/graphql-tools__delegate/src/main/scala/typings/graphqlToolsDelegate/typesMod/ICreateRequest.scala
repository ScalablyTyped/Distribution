package typings.graphqlToolsDelegate.typesMod

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.FragmentDefinitionNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.astMod.VariableDefinitionNode
import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Operation
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreateRequest extends js.Object {
  var fieldNodes: js.UndefOr[js.Array[FieldNode]] = js.native
  var fragments: js.UndefOr[Record[String, FragmentDefinitionNode]] = js.native
  var selectionSet: js.UndefOr[SelectionSetNode] = js.native
  var sourceFieldName: js.UndefOr[String] = js.native
  var sourceParentType: js.UndefOr[GraphQLObjectType[_, _]] = js.native
  var sourceSchema: js.UndefOr[GraphQLSchema] = js.native
  var targetFieldName: String = js.native
  var targetOperation: Operation = js.native
  var targetOperationName: js.UndefOr[String] = js.native
  var variableDefinitions: js.UndefOr[js.Array[VariableDefinitionNode]] = js.native
  var variableValues: js.UndefOr[Record[String, _]] = js.native
}

object ICreateRequest {
  @scala.inline
  def apply(targetFieldName: String, targetOperation: Operation): ICreateRequest = {
    val __obj = js.Dynamic.literal(targetFieldName = targetFieldName.asInstanceOf[js.Any], targetOperation = targetOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateRequest]
  }
  @scala.inline
  implicit class ICreateRequestOps[Self <: ICreateRequest] (val x: Self) extends AnyVal {
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
    def setTargetFieldName(value: String): Self = this.set("targetFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetOperation(value: Operation): Self = this.set("targetOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldNodesVarargs(value: FieldNode*): Self = this.set("fieldNodes", js.Array(value :_*))
    @scala.inline
    def setFieldNodes(value: js.Array[FieldNode]): Self = this.set("fieldNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldNodes: Self = this.set("fieldNodes", js.undefined)
    @scala.inline
    def setFragments(value: Record[String, FragmentDefinitionNode]): Self = this.set("fragments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragments: Self = this.set("fragments", js.undefined)
    @scala.inline
    def setSelectionSet(value: SelectionSetNode): Self = this.set("selectionSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionSet: Self = this.set("selectionSet", js.undefined)
    @scala.inline
    def setSourceFieldName(value: String): Self = this.set("sourceFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFieldName: Self = this.set("sourceFieldName", js.undefined)
    @scala.inline
    def setSourceParentType(value: GraphQLObjectType[_, _]): Self = this.set("sourceParentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceParentType: Self = this.set("sourceParentType", js.undefined)
    @scala.inline
    def setSourceSchema(value: GraphQLSchema): Self = this.set("sourceSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceSchema: Self = this.set("sourceSchema", js.undefined)
    @scala.inline
    def setTargetOperationName(value: String): Self = this.set("targetOperationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetOperationName: Self = this.set("targetOperationName", js.undefined)
    @scala.inline
    def setVariableDefinitionsVarargs(value: VariableDefinitionNode*): Self = this.set("variableDefinitions", js.Array(value :_*))
    @scala.inline
    def setVariableDefinitions(value: js.Array[VariableDefinitionNode]): Self = this.set("variableDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableDefinitions: Self = this.set("variableDefinitions", js.undefined)
    @scala.inline
    def setVariableValues(value: Record[String, _]): Self = this.set("variableValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableValues: Self = this.set("variableValues", js.undefined)
  }
  
}

