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

@JSImport("@graphql-tools/wrap/transforms/TransformInterfaceFields", JSImport.Namespace)
@js.native
object transformInterfaceFieldsMod extends js.Object {
  @js.native
  trait TransformInterfaceFields
    extends Transform[Record[String, js.Any]] {
    val fieldNodeTransformer: js.Any = js.native
    val interfaceFieldTransformer: js.Any = js.native
    var transformer: js.Any = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformInterfaceFields(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformInterfaceFields(
      originalRequest: Request,
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformInterfaceFields(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformInterfaceFields(
      originalRequest: Request,
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): Request = js.native
    @JSName("transformResult")
    def transformResult_MTransformInterfaceFields(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformInterfaceFields(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: js.UndefOr[scala.Nothing],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformInterfaceFields(originalResult: ExecutionResult[Record[String, _]], delegationContext: Record[String, _]): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformResult")
    def transformResult_MTransformInterfaceFields(
      originalResult: ExecutionResult[Record[String, _]],
      delegationContext: Record[String, _],
      transformationContext: Record[String, _]
    ): ExecutionResult[Record[String, _]] = js.native
    @JSName("transformSchema")
    def transformSchema_MTransformInterfaceFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
  }
  
  @js.native
  class default protected () extends TransformInterfaceFields {
    def this(interfaceFieldTransformer: FieldTransformer) = this()
    def this(interfaceFieldTransformer: FieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
  }
  
}

