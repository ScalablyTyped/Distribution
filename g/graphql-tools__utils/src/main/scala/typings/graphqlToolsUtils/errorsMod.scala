package typings.graphqlToolsUtils

import typings.graphql.mod.GraphQLError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  val ERROR_SYMBOL: js.Symbol = js.native
  def getErrors(result: js.Any, pathSegment: String): js.Array[GraphQLError] = js.native
  def getErrorsByPathSegment(errors: js.Array[GraphQLError]): Record[String, js.Array[GraphQLError]] = js.native
  def relocatedError(originalError: GraphQLError): GraphQLError = js.native
  def relocatedError(originalError: GraphQLError, path: js.Array[String | Double]): GraphQLError = js.native
  def setErrors(result: js.Any, errors: js.Array[GraphQLError]): Unit = js.native
  def slicedError(originalError: GraphQLError): GraphQLError = js.native
}

