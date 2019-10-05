package typings.graphql.graphqlMod

import typings.graphql.errorFormatErrorMod.GraphQLFormattedError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "formatError")
@js.native
object formatError extends js.Object {
  def apply(error: typings.graphql.errorGraphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
}

