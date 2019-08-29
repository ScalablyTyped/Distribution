package typings.graphql.graphqlMod

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "ValidationContext")
@js.native
class ValidationContext protected ()
  extends typings.graphql.validationMod.ValidationContext {
  def this(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typings.graphql.utilitiesTypeInfoMod.TypeInfo
  ) = this()
  def this(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typings.graphql.utilitiesTypeInfoMod.TypeInfo,
    onError: js.Function1[/* err */ typings.graphql.errorGraphQLErrorMod.GraphQLError, Unit]
  ) = this()
}

