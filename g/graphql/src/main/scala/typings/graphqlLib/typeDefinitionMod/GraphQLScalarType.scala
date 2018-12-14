package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLScalarType")
@js.native
class GraphQLScalarType protected () extends js.Object {
  def this(config: GraphQLScalarTypeConfig[_, _]) = this()
  var astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ScalarTypeDefinitionNode] = js.native
  var description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = js.native
  var extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.ScalarTypeExtensionNode]] = js.native
  var name: java.lang.String = js.native
  @JSName("parseLiteral")
  var parseLiteral_Original: GraphQLScalarLiteralParser[_] = js.native
  @JSName("parseValue")
  var parseValue_Original: GraphQLScalarValueParser[_] = js.native
  @JSName("serialize")
  var serialize_Original: GraphQLScalarSerializer[_] = js.native
  def inspect(): java.lang.String = js.native
  def parseLiteral(
    valueNode: graphqlLib.languageAstMod.ValueNode,
    variables: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): graphqlLib.tsutilsMaybeMod.Maybe[_] = js.native
  def parseValue(value: js.Any): graphqlLib.tsutilsMaybeMod.Maybe[_] = js.native
  def serialize(value: js.Any): graphqlLib.tsutilsMaybeMod.Maybe[_] = js.native
  def toJSON(): java.lang.String = js.native
}

