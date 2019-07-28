package typings.graphql.errorMod

import typings.graphql.errorFormatErrorMod.GraphQLFormattedError
import typings.graphql.languageAstMod.ASTNode
import typings.graphql.languageSourceMod.Source
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def formatError(error: typings.graphql.errorGraphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
  def locatedError(
    originalError: typings.graphql.errorGraphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: js.Array[String | Double]
  ): typings.graphql.errorGraphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): typings.graphql.errorGraphQLErrorMod.GraphQLError = js.native
  def printError(error: typings.graphql.errorGraphQLErrorMod.GraphQLError): String = js.native
  def syntaxError(source: Source, position: Double, description: String): typings.graphql.errorGraphQLErrorMod.GraphQLError = js.native
}

