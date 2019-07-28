package typings.graphql.errorFormatErrorMod

import typings.graphql.errorGraphQLErrorMod.GraphQLError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error/formatError", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def formatError(error: GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
}

