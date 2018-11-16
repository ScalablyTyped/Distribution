package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error/locatedError", JSImport.Namespace)
@js.native
object errorLocatedErrorMod extends js.Object {
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
}

