package typings.graphqlToolsDelegate.typesMod

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.subschemaMod.Subschema
import typings.graphqlToolsUtils.interfacesMod.Operation
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDelegateToSchemaOptions[TContext, TArgs] extends js.Object {
  var args: js.UndefOr[TArgs] = js.native
  var binding: js.UndefOr[DelegationBinding] = js.native
  var context: js.UndefOr[TContext] = js.native
  var fieldName: js.UndefOr[String] = js.native
  var fieldNodes: js.UndefOr[js.Array[FieldNode]] = js.native
  var info: GraphQLResolveInfo = js.native
  var operation: js.UndefOr[Operation] = js.native
  var operationName: js.UndefOr[String] = js.native
  var returnType: js.UndefOr[GraphQLOutputType] = js.native
  var rootValue: js.UndefOr[Record[String, _]] = js.native
  var schema: GraphQLSchema | SubschemaConfig | Subschema = js.native
  var selectionSet: js.UndefOr[SelectionSetNode] = js.native
  var skipTypeMerging: js.UndefOr[Boolean] = js.native
  var skipValidation: js.UndefOr[Boolean] = js.native
  var transformedSchema: js.UndefOr[GraphQLSchema] = js.native
  var transforms: js.UndefOr[js.Array[Transform[Record[String, _]]]] = js.native
}

object IDelegateToSchemaOptions {
  @scala.inline
  def apply[TContext, TArgs](info: GraphQLResolveInfo, schema: GraphQLSchema | SubschemaConfig | Subschema): IDelegateToSchemaOptions[TContext, TArgs] = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelegateToSchemaOptions[TContext, TArgs]]
  }
  @scala.inline
  implicit class IDelegateToSchemaOptionsOps[Self <: IDelegateToSchemaOptions[_, _], TContext, TArgs] (val x: Self with (IDelegateToSchemaOptions[TContext, TArgs])) extends AnyVal {
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
    def setInfo(value: GraphQLResolveInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema | SubschemaConfig | Subschema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: TArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setBinding(value: /* delegationContext */ DelegationContext => js.Array[Transform[Record[String, js.Any]]]): Self = this.set("binding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBinding: Self = this.set("binding", js.undefined)
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setFieldNodesVarargs(value: FieldNode*): Self = this.set("fieldNodes", js.Array(value :_*))
    @scala.inline
    def setFieldNodes(value: js.Array[FieldNode]): Self = this.set("fieldNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldNodes: Self = this.set("fieldNodes", js.undefined)
    @scala.inline
    def setOperation(value: Operation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    @scala.inline
    def setReturnType(value: GraphQLOutputType): Self = this.set("returnType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnType: Self = this.set("returnType", js.undefined)
    @scala.inline
    def setRootValue(value: Record[String, _]): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    @scala.inline
    def setSelectionSet(value: SelectionSetNode): Self = this.set("selectionSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionSet: Self = this.set("selectionSet", js.undefined)
    @scala.inline
    def setSkipTypeMerging(value: Boolean): Self = this.set("skipTypeMerging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipTypeMerging: Self = this.set("skipTypeMerging", js.undefined)
    @scala.inline
    def setSkipValidation(value: Boolean): Self = this.set("skipValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipValidation: Self = this.set("skipValidation", js.undefined)
    @scala.inline
    def setTransformedSchema(value: GraphQLSchema): Self = this.set("transformedSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformedSchema: Self = this.set("transformedSchema", js.undefined)
    @scala.inline
    def setTransformsVarargs(value: (Transform[Record[String, js.Any]])*): Self = this.set("transforms", js.Array(value :_*))
    @scala.inline
    def setTransforms(value: js.Array[Transform[Record[String, _]]]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
  
}

