package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLEnumValue extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.EnumValueDefinitionNode]
  ] = js.undefined
  var deprecationReason: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  var description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  var isDeprecated: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var value: js.Any
}

