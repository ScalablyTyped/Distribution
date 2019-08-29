package typings.graphqlDashCompose.libGraphqlMod

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "ValidationContext")
@js.native
class ValidationContext protected ()
  extends typings.graphql.graphqlMod.ValidationContext {
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

