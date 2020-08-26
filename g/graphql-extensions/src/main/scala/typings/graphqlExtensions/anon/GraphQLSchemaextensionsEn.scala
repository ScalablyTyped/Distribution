package typings.graphqlExtensions.anon

import typings.graphql.anon.GraphQLSchemaConfigtypesA
import typings.graphql.anon.ReadonlyGraphQLSchemaConf
import typings.graphql.astMod.SchemaDefinitionNode
import typings.graphql.astMod.SchemaExtensionNode
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLInterfaceType
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.directivesMod.GraphQLDirective
import typings.graphql.maybeMod.Maybe
import typings.graphql.schemaMod.InterfaceImplementations
import typings.graphql.schemaMod.TypeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLSchema & {  _extensionsEnabled :boolean | undefined} */
@js.native
trait GraphQLSchemaextensionsEn extends js.Object {
  var _extensionsEnabled: js.UndefOr[Boolean] = js.native
  var astNode: Maybe[SchemaDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[SchemaExtensionNode]] = js.native
  var extensions: Maybe[js.Object] = js.native
  def getDirective(name: String): Maybe[GraphQLDirective] = js.native
  def getDirectives(): js.Array[GraphQLDirective] = js.native
  def getImplementations(interfaceType: GraphQLInterfaceType): InterfaceImplementations = js.native
  def getMutationType(): Maybe[GraphQLObjectType[_, _]] = js.native
  def getPossibleTypes(abstractType: GraphQLAbstractType): js.Array[GraphQLObjectType[_, _]] = js.native
  def getQueryType(): Maybe[GraphQLObjectType[_, _]] = js.native
  def getSubscriptionType(): Maybe[GraphQLObjectType[_, _]] = js.native
  def getType(name: String): Maybe[GraphQLNamedType] = js.native
  def getTypeMap(): TypeMap = js.native
  // @deprecated: use isSubType instead - will be removed in v16.
  def isPossibleType(abstractType: GraphQLAbstractType, possibleType: GraphQLObjectType[_, _]): Boolean = js.native
  def isSubType(abstractType: GraphQLAbstractType, maybeSubType: GraphQLNamedType): Boolean = js.native
  def toConfig(): GraphQLSchemaConfigtypesA = js.native
}

object GraphQLSchemaextensionsEn {
  @scala.inline
  def apply(
    getDirective: String => Maybe[GraphQLDirective],
    getDirectives: () => js.Array[GraphQLDirective],
    getImplementations: GraphQLInterfaceType => InterfaceImplementations,
    getMutationType: () => Maybe[GraphQLObjectType[_, _]],
    getPossibleTypes: GraphQLAbstractType => js.Array[GraphQLObjectType[_, _]],
    getQueryType: () => Maybe[GraphQLObjectType[_, _]],
    getSubscriptionType: () => Maybe[GraphQLObjectType[_, _]],
    getType: String => Maybe[GraphQLNamedType],
    getTypeMap: () => TypeMap,
    isPossibleType: (GraphQLAbstractType, GraphQLObjectType[_, _]) => Boolean,
    isSubType: (GraphQLAbstractType, GraphQLNamedType) => Boolean,
    toConfig: () => GraphQLSchemaConfigtypesA
  ): GraphQLSchemaextensionsEn = {
    val __obj = js.Dynamic.literal(getDirective = js.Any.fromFunction1(getDirective), getDirectives = js.Any.fromFunction0(getDirectives), getImplementations = js.Any.fromFunction1(getImplementations), getMutationType = js.Any.fromFunction0(getMutationType), getPossibleTypes = js.Any.fromFunction1(getPossibleTypes), getQueryType = js.Any.fromFunction0(getQueryType), getSubscriptionType = js.Any.fromFunction0(getSubscriptionType), getType = js.Any.fromFunction1(getType), getTypeMap = js.Any.fromFunction0(getTypeMap), isPossibleType = js.Any.fromFunction2(isPossibleType), isSubType = js.Any.fromFunction2(isSubType), toConfig = js.Any.fromFunction0(toConfig))
    __obj.asInstanceOf[GraphQLSchemaextensionsEn]
  }
  @scala.inline
  implicit class GraphQLSchemaextensionsEnOps[Self <: GraphQLSchemaextensionsEn] (val x: Self) extends AnyVal {
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
    def setGetDirective(value: String => Maybe[GraphQLDirective]): Self = this.set("getDirective", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDirectives(value: () => js.Array[GraphQLDirective]): Self = this.set("getDirectives", js.Any.fromFunction0(value))
    @scala.inline
    def setGetImplementations(value: GraphQLInterfaceType => InterfaceImplementations): Self = this.set("getImplementations", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMutationType(value: () => Maybe[GraphQLObjectType[_, _]]): Self = this.set("getMutationType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPossibleTypes(value: GraphQLAbstractType => js.Array[GraphQLObjectType[_, _]]): Self = this.set("getPossibleTypes", js.Any.fromFunction1(value))
    @scala.inline
    def setGetQueryType(value: () => Maybe[GraphQLObjectType[_, _]]): Self = this.set("getQueryType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubscriptionType(value: () => Maybe[GraphQLObjectType[_, _]]): Self = this.set("getSubscriptionType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: String => Maybe[GraphQLNamedType]): Self = this.set("getType", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTypeMap(value: () => TypeMap): Self = this.set("getTypeMap", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPossibleType(value: (GraphQLAbstractType, GraphQLObjectType[_, _]) => Boolean): Self = this.set("isPossibleType", js.Any.fromFunction2(value))
    @scala.inline
    def setIsSubType(value: (GraphQLAbstractType, GraphQLNamedType) => Boolean): Self = this.set("isSubType", js.Any.fromFunction2(value))
    @scala.inline
    def setToConfig(value: () => GraphQLSchemaConfigtypesA): Self = this.set("toConfig", js.Any.fromFunction0(value))
    @scala.inline
    def set_extensionsEnabled(value: Boolean): Self = this.set("_extensionsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_extensionsEnabled: Self = this.set("_extensionsEnabled", js.undefined)
    @scala.inline
    def setAstNode(value: Maybe[SchemaDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
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
    def setExtensionASTNodesVarargs(value: SchemaExtensionNode*): Self = this.set("extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def setExtensionASTNodes(value: Maybe[js.Array[SchemaExtensionNode]]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
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

