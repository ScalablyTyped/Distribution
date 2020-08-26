package typings.graphqlToolsWrap

import typings.graphql.astMod.FieldNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms/HoistField", JSImport.Namespace)
@js.native
object hoistFieldMod extends js.Object {
  @js.native
  trait HoistField
    extends Transform[Record[String, js.Any]] {
    val newFieldName: js.Any = js.native
    val oldFieldName: js.Any = js.native
    val pathToField: js.Any = js.native
    val transformer: js.Any = js.native
    val typeName: js.Any = js.native
    @JSName("transformRequest")
    def transformRequest_MHoistField(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MHoistField(
      originalRequest: Request,
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MHoistField(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MHoistField(
      originalRequest: Request,
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformResult")
    def transformResult_MHoistField(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MHoistField(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MHoistField(originalResult: ExecutionResult[Record[String, _]], delegationContext: Record[String, _]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MHoistField(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformSchema")
    def transformSchema_MHoistField(schema: GraphQLSchema): GraphQLSchema = js.native
  }
  
  @js.native
  class default protected () extends HoistField {
    def this(typeName: String, path: js.Array[String], newFieldName: String) = this()
    def this(typeName: String, path: js.Array[String], newFieldName: String, alias: String) = this()
  }
  
  def unwrapValue(originalValue: js.Any, alias: String): js.Any = js.native
  def wrapFieldNode(fieldNode: FieldNode, path: js.Array[String], alias: String): FieldNode = js.native
}

