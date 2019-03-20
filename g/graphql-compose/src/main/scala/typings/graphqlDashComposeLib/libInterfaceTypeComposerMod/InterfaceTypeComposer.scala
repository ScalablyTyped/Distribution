package typings
package graphqlDashComposeLib.libInterfaceTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/InterfaceTypeComposer", "InterfaceTypeComposer")
@js.native
class InterfaceTypeComposer[TSource, TContext] protected () extends js.Object {
  def this(gqType: graphqlLib.graphqlMod.GraphQLInterfaceType) = this()
  var gqType: GraphQLInterfaceTypeExtended[TSource, TContext] = js.native
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TSource] = js.native
  /**
    * Add new fields or replace existed in a GraphQL type
    */
  def addFields(newValues: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigMap[TSource, TContext, _]): this.type = js.native
  def addTypeResolver(
    `type`: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext],
    checkFn: InterfaceTypeResolverCheckFn[_, TContext]
  ): this.type = js.native
  def addTypeResolver(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    checkFn: InterfaceTypeResolverCheckFn[_, TContext]
  ): this.type = js.native
  def clone(newTypeName: java.lang.String): this.type = js.native
  def deprecateFields(fields: java.lang.String): this.type = js.native
  def deprecateFields(fields: js.Array[java.lang.String]): this.type = js.native
  def deprecateFields(fields: org.scalablytyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
  def extendField(
    fieldName: java.lang.String,
    parialFieldConfig: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfig[TSource, TContext, _]
  ): this.type = js.native
  // -----------------------------------------------
  // Misc methods
  // -----------------------------------------------
  def get(path: java.lang.String): js.Any = js.native
  def get(path: js.Array[java.lang.String]): js.Any = js.native
  def getDescription(): java.lang.String = js.native
  def getField(name: java.lang.String): graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfig[TSource, TContext, _] = js.native
  def getFieldArg(fieldName: java.lang.String, argName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def getFieldArgType(fieldName: java.lang.String, argName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLInputType = js.native
  def getFieldArgs(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap = js.native
  def getFieldConfig(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def getFieldNames(): js.Array[java.lang.String] = js.native
  def getFieldTC[TSource](fieldName: java.lang.String): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TSource, TContext] = js.native
  def getFieldType(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLOutputType = js.native
  def getFields(): graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigMap[TSource, TContext, _] = js.native
  def getITC(): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
  // -----------------------------------------------
  // InputType methods
  // -----------------------------------------------
  def getInputType(): graphqlLib.graphqlMod.GraphQLInputObjectType = js.native
  def getInputTypeComposer(): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
  // -----------------------------------------------
  // ResolveType methods
  // -----------------------------------------------
  def getResolveType(): (graphqlLib.typeDefinitionMod.GraphQLTypeResolver[_, TContext, org.scalablytyped.runtime.StringDictionary[_]]) | scala.Null | scala.Unit = js.native
  // -----------------------------------------------
  // Type methods
  // -----------------------------------------------
  def getType(): graphqlLib.graphqlMod.GraphQLInterfaceType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlLib.graphqlMod.GraphQLInterfaceType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlLib.graphqlMod.GraphQLInterfaceType] = js.native
  def getTypeResolverCheckFn(`type`: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext]): InterfaceTypeResolverCheckFn[_, TContext] = js.native
  def getTypeResolverCheckFn(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): InterfaceTypeResolverCheckFn[_, TContext] = js.native
  def getTypeResolverNames(): js.Array[java.lang.String] = js.native
  def getTypeResolverTypes(): js.Array[
    graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.native
  def getTypeResolvers(): InterfaceTypeResolversMap[TSource, TContext] = js.native
  // -----------------------------------------------
  // Field methods
  // -----------------------------------------------
  def hasField(name: java.lang.String): scala.Boolean = js.native
  def hasFieldArg(fieldName: java.lang.String, argName: java.lang.String): scala.Boolean = js.native
  def hasInputTypeComposer(): scala.Boolean = js.native
  def hasTypeResolver(`type`: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext]): scala.Boolean = js.native
  def hasTypeResolver(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): scala.Boolean = js.native
  def isFieldNonNull(fieldName: java.lang.String): scala.Boolean = js.native
  def makeFieldNonNull(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeFieldNonNull(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeField(nameOrArray: java.lang.String): this.type = js.native
  def removeField(nameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeInputTypeComposer(): this.type = js.native
  def removeOtherFields(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeTypeResolver(`type`: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext]): this.type = js.native
  def removeTypeResolver(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): this.type = js.native
  def reorderFields(names: js.Array[java.lang.String]): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setField(
    name: java.lang.String,
    fieldConfig: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfig[TSource, TContext, _]
  ): this.type = js.native
  def setFields(fields: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigMap[TSource, TContext, _]): this.type = js.native
  def setInputTypeComposer(itc: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer): this.type = js.native
  def setResolveType(): this.type = js.native
  def setResolveType(
    fn: graphqlLib.typeDefinitionMod.GraphQLTypeResolver[_, TContext, org.scalablytyped.runtime.StringDictionary[_]]
  ): this.type = js.native
  def setResolveType(fn: scala.Unit): this.type = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
  def setTypeResolvers(typeResolversMap: InterfaceTypeResolversMap[_, TContext]): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/lib/InterfaceTypeComposer", "InterfaceTypeComposer")
@js.native
object InterfaceTypeComposer extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create[TSrc, TCtx](typeDef: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposerDefinition[TCtx]): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposerDefinition[TCtx]): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
}

