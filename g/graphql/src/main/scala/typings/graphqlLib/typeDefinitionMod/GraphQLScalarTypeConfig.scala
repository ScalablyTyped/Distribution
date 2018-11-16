package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLScalarTypeConfig[TInternal, TExternal] extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ScalarTypeDefinitionNode]
  ] = js.native
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.native
  var extensionASTNodes: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.ScalarTypeExtensionNode]]
  ] = js.native
  var name: java.lang.String = js.native
  // Parses an externally provided literal value to use as an input.
  var parseLiteral: js.UndefOr[GraphQLScalarLiteralParser[TInternal]] = js.native
  // Parses an externally provided value to use as an input.
  var parseValue: js.UndefOr[GraphQLScalarValueParser[TInternal]] = js.native
  // Serializes an internal value to include in a response.
  @JSName("serialize")
  var serialize_Original: GraphQLScalarSerializer[TExternal] = js.native
  // Serializes an internal value to include in a response.
  def serialize(value: js.Any): graphqlLib.tsutilsMaybeMod.Maybe[TExternal] = js.native
}

