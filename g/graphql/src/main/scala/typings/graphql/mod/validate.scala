package typings.graphql.mod

import typings.graphql.AnonMaxErrors
import typings.graphql.astMod.DocumentNode
import typings.graphql.validationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "validate")
@js.native
object validate extends js.Object {
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema, documentAST: DocumentNode): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule]
  ): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typings.graphql.typeInfoMod.TypeInfo
  ): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typings.graphql.typeInfoMod.TypeInfo,
    options: AnonMaxErrors
  ): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
}

