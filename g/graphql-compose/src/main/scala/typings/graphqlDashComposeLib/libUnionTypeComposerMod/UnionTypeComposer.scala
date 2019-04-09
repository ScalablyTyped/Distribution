package typings
package graphqlDashComposeLib.libUnionTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/UnionTypeComposer", "UnionTypeComposer")
@js.native
class UnionTypeComposer[TSource, TContext] protected ()
  extends graphqlDashComposeLib.libObjectTypeComposerMod._ComposeOutputType[TSource, TContext] {
  def this(gqType: graphqlLib.graphqlMod.GraphQLUnionType, schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext]) = this()
  var gqType: GraphQLUnionTypeExtended[TSource, TContext] = js.native
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext] = js.native
  def addType(`type`: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeObjectType): this.type = js.native
  def addTypeResolver(
    `type`: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext],
    checkFn: UnionTypeResolverCheckFn[TSource, TContext]
  ): this.type = js.native
  def addTypeResolver(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    checkFn: UnionTypeResolverCheckFn[TSource, TContext]
  ): this.type = js.native
  def clearExtensions(): this.type = js.native
  def clearTypes(): UnionTypeComposer[TSource, TContext] = js.native
  def clone(newTypeName: java.lang.String): UnionTypeComposer[TSource, TContext] = js.native
  def extendExtensions(extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions): this.type = js.native
  def getDescription(): java.lang.String = js.native
  def getDirectiveById(idx: scala.Double): graphqlDashComposeLib.libUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getDirectiveByName(directiveName: java.lang.String): graphqlDashComposeLib.libUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getDirectiveNames(): js.Array[java.lang.String] = js.native
  /**
    * -----------------------------------------------
    * Directive methods
    * -----------------------------------------------
    */
  def getDirectives(): js.Array[graphqlDashComposeLib.libUtilsDefinitionsMod.ExtensionsDirective] = js.native
  def getExtension(extensionName: java.lang.String): js.Any = js.native
  /**
    * -----------------------------------------------
    * Extensions methods
    * -----------------------------------------------
    */
  def getExtensions(): graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions = js.native
  /**
    * -----------------------------------------------
    * ResolveType methods
    * -----------------------------------------------
    */
  def getResolveType(): (graphqlLib.typeDefinitionMod.GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]) | scala.Null | scala.Unit = js.native
  /**
    * -----------------------------------------------
    * Type methods
    * -----------------------------------------------
    */
  def getType(): graphqlLib.graphqlMod.GraphQLUnionType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNames(): js.Array[java.lang.String] = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlLib.graphqlMod.GraphQLUnionType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlLib.graphqlMod.GraphQLUnionType] = js.native
  def getTypeResolverCheckFn(`type`: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): UnionTypeResolverCheckFn[_, TContext] = js.native
  def getTypeResolverCheckFn(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): UnionTypeResolverCheckFn[_, TContext] = js.native
  def getTypeResolverNames(): js.Array[java.lang.String] = js.native
  def getTypeResolverTypes(): js.Array[
    graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.native
  def getTypeResolvers(): UnionTypeResolversMap[TSource, TContext] = js.native
  def getTypes(): js.Array[graphqlDashComposeLib.libObjectTypeComposerMod.ComposeObjectType] = js.native
  def hasExtension(extensionName: java.lang.String): scala.Boolean = js.native
  def hasType(name: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): scala.Boolean = js.native
  def hasType(name: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]): scala.Boolean = js.native
  /**
    * -----------------------------------------------
    * Union Types methods
    * -----------------------------------------------
    */
  def hasType(name: java.lang.String): scala.Boolean = js.native
  def hasTypeResolver(`type`: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): scala.Boolean = js.native
  def hasTypeResolver(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): scala.Boolean = js.native
  def removeExtension(extensionName: java.lang.String): this.type = js.native
  def removeOtherTypes(nameOrArray: java.lang.String): this.type = js.native
  def removeOtherTypes(nameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeType(nameOrArray: java.lang.String): this.type = js.native
  def removeType(nameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeTypeResolver(`type`: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): this.type = js.native
  def removeTypeResolver(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setExtension(extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setExtensions(extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions): this.type = js.native
  def setResolveType(): this.type = js.native
  def setResolveType(
    fn: graphqlLib.typeDefinitionMod.GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]
  ): this.type = js.native
  def setResolveType(fn: scala.Unit): this.type = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
  def setTypeResolvers(typeResolversMap: UnionTypeResolversMap[TSource, TContext]): this.type = js.native
  def setTypes(types: js.Array[graphqlDashComposeLib.libObjectTypeComposerMod.ComposeObjectType]): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/lib/UnionTypeComposer", "UnionTypeComposer")
@js.native
object UnionTypeComposer extends js.Object {
  /**
    * Create `UnionTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `UnionTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposeDefinition[TSrc, TCtx]): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
}

