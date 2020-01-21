package typings.graphql.formatErrorMod

import typings.graphql.graphQLErrorMod.GraphQLError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error/formatError", "formatError")
@js.native
object formatError extends js.Object {
  def apply(error: GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
}

