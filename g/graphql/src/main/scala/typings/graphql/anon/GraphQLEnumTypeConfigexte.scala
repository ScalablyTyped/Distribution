package typings.graphql.anon

import typings.graphql.astMod.EnumTypeDefinitionNode
import typings.graphql.astMod.EnumTypeExtensionNode
import typings.graphql.definitionMod.GraphQLEnumValueConfigMap
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/definition.GraphQLEnumTypeConfig & {  extensions :graphql.graphql/jsutils/Maybe.Maybe<std.Readonly<graphql.graphql/type/definition.GraphQLEnumTypeExtensions>>,   extensionASTNodes :std.ReadonlyArray<graphql.graphql/language/ast.EnumTypeExtensionNode>} */
@js.native
trait GraphQLEnumTypeConfigexte extends js.Object {
  var astNode: js.UndefOr[Maybe[EnumTypeDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[EnumTypeExtensionNode]]] with js.Array[EnumTypeExtensionNode] = js.native
  var extensions: js.UndefOr[Maybe[js.Object]] with Maybe[js.Object] = js.native
  var name: String = js.native
  var values: GraphQLEnumValueConfigMap = js.native
}

object GraphQLEnumTypeConfigexte {
  @scala.inline
  def apply(
    extensionASTNodes: js.UndefOr[Maybe[js.Array[EnumTypeExtensionNode]]] with js.Array[EnumTypeExtensionNode],
    name: String,
    values: GraphQLEnumValueConfigMap
  ): GraphQLEnumTypeConfigexte = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumTypeConfigexte]
  }
  @scala.inline
  implicit class GraphQLEnumTypeConfigexteOps[Self <: GraphQLEnumTypeConfigexte] (val x: Self) extends AnyVal {
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
    def setExtensionASTNodes(value: js.UndefOr[Maybe[js.Array[EnumTypeExtensionNode]]] with js.Array[EnumTypeExtensionNode]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: GraphQLEnumValueConfigMap): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setAstNode(value: Maybe[EnumTypeDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
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
    def setExtensions(value: js.UndefOr[Maybe[js.Object]] with Maybe[js.Object]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
  }
  
}

