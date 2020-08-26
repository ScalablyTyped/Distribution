package typings.graphql.definitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.ScalarTypeDefinitionNode
import typings.graphql.astMod.ScalarTypeExtensionNode
import typings.graphql.astMod.ValueNode
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLScalarTypeConfig[TInternal, TExternal] extends js.Object {
  var astNode: js.UndefOr[Maybe[ScalarTypeDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[ScalarTypeExtensionNode]]] = js.native
  var extensions: js.UndefOr[Maybe[js.Object]] = js.native
  var name: String = js.native
  // Parses an externally provided literal value to use as an input.
  var parseLiteral: js.UndefOr[GraphQLScalarLiteralParser[TInternal]] = js.native
  // Parses an externally provided value to use as an input.
  var parseValue: js.UndefOr[GraphQLScalarValueParser[TInternal]] = js.native
  // Serializes an internal value to include in a response.
  var serialize: js.UndefOr[GraphQLScalarSerializer[TExternal]] = js.native
  var specifiedByUrl: js.UndefOr[Maybe[String]] = js.native
}

object GraphQLScalarTypeConfig {
  @scala.inline
  def apply[TInternal, TExternal](name: String): GraphQLScalarTypeConfig[TInternal, TExternal] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLScalarTypeConfig[TInternal, TExternal]]
  }
  @scala.inline
  implicit class GraphQLScalarTypeConfigOps[Self <: GraphQLScalarTypeConfig[_, _], TInternal, TExternal] (val x: Self with (GraphQLScalarTypeConfig[TInternal, TExternal])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAstNode(value: Maybe[ScalarTypeDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    @scala.inline
    def setDescription(value: Maybe[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setExtensionASTNodesVarargs(value: ScalarTypeExtensionNode*): Self = this.set("extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def setExtensionASTNodes(value: Maybe[js.Array[ScalarTypeExtensionNode]]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionASTNodes: Self = this.set("extensionASTNodes", js.undefined)
    @scala.inline
    def setExtensionASTNodesNull: Self = this.set("extensionASTNodes", null)
    @scala.inline
    def setExtensions(value: Maybe[js.Object]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    @scala.inline
    def setParseLiteral(
      value: (/* valueNode */ ValueNode, /* variables */ Maybe[StringDictionary[js.Any]]) => Maybe[TInternal]
    ): Self = this.set("parseLiteral", js.Any.fromFunction2(value))
    @scala.inline
    def deleteParseLiteral: Self = this.set("parseLiteral", js.undefined)
    @scala.inline
    def setParseValue(value: /* value */ js.Any => Maybe[TInternal]): Self = this.set("parseValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParseValue: Self = this.set("parseValue", js.undefined)
    @scala.inline
    def setSerialize(value: /* value */ js.Any => Maybe[TExternal]): Self = this.set("serialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    @scala.inline
    def setSpecifiedByUrl(value: Maybe[String]): Self = this.set("specifiedByUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecifiedByUrl: Self = this.set("specifiedByUrl", js.undefined)
    @scala.inline
    def setSpecifiedByUrlNull: Self = this.set("specifiedByUrl", null)
  }
  
}

