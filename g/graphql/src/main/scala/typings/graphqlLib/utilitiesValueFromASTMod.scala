package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/valueFromAST", JSImport.Namespace)
@js.native
object utilitiesValueFromASTMod extends js.Object {
  def valueFromAST(
    valueNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ValueNode],
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType
  ): js.Any = js.native
  def valueFromAST(
    valueNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ValueNode],
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    variables: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): js.Any = js.native
}

