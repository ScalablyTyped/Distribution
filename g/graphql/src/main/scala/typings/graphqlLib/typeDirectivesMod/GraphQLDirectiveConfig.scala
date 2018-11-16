package typings
package graphqlLib.typeDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLDirectiveConfig extends js.Object {
  var args: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap]
  ] = js.undefined
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.DirectiveDefinitionNode]
  ] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var locations: js.Array[graphqlLib.languageDirectiveLocationMod.DirectiveLocationEnum]
  var name: java.lang.String
}

