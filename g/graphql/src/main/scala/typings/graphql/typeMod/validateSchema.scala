package typings.graphql.typeMod

import typings.graphql.errorGraphQLErrorMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "validateSchema")
@js.native
object validateSchema extends js.Object {
  def apply(schema: typings.graphql.typeSchemaMod.GraphQLSchema): js.Array[GraphQLError] = js.native
}

