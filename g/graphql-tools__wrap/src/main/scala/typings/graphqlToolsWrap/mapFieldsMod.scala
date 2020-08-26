package typings.graphqlToolsWrap

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.graphqlToolsUtils.interfacesMod.FieldNodeMappers
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.graphqlToolsWrap.typesMod.ErrorsTransformer
import typings.graphqlToolsWrap.typesMod.ObjectValueTransformerMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms/MapFields", JSImport.Namespace)
@js.native
object mapFieldsMod extends js.Object {
  @js.native
  trait MapFields
    extends Transform[Record[String, js.Any]] {
    val transformer: js.Any = js.native
    @JSName("transformRequest")
    def transformRequest_MMapFields(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MMapFields(
      originalRequest: Request,
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MMapFields(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MMapFields(
      originalRequest: Request,
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformResult")
    def transformResult_MMapFields(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MMapFields(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MMapFields(originalResult: ExecutionResult[Record[String, _]], delegationContext: Record[String, _]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MMapFields(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformSchema")
    def transformSchema_MMapFields(schema: GraphQLSchema): GraphQLSchema = js.native
  }
  
  @js.native
  class default protected () extends MapFields {
    def this(fieldNodeTransformerMap: FieldNodeMappers) = this()
    def this(fieldNodeTransformerMap: FieldNodeMappers, objectValueTransformerMap: ObjectValueTransformerMap) = this()
    def this(
      fieldNodeTransformerMap: FieldNodeMappers,
      objectValueTransformerMap: js.UndefOr[scala.Nothing],
      errorsTransformer: ErrorsTransformer
    ) = this()
    def this(
      fieldNodeTransformerMap: FieldNodeMappers,
      objectValueTransformerMap: ObjectValueTransformerMap,
      errorsTransformer: ErrorsTransformer
    ) = this()
  }
  
}

