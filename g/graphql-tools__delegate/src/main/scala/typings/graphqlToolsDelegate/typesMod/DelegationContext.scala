package typings.graphqlToolsDelegate.typesMod

import typings.graphql.astMod.OperationTypeNode
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegationContext extends js.Object {
  var args: Record[String, _] = js.native
  var context: Record[String, _] = js.native
  var fieldName: String = js.native
  var info: GraphQLResolveInfo = js.native
  var operation: OperationTypeNode = js.native
  var returnType: GraphQLOutputType = js.native
  var skipTypeMerging: Boolean = js.native
  var subschema: GraphQLSchema | SubschemaConfig = js.native
  var targetSchema: GraphQLSchema = js.native
  var transformedSchema: GraphQLSchema = js.native
  var transforms: js.Array[Transform[Record[String, _]]] = js.native
}

object DelegationContext {
  @scala.inline
  def apply(
    args: Record[String, _],
    context: Record[String, _],
    fieldName: String,
    info: GraphQLResolveInfo,
    operation: OperationTypeNode,
    returnType: GraphQLOutputType,
    skipTypeMerging: Boolean,
    subschema: GraphQLSchema | SubschemaConfig,
    targetSchema: GraphQLSchema,
    transformedSchema: GraphQLSchema,
    transforms: js.Array[Transform[Record[String, _]]]
  ): DelegationContext = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], skipTypeMerging = skipTypeMerging.asInstanceOf[js.Any], subschema = subschema.asInstanceOf[js.Any], targetSchema = targetSchema.asInstanceOf[js.Any], transformedSchema = transformedSchema.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationContext]
  }
  @scala.inline
  implicit class DelegationContextOps[Self <: DelegationContext] (val x: Self) extends AnyVal {
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
    def setArgs(value: Record[String, _]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: Record[String, _]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: GraphQLResolveInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: OperationTypeNode): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GraphQLOutputType): Self = this.set("returnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipTypeMerging(value: Boolean): Self = this.set("skipTypeMerging", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubschema(value: GraphQLSchema | SubschemaConfig): Self = this.set("subschema", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetSchema(value: GraphQLSchema): Self = this.set("targetSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformedSchema(value: GraphQLSchema): Self = this.set("transformedSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformsVarargs(value: (Transform[Record[String, js.Any]])*): Self = this.set("transforms", js.Array(value :_*))
    @scala.inline
    def setTransforms(value: js.Array[Transform[Record[String, _]]]): Self = this.set("transforms", value.asInstanceOf[js.Any])
  }
  
}

