package typings.graphqlCompose.inputTypeComposerMod

import typings.graphql.anon.GraphQLInputObjectTypeCon
import typings.graphql.anon.ReadonlyGraphQLInputObjec
import typings.graphql.astMod.InputObjectTypeDefinitionNode
import typings.graphql.astMod.InputObjectTypeExtensionNode
import typings.graphql.definitionMod.GraphQLInputFieldMap
import typings.graphql.maybeMod.Maybe
import typings.graphqlCompose.definitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql-compose.graphql-compose/lib/graphql.GraphQLInputObjectType & {  _gqcFields :graphql-compose.graphql-compose/lib/InputTypeComposer.ComposeInputFieldConfigMap | undefined,   _gqcExtensions :graphql-compose.graphql-compose/lib/utils/definitions.Extensions | undefined} */
@js.native
trait GraphQLInputObjectTypeExtended extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.native
  var _gqcFields: js.UndefOr[ComposeInputFieldConfigMap] = js.native
  var astNode: Maybe[InputObjectTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[InputObjectTypeExtensionNode]] = js.native
  var extensions: Maybe[js.Object] = js.native
  var name: String = js.native
  def getFields(): GraphQLInputFieldMap = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLInputObjectTypeCon = js.native
  def toJSON(): String = js.native
}

object GraphQLInputObjectTypeExtended {
  @scala.inline
  def apply(
    getFields: () => GraphQLInputFieldMap,
    inspect: () => String,
    name: String,
    toConfig: () => GraphQLInputObjectTypeCon,
    toJSON: () => String
  ): GraphQLInputObjectTypeExtended = {
    val __obj = js.Dynamic.literal(getFields = js.Any.fromFunction0(getFields), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GraphQLInputObjectTypeExtended]
  }
  @scala.inline
  implicit class GraphQLInputObjectTypeExtendedOps[Self <: GraphQLInputObjectTypeExtended] (val x: Self) extends AnyVal {
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
    def setGetFields(value: () => GraphQLInputFieldMap): Self = this.set("getFields", js.Any.fromFunction0(value))
    @scala.inline
    def setInspect(value: () => String): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setToConfig(value: () => GraphQLInputObjectTypeCon): Self = this.set("toConfig", js.Any.fromFunction0(value))
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def set_gqcExtensions(value: Extensions): Self = this.set("_gqcExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcExtensions: Self = this.set("_gqcExtensions", js.undefined)
    @scala.inline
    def set_gqcFields(value: ComposeInputFieldConfigMap): Self = this.set("_gqcFields", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcFields: Self = this.set("_gqcFields", js.undefined)
    @scala.inline
    def setAstNode(value: Maybe[InputObjectTypeDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
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
    def setExtensionASTNodesVarargs(value: InputObjectTypeExtensionNode*): Self = this.set("extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def setExtensionASTNodes(value: Maybe[js.Array[InputObjectTypeExtensionNode]]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
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

