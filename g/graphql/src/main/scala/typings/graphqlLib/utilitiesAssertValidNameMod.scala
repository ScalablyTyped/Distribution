package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/assertValidName", JSImport.Namespace)
@js.native
object utilitiesAssertValidNameMod extends js.Object {
  def assertValidName(name: java.lang.String): java.lang.String = js.native
  def isValidNameError(name: java.lang.String): js.UndefOr[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: java.lang.String, node: graphqlLib.languageAstMod.ASTNode): js.UndefOr[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
}

