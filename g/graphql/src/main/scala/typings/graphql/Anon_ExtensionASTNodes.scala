package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.ScalarTypeExtensionNode
import typings.graphql.languageAstMod.ValueNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLScalarLiteralParser
import typings.graphql.typeDefinitionMod.GraphQLScalarValueParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ExtensionASTNodes extends js.Object {
  var extensionASTNodes: js.Array[ScalarTypeExtensionNode] = js.native
  @JSName("parseLiteral")
  var parseLiteral_Original: GraphQLScalarLiteralParser[_] = js.native
  @JSName("parseValue")
  var parseValue_Original: GraphQLScalarValueParser[_] = js.native
  def parseLiteral(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): Maybe[_] = js.native
  def parseValue(value: js.Any): Maybe[_] = js.native
}

