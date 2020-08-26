package typings.graphql.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.ScalarTypeDefinitionNode
import typings.graphql.astMod.ScalarTypeExtensionNode
import typings.graphql.astMod.ValueNode
import typings.graphql.definitionMod.GraphQLScalarLiteralParser
import typings.graphql.definitionMod.GraphQLScalarSerializer
import typings.graphql.definitionMod.GraphQLScalarValueParser
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/definition.GraphQLScalarTypeConfig<any, any> & {  specifiedByUrl :graphql.graphql/jsutils/Maybe.Maybe<string>,   serialize :graphql.graphql/type/definition.GraphQLScalarSerializer<any>,   parseValue :graphql.graphql/type/definition.GraphQLScalarValueParser<any>,   parseLiteral :graphql.graphql/type/definition.GraphQLScalarLiteralParser<any>,   extensions :graphql.graphql/jsutils/Maybe.Maybe<std.Readonly<graphql.graphql/type/definition.GraphQLScalarTypeExtensions>>,   extensionASTNodes :std.ReadonlyArray<graphql.graphql/language/ast.ScalarTypeExtensionNode>} */
@js.native
trait GraphQLScalarTypeConfigan extends js.Object {
  var astNode: js.UndefOr[Maybe[ScalarTypeDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[ScalarTypeExtensionNode]]] with js.Array[ScalarTypeExtensionNode] = js.native
  var extensions: js.UndefOr[Maybe[js.Object]] with Maybe[js.Object] = js.native
  var name: String = js.native
  // Parses an externally provided literal value to use as an input.
  @JSName("parseLiteral")
  var parseLiteral_Original: js.UndefOr[GraphQLScalarLiteralParser[_]] with GraphQLScalarLiteralParser[_] = js.native
  // Parses an externally provided value to use as an input.
  @JSName("parseValue")
  var parseValue_Original: js.UndefOr[GraphQLScalarValueParser[_]] with GraphQLScalarValueParser[_] = js.native
  // Serializes an internal value to include in a response.
  @JSName("serialize")
  var serialize_Original: js.UndefOr[GraphQLScalarSerializer[_]] with GraphQLScalarSerializer[_] = js.native
  var specifiedByUrl: js.UndefOr[Maybe[String]] with Maybe[String] = js.native
  def parseLiteral(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): Maybe[_] = js.native
  def parseValue(value: js.Any): Maybe[_] = js.native
  def serialize(value: js.Any): Maybe[_] = js.native
}

