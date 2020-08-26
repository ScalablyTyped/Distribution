package typings.graphqlCompose.anon

import typings.graphql.astMod.ObjectTypeDefinitionNode
import typings.graphql.astMod.ObjectTypeExtensionNode
import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.definitionMod.GraphQLInterfaceType
import typings.graphql.definitionMod.GraphQLIsTypeOfFn
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.Thunk
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<graphql.graphql/type/definition.GraphQLObjectTypeConfig<any, any>> */
@js.native
trait ReadonlyGraphQLObjectType extends js.Object {
  val astNode: js.UndefOr[Maybe[ObjectTypeDefinitionNode]] = js.native
  val description: js.UndefOr[Maybe[String]] = js.native
  val extensionASTNodes: js.UndefOr[Maybe[js.Array[ObjectTypeExtensionNode]]] = js.native
  val extensions: js.UndefOr[Maybe[js.Object]] = js.native
  val fields: Thunk[GraphQLFieldConfigMap[_, _]] = js.native
  val interfaces: js.UndefOr[Thunk[Maybe[js.Array[GraphQLInterfaceType]]]] = js.native
  val isTypeOf: js.UndefOr[Maybe[GraphQLIsTypeOfFn[_, _]]] = js.native
  val name: String = js.native
}

object ReadonlyGraphQLObjectType {
  @scala.inline
  def apply(fields: Thunk[GraphQLFieldConfigMap[_, _]], name: String): ReadonlyGraphQLObjectType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyGraphQLObjectType]
  }
  @scala.inline
  implicit class ReadonlyGraphQLObjectTypeOps[Self <: ReadonlyGraphQLObjectType] (val x: Self) extends AnyVal {
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
    def setFieldsFunction0(value: () => GraphQLFieldConfigMap[_, _]): Self = this.set("fields", js.Any.fromFunction0(value))
    @scala.inline
    def setFields(value: Thunk[GraphQLFieldConfigMap[_, _]]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAstNode(value: Maybe[ObjectTypeDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
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
    def setExtensionASTNodesVarargs(value: ObjectTypeExtensionNode*): Self = this.set("extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def setExtensionASTNodes(value: Maybe[js.Array[ObjectTypeExtensionNode]]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
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
    def setInterfacesVarargs(value: GraphQLInterfaceType*): Self = this.set("interfaces", js.Array(value :_*))
    @scala.inline
    def setInterfacesFunction0(value: () => Maybe[js.Array[GraphQLInterfaceType]]): Self = this.set("interfaces", js.Any.fromFunction0(value))
    @scala.inline
    def setInterfaces(value: Thunk[Maybe[js.Array[GraphQLInterfaceType]]]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaces: Self = this.set("interfaces", js.undefined)
    @scala.inline
    def setInterfacesNull: Self = this.set("interfaces", null)
    @scala.inline
    def setIsTypeOf(value: (_, _, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean]): Self = this.set("isTypeOf", js.Any.fromFunction3(value))
    @scala.inline
    def deleteIsTypeOf: Self = this.set("isTypeOf", js.undefined)
    @scala.inline
    def setIsTypeOfNull: Self = this.set("isTypeOf", null)
  }
  
}

