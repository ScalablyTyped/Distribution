package typings.graphqlCompose.unionTypeComposerMod

import typings.graphql.definitionMod.GraphQLList
import typings.graphql.definitionMod.GraphQLNonNull
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLUnionType
import typings.graphqlCompose.definitionsMod.DirectiveArgs
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.ExtensionsDirective
import typings.graphqlCompose.objectTypeComposerMod.ComposeObjectType
import typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer
import typings.graphqlCompose.objectTypeComposerMod._ComposeOutputType
import typings.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/UnionTypeComposer", "UnionTypeComposer")
@js.native
class UnionTypeComposer[TSource, TContext] protected () extends _ComposeOutputType[TSource, TContext] {
  def this(gqType: GraphQLUnionType, schemaComposer: SchemaComposer[TContext]) = this()
  var gqType: GraphQLUnionTypeExtended[TSource, TContext] = js.native
  var schemaComposer: SchemaComposer[TContext] = js.native
  def addType(`type`: ComposeObjectType): this.type = js.native
  def addTypeResolver(`type`: GraphQLObjectType[_, _], checkFn: UnionTypeResolverCheckFn[TSource, TContext]): this.type = js.native
  def addTypeResolver(`type`: ObjectTypeComposer[_, TContext], checkFn: UnionTypeResolverCheckFn[TSource, TContext]): this.type = js.native
  def clearExtensions(): this.type = js.native
  def clearTypes(): UnionTypeComposer[TSource, TContext] = js.native
  def clone(newTypeName: String): UnionTypeComposer[TSource, TContext] = js.native
  def extendExtensions(extensions: Extensions): this.type = js.native
  def getDescription(): String = js.native
  def getDirectiveById(idx: Double): DirectiveArgs | Unit = js.native
  def getDirectiveByName(directiveName: String): DirectiveArgs | Unit = js.native
  def getDirectiveNames(): js.Array[String] = js.native
  /**
    * -----------------------------------------------
    * Directive methods
    * -----------------------------------------------
    */
  def getDirectives(): js.Array[ExtensionsDirective] = js.native
  def getExtension(extensionName: String): js.Any = js.native
  /**
    * -----------------------------------------------
    * Extensions methods
    * -----------------------------------------------
    */
  def getExtensions(): Extensions = js.native
  /**
    * -----------------------------------------------
    * ResolveType methods
    * -----------------------------------------------
    */
  def getResolveType(): (GraphQLTypeResolver[TSource, TContext]) | Null | Unit = js.native
  /**
    * -----------------------------------------------
    * Type methods
    * -----------------------------------------------
    */
  def getType(): GraphQLUnionType = js.native
  def getTypeName(): String = js.native
  def getTypeNames(): js.Array[String] = js.native
  def getTypeNonNull(): GraphQLNonNull[GraphQLUnionType] = js.native
  def getTypePlural(): GraphQLList[GraphQLUnionType] = js.native
  def getTypeResolverCheckFn(`type`: GraphQLObjectType[_, _]): UnionTypeResolverCheckFn[_, TContext] = js.native
  def getTypeResolverCheckFn(`type`: ObjectTypeComposer[_, TContext]): UnionTypeResolverCheckFn[_, TContext] = js.native
  def getTypeResolverNames(): js.Array[String] = js.native
  def getTypeResolverTypes(): js.Array[GraphQLObjectType[_, _]] = js.native
  def getTypeResolvers(): UnionTypeResolversMap[TSource, TContext] = js.native
  def getTypes(): js.Array[ComposeObjectType] = js.native
  def hasExtension(extensionName: String): Boolean = js.native
  /**
    * -----------------------------------------------
    * Union Types methods
    * -----------------------------------------------
    */
  def hasType(name: String): Boolean = js.native
  def hasType(name: GraphQLObjectType[_, _]): Boolean = js.native
  def hasType(name: ObjectTypeComposer[_, TContext]): Boolean = js.native
  def hasTypeResolver(`type`: GraphQLObjectType[_, _]): Boolean = js.native
  def hasTypeResolver(`type`: ObjectTypeComposer[_, TContext]): Boolean = js.native
  def merge(`type`: GraphQLUnionType): this.type = js.native
  def merge(`type`: UnionTypeComposer[_, _]): this.type = js.native
  def removeExtension(extensionName: String): this.type = js.native
  def removeOtherTypes(nameOrArray: String): this.type = js.native
  def removeOtherTypes(nameOrArray: js.Array[String]): this.type = js.native
  def removeType(nameOrArray: String): this.type = js.native
  def removeType(nameOrArray: js.Array[String]): this.type = js.native
  def removeTypeResolver(`type`: GraphQLObjectType[_, _]): this.type = js.native
  def removeTypeResolver(`type`: ObjectTypeComposer[_, TContext]): this.type = js.native
  def setDescription(description: String): this.type = js.native
  def setExtension(extensionName: String, value: js.Any): this.type = js.native
  def setExtensions(extensions: Extensions): this.type = js.native
  def setResolveType(): this.type = js.native
  def setResolveType(fn: Unit): this.type = js.native
  def setResolveType(fn: GraphQLTypeResolver[TSource, TContext]): this.type = js.native
  def setTypeName(name: String): this.type = js.native
  def setTypeResolvers(typeResolversMap: UnionTypeResolversMap[TSource, TContext]): this.type = js.native
  def setTypes(types: js.Array[ComposeObjectType]): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/lib/UnionTypeComposer", "UnionTypeComposer")
@js.native
object UnionTypeComposer extends js.Object {
  /**
    * Create `UnionTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](typeDef: UnionTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): UnionTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `UnionTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: UnionTypeComposeDefinition[TSrc, TCtx]): UnionTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: UnionTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): UnionTypeComposer[TSrc, TCtx] = js.native
}

