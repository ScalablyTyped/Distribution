package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/validate", JSImport.Namespace)
@js.native
object typeValidateMod extends js.Object {
  def assertValidSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): scala.Unit = js.native
  def validateSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): js.Array[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
}

