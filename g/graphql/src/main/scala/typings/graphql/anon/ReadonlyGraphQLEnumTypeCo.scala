package typings.graphql.anon

import typings.graphql.astMod.EnumTypeDefinitionNode
import typings.graphql.astMod.EnumTypeExtensionNode
import typings.graphql.definitionMod.GraphQLEnumValueConfigMap
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<graphql.graphql/type/definition.GraphQLEnumTypeConfig> */
@js.native
trait ReadonlyGraphQLEnumTypeCo extends js.Object {
  val astNode: js.UndefOr[Maybe[EnumTypeDefinitionNode]] = js.native
  val description: js.UndefOr[Maybe[String]] = js.native
  val extensionASTNodes: js.UndefOr[Maybe[js.Array[EnumTypeExtensionNode]]] = js.native
  val extensions: js.UndefOr[Maybe[js.Object]] = js.native
  val name: String = js.native
  val values: GraphQLEnumValueConfigMap = js.native
}

object ReadonlyGraphQLEnumTypeCo {
  @scala.inline
  def apply(name: String, values: GraphQLEnumValueConfigMap): ReadonlyGraphQLEnumTypeCo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyGraphQLEnumTypeCo]
  }
  @scala.inline
  implicit class ReadonlyGraphQLEnumTypeCoOps[Self <: ReadonlyGraphQLEnumTypeCo] (val x: Self) extends AnyVal {
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
    def setExtensionASTNodesVarargs(value: EnumTypeExtensionNode*): Self = this.set("extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def setExtensionASTNodes(value: Maybe[js.Array[EnumTypeExtensionNode]]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
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
  }
  
}

