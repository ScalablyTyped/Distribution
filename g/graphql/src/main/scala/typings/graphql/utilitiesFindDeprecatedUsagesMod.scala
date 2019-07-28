package typings.graphql

import typings.graphql.errorGraphQLErrorMod.GraphQLError
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/findDeprecatedUsages", JSImport.Namespace)
@js.native
object utilitiesFindDeprecatedUsagesMod extends js.Object {
  def findDeprecatedUsages(schema: GraphQLSchema, ast: DocumentNode): js.Array[GraphQLError] = js.native
}

