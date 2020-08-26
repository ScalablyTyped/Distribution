package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "visitErrors")
@js.native
object visitErrors extends js.Object {
  def apply(errors: js.Array[GraphQLError], visitor: js.Function1[/* error */ GraphQLError, GraphQLError]): js.Array[GraphQLError] = js.native
}

