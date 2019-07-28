package typings.graphql.typeDefinitionMod

import typings.graphql.languageAstMod.ScalarTypeDefinitionNode
import typings.graphql.languageAstMod.ScalarTypeExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLScalarTypeConfig[TInternal, TExternal] extends js.Object {
  var astNode: js.UndefOr[Maybe[ScalarTypeDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[ScalarTypeExtensionNode]]] = js.native
  var name: String = js.native
  // Parses an externally provided literal value to use as an input.
  var parseLiteral: js.UndefOr[GraphQLScalarLiteralParser[TInternal]] = js.native
  // Parses an externally provided value to use as an input.
  var parseValue: js.UndefOr[GraphQLScalarValueParser[TInternal]] = js.native
  // Serializes an internal value to include in a response.
  @JSName("serialize")
  var serialize_Original: GraphQLScalarSerializer[TExternal] = js.native
  // Serializes an internal value to include in a response.
  def serialize(value: js.Any): Maybe[TExternal] = js.native
}

