package typings.graphql

import typings.graphql.errorGraphQLErrorMod.GraphQLError
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/validate", JSImport.Namespace)
@js.native
object typeValidateMod extends js.Object {
  def assertValidSchema(schema: GraphQLSchema): Unit = js.native
  def validateSchema(schema: GraphQLSchema): js.Array[GraphQLError] = js.native
}

