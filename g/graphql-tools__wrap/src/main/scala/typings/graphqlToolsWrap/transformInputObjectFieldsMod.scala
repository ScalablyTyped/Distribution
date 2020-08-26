package typings.graphqlToolsWrap

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.graphqlToolsWrap.typesMod.InputFieldNodeTransformer
import typings.graphqlToolsWrap.typesMod.InputFieldTransformer
import typings.graphqlToolsWrap.typesMod.InputObjectNodeTransformer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms/TransformInputObjectFields", JSImport.Namespace)
@js.native
object transformInputObjectFieldsMod extends js.Object {
  @js.native
  trait TransformInputObjectFields
    extends Transform[Record[String, js.Any]] {
    val inputFieldNodeTransformer: js.Any = js.native
    val inputFieldTransformer: js.Any = js.native
    val inputObjectNodeTransformer: js.Any = js.native
    var mapping: js.Any = js.native
    var transformDocument: js.Any = js.native
    var transformedSchema: js.Any = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformInputObjectFields(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MTransformInputObjectFields(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformSchema")
    def transformSchema_MTransformInputObjectFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
  }
  
  @js.native
  class default protected () extends TransformInputObjectFields {
    def this(inputFieldTransformer: InputFieldTransformer) = this()
    def this(inputFieldTransformer: InputFieldTransformer, inputFieldNodeTransformer: InputFieldNodeTransformer) = this()
    def this(
      inputFieldTransformer: InputFieldTransformer,
      inputFieldNodeTransformer: js.UndefOr[scala.Nothing],
      inputObjectNodeTransformer: InputObjectNodeTransformer
    ) = this()
    def this(
      inputFieldTransformer: InputFieldTransformer,
      inputFieldNodeTransformer: InputFieldNodeTransformer,
      inputObjectNodeTransformer: InputObjectNodeTransformer
    ) = this()
  }
  
}

