package typings
package graphqlLib.typeDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/directives", JSImport.Namespace)
@js.native
object typeDirectivesModMembers extends js.Object {
  val DEFAULT_DEPRECATION_REASON: graphqlLib.graphqlLibStrings.`No longer supported` = js.native
  val GraphQLDeprecatedDirective: GraphQLDirective = js.native
  val GraphQLIncludeDirective: GraphQLDirective = js.native
  val GraphQLSkipDirective: GraphQLDirective = js.native
  val specifiedDirectives: js.Array[GraphQLDirective] = js.native
  def isDirective(directive: js.Any): /* is graphql.graphql/type/directives.GraphQLDirective */ scala.Boolean = js.native
  def isSpecifiedDirective(directive: GraphQLDirective): scala.Boolean = js.native
}

