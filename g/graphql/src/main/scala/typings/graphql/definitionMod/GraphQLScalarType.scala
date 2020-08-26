package typings.graphql.definitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.anon.GraphQLScalarTypeConfigan
import typings.graphql.anon.ReadonlyGraphQLScalarType
import typings.graphql.astMod.ScalarTypeDefinitionNode
import typings.graphql.astMod.ScalarTypeExtensionNode
import typings.graphql.astMod.ValueNode
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLScalarType")
@js.native
class GraphQLScalarType protected ()
  extends GraphQLLeafType
     with _GraphQLInputType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLOutputType
     with _GraphQLType {
  def this(config: ReadonlyGraphQLScalarType) = this()
  var astNode: Maybe[ScalarTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[ScalarTypeExtensionNode]] = js.native
  var extensions: Maybe[js.Object] = js.native
  var name: String = js.native
  @JSName("parseLiteral")
  var parseLiteral_Original: GraphQLScalarLiteralParser[_] = js.native
  @JSName("parseValue")
  var parseValue_Original: GraphQLScalarValueParser[_] = js.native
  @JSName("serialize")
  var serialize_Original: GraphQLScalarSerializer[_] = js.native
  var specifiedByUrl: Maybe[String] = js.native
  def inspect(): String = js.native
  def parseLiteral(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): Maybe[_] = js.native
  def parseValue(value: js.Any): Maybe[_] = js.native
  def serialize(value: js.Any): Maybe[_] = js.native
  def toConfig(): GraphQLScalarTypeConfigan = js.native
  def toJSON(): String = js.native
}

