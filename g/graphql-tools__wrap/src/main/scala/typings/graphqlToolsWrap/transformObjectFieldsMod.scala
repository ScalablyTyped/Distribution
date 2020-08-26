package typings.graphqlToolsWrap

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.FieldTransformer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms/TransformObjectFields", JSImport.Namespace)
@js.native
object transformObjectFieldsMod extends js.Object {
  @js.native
  trait TransformObjectFields
    extends Transform[Record[String, js.Any]] {
    val fieldNodeTransformer: js.Any = js.native
    val objectFieldTransformer: js.Any = js.native
    var transformer: js.Any = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformObjectFields(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformObjectFields(
      originalRequest: Request,
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformObjectFields(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformObjectFields(
      originalRequest: Request,
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformResult")
    def transformResult_MTransformObjectFields(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformObjectFields(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformObjectFields(originalResult: ExecutionResult[Record[String, _]], delegationContext: Record[String, _]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformObjectFields(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformSchema")
    def transformSchema_MTransformObjectFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
  }
  
  @js.native
  class default protected () extends TransformObjectFields {
    def this(objectFieldTransformer: FieldTransformer) = this()
    def this(objectFieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
  }
  
}

