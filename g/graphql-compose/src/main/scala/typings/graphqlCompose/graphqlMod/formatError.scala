package typings.graphqlCompose.graphqlMod

import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "formatError")
@js.native
object formatError extends js.Object {
  def apply(error: typings.graphql.graphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
}

