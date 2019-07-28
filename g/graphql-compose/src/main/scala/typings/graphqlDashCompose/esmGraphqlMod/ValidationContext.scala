package typings.graphqlDashCompose.esmGraphqlMod

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/graphql", "ValidationContext")
@js.native
class ValidationContext protected ()
  extends typings.graphql.graphqlMod.ValidationContext {
  def this(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typings.graphql.utilitiesTypeInfoMod.TypeInfo
  ) = this()
}

