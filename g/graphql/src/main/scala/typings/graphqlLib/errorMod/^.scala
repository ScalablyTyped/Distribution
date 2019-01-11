package typings
package graphqlLib.errorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def formatError(error: graphqlLib.errorGraphQLErrorMod.GraphQLError): graphqlLib.errorFormatErrorMod.GraphQLFormattedError = js.native
  def locatedError(
    originalError: graphqlLib.errorGraphQLErrorMod.GraphQLError,
    nodes: js.Array[graphqlLib.languageAstMod.ASTNode],
    path: js.Array[java.lang.String | scala.Double]
  ): graphqlLib.errorGraphQLErrorMod.GraphQLError = js.native
  def locatedError(
    originalError: stdLib.Error,
    nodes: js.Array[graphqlLib.languageAstMod.ASTNode],
    path: js.Array[java.lang.String | scala.Double]
  ): graphqlLib.errorGraphQLErrorMod.GraphQLError = js.native
  def printError(error: graphqlLib.errorGraphQLErrorMod.GraphQLError): java.lang.String = js.native
  def syntaxError(source: graphqlLib.languageSourceMod.Source, position: scala.Double, description: java.lang.String): graphqlLib.errorGraphQLErrorMod.GraphQLError = js.native
}

