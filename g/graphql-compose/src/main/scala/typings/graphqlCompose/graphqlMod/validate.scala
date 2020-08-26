package typings.graphqlCompose.graphqlMod

import typings.graphql.anon.MaxErrors
import typings.graphql.astMod.DocumentNode
import typings.graphql.validationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "validate")
@js.native
object validate extends js.Object {
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema, documentAST: DocumentNode): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.UndefOr[scala.Nothing],
    typeInfo: js.UndefOr[scala.Nothing],
    options: MaxErrors
  ): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.UndefOr[scala.Nothing],
    typeInfo: typings.graphql.typeInfoMod.TypeInfo
  ): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.UndefOr[scala.Nothing],
    typeInfo: typings.graphql.typeInfoMod.TypeInfo,
    options: MaxErrors
  ): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule]
  ): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: js.UndefOr[scala.Nothing],
    options: MaxErrors
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
    options: MaxErrors
  ): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
}

