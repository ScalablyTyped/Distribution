package typings.graphql.graphqlMod

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "findDeprecatedUsages")
@js.native
object findDeprecatedUsages extends js.Object {
  def apply(schema: typings.graphql.typeSchemaMod.GraphQLSchema, ast: DocumentNode): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
}

