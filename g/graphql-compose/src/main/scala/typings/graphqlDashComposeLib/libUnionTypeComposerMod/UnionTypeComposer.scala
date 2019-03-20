package typings
package graphqlDashComposeLib.libUnionTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/UnionTypeComposer", "UnionTypeComposer")
@js.native
class UnionTypeComposer[TSource, TContext] protected () extends js.Object {
  def this(gqType: graphqlLib.graphqlMod.GraphQLUnionType) = this()
  var gqType: GraphQLUnionTypeExtended[TSource, TContext] = js.native
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TSource] = js.native
  def addType(`type`: graphqlDashComposeLib.libTypeMapperMod.ComposeObjectType): this.type = js.native
  def addTypeResolver(
    `type`: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext],
    checkFn: UnionTypeResolverCheckFn[_, TContext]
  ): this.type = js.native
  def addTypeResolver(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    checkFn: UnionTypeResolverCheckFn[_, TContext]
  ): this.type = js.native
  def clone(newTypeName: java.lang.String): this.type = js.native
  def getDescription(): java.lang.String = js.native
  // -----------------------------------------------
  // ResolveType methods
  // -----------------------------------------------
  def getResolveType(): (graphqlLib.typeDefinitionMod.GraphQLTypeResolver[_, TContext, org.scalablytyped.runtime.StringDictionary[_]]) | scala.Null | scala.Unit = js.native
  // -----------------------------------------------
  // Type methods
  // -----------------------------------------------
  def getType(): graphqlLib.graphqlMod.GraphQLUnionType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNames(): js.Array[java.lang.String] = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlLib.graphqlMod.GraphQLUnionType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlLib.graphqlMod.GraphQLUnionType] = js.native
  def getTypeResolverCheckFn(`type`: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext]): UnionTypeResolverCheckFn[_, TContext] = js.native
  def getTypeResolverCheckFn(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): UnionTypeResolverCheckFn[_, TContext] = js.native
  def getTypeResolverNames(): js.Array[java.lang.String] = js.native
  def getTypeResolverTypes(): js.Array[
    graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.native
  def getTypeResolvers(): UnionTypeResolversMap[TSource, TContext] = js.native
  def getTypes(): ComposeTypesArray = js.native
  def hasType(name: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TContext, _]): scala.Boolean = js.native
  def hasType(name: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]): scala.Boolean = js.native
  // -----------------------------------------------
  // Union Types methods
  // -----------------------------------------------
  def hasType(name: java.lang.String): scala.Boolean = js.native
  def hasTypeResolver(`type`: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext]): scala.Boolean = js.native
  def hasTypeResolver(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): scala.Boolean = js.native
  def removeOtherTypes(nameOrArray: java.lang.String): this.type = js.native
  def removeOtherTypes(nameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeType(nameOrArray: java.lang.String): this.type = js.native
  def removeType(nameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeTypeResolver(`type`: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext]): this.type = js.native
  def removeTypeResolver(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setResolveType(): this.type = js.native
  def setResolveType(
    fn: graphqlLib.typeDefinitionMod.GraphQLTypeResolver[_, TContext, org.scalablytyped.runtime.StringDictionary[_]]
  ): this.type = js.native
  def setResolveType(fn: scala.Unit): this.type = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
  def setTypeResolvers(typeResolversMap: UnionTypeResolversMap[_, TContext]): this.type = js.native
  def setTypes(types: ComposeTypesArray): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/lib/UnionTypeComposer", "UnionTypeComposer")
@js.native
object UnionTypeComposer extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create[TSrc, TCtx](typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposerDefinition[TCtx]): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposerDefinition[TCtx]): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
}

