package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLEnumType")
@js.native
class GraphQLEnumType protected ()
  extends GraphQLLeafType
     with _GraphQLInputType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLOutputType
     with _GraphQLType {
  def this(config: GraphQLEnumTypeConfig) = this()
  var astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.EnumTypeDefinitionNode] = js.native
  var description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = js.native
  var extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.EnumTypeExtensionNode]] = js.native
  var name: java.lang.String = js.native
  def getValue(name: java.lang.String): graphqlLib.tsutilsMaybeMod.Maybe[GraphQLEnumValue] = js.native
  def getValues(): js.Array[GraphQLEnumValue] = js.native
  def inspect(): java.lang.String = js.native
  def parseLiteral(
    valueNode: graphqlLib.languageAstMod.ValueNode,
    _variables: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): graphqlLib.tsutilsMaybeMod.Maybe[_] = js.native
  def parseValue(value: js.Any): graphqlLib.tsutilsMaybeMod.Maybe[_] = js.native
  def serialize(value: js.Any): graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = js.native
  def toConfig(): GraphQLEnumTypeConfig with graphqlLib.Anon_ExtensionASTNodesEnumTypeExtensionNode = js.native
  def toJSON(): java.lang.String = js.native
}

