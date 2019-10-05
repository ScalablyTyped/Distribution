package typings.graphql.graphqlMod

import typings.graphql.Anon_MaxErrors
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.validationValidationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "validate")
@js.native
object validate extends js.Object {
  def apply(schema: typings.graphql.typeSchemaMod.GraphQLSchema, documentAST: DocumentNode): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule]
  ): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typings.graphql.utilitiesTypeInfoMod.TypeInfo
  ): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typings.graphql.utilitiesTypeInfoMod.TypeInfo,
    options: Anon_MaxErrors
  ): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
}

