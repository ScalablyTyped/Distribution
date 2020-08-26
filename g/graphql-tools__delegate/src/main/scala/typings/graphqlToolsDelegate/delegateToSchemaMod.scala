package typings.graphqlToolsDelegate

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.IDelegateRequestOptions
import typings.graphqlToolsDelegate.typesMod.IDelegateToSchemaOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/delegateToSchema", JSImport.Namespace)
@js.native
object delegateToSchemaMod extends js.Object {
  def delegateRequest(
    hasRequestSchemaRootValueInfoOperationFieldNameArgsReturnTypeContextTransformsTransformedSchemaSkipValidationSkipTypeMergingBinding: IDelegateRequestOptions
  ): js.Any = js.native
  def delegateToSchema(options: GraphQLSchema): js.Any = js.native
  def delegateToSchema(options: IDelegateToSchemaOptions[Record[String, _], Record[String, _]]): js.Any = js.native
}

