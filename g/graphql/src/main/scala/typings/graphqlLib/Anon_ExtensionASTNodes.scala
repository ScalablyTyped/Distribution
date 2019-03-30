package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ExtensionASTNodes extends js.Object {
  var extensionASTNodes: js.Array[graphqlLib.languageAstMod.ScalarTypeExtensionNode] = js.native
  @JSName("parseLiteral")
  var parseLiteral_Original: graphqlLib.typeDefinitionMod.GraphQLScalarLiteralParser[_] = js.native
  @JSName("parseValue")
  var parseValue_Original: graphqlLib.typeDefinitionMod.GraphQLScalarValueParser[_] = js.native
  def parseLiteral(
    valueNode: graphqlLib.languageAstMod.ValueNode,
    variables: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): graphqlLib.tsutilsMaybeMod.Maybe[_] = js.native
  def parseValue(value: js.Any): graphqlLib.tsutilsMaybeMod.Maybe[_] = js.native
}

