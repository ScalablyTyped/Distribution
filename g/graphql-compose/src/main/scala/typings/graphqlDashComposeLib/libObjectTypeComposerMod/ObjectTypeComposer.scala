package typings
package graphqlDashComposeLib.libObjectTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/ObjectTypeComposer", "ObjectTypeComposer")
@js.native
class ObjectTypeComposer[TSource, TContext] protected () extends _ComposeOutputType[TSource, TContext] {
  def this(gqType: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]], schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext]) = this()
  var gqType: GraphQLObjectTypeExtended[TSource, TContext] = js.native
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext] = js.native
  /**
    * Add new fields or replace existed in a GraphQL type
    */
  def addFields(newFields: ComposeFieldConfigMap[TSource, TContext]): this.type = js.native
  def addInterface(interfaceObj: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]): this.type = js.native
  def addInterface(interfaceObj: graphqlLib.graphqlMod.GraphQLInterfaceType): this.type = js.native
  /**
    * Add new fields or replace existed (where field name may have dots)
    */
  def addNestedFields(newFields: ComposeFieldConfigMap[TSource, TContext]): this.type = js.native
  // -----------------------------------------------
  // Misc methods
  // -----------------------------------------------
  def addRelation[TRelationSource, TArgs](fieldName: java.lang.String, relationOpts: RelationOpts[TRelationSource, TSource, TContext, TArgs]): this.type = js.native
  def addResolver[TResolverSource, TArgs](resolver: graphqlDashComposeLib.libResolverMod.Resolver[TResolverSource, TContext, TArgs, _]): this.type = js.native
  def addResolver[TResolverSource, TArgs](resolver: graphqlDashComposeLib.libResolverMod.ResolverOpts[TResolverSource, TContext, TArgs, _]): this.type = js.native
  def clearExtensions(): this.type = js.native
  def clearFieldExtensions(fieldName: java.lang.String): this.type = js.native
  def clone[TCloneSource](newTypeName: java.lang.String): ObjectTypeComposer[TCloneSource, TContext] = js.native
  def deprecateFields(fields: java.lang.String): this.type = js.native
  def deprecateFields(fields: js.Array[java.lang.String]): this.type = js.native
  def deprecateFields(fields: org.scalablytyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
  def extendExtensions(extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions): this.type = js.native
  def extendField[TArgs](
    fieldName: java.lang.String,
    partialFieldConfig: stdLib.Partial[ComposeFieldConfig[TSource, TContext, TArgs]]
  ): this.type = js.native
  def extendFieldExtensions(fieldName: java.lang.String, extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions): this.type = js.native
  def get(path: java.lang.String): js.Any = js.native
  def get(path: js.Array[java.lang.String]): js.Any = js.native
  def getDescription(): java.lang.String = js.native
  def getExtension(extensionName: java.lang.String): js.Any = js.native
  // -----------------------------------------------
  // Extensions methods
  // -----------------------------------------------
  def getExtensions(): graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions = js.native
  def getField[TArgs](fieldName: java.lang.String): ComposeFieldConfig[TSource, TContext, TArgs] = js.native
  def getFieldArg(fieldName: java.lang.String, argName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def getFieldArgType(fieldName: java.lang.String, argName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLInputType = js.native
  def getFieldArgs(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap = js.native
  def getFieldConfig(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def getFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): js.Any = js.native
  def getFieldExtensions(fieldName: java.lang.String): graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions = js.native
  def getFieldNames(): js.Array[java.lang.String] = js.native
  def getFieldTC(fieldName: java.lang.String): ObjectTypeComposer[TSource, TContext] = js.native
  def getFieldType(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLOutputType = js.native
  // -----------------------------------------------
  // Field methods
  // -----------------------------------------------
  def getFields(): ComposeFieldConfigMap[TSource, TContext] = js.native
  def getITC(): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  // -----------------------------------------------
  // InputType methods
  // -----------------------------------------------
  def getInputType(): graphqlLib.graphqlMod.GraphQLInputObjectType = js.native
  def getInputTypeComposer(): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  // -----------------------------------------------
  // Interface methods
  // -----------------------------------------------
  def getInterfaces(): js.Array[
    (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]) | graphqlLib.graphqlMod.GraphQLInterfaceType
  ] = js.native
  def getIsTypeOf(): (graphqlLib.typeDefinitionMod.GraphQLIsTypeOfFn[TSource, TContext]) | scala.Null | scala.Unit = js.native
  /**
    * Get function that returns record id, from provided object.
    */
  def getRecordId(source: TSource): java.lang.String | scala.Double = js.native
  def getRecordId(source: TSource, args: ArgsMap): java.lang.String | scala.Double = js.native
  def getRecordId(source: TSource, args: ArgsMap, context: TContext): java.lang.String | scala.Double = js.native
  def getRecordIdFn(): GetRecordIdFn[TSource, TContext] = js.native
  def getRelations(): RelationThunkMap[_, TContext] = js.native
  def getResolver[TResolverSource, TArgs](name: java.lang.String): graphqlDashComposeLib.libResolverMod.Resolver[TResolverSource, TContext, TArgs, _] = js.native
  def getResolver[TResolverSource, TArgs](
    name: java.lang.String,
    middlewares: js.Array[
      graphqlDashComposeLib.libResolverMod.ResolverMiddleware[TResolverSource, TContext, TArgs]
    ]
  ): graphqlDashComposeLib.libResolverMod.Resolver[TResolverSource, TContext, TArgs, _] = js.native
  // -----------------------------------------------
  // Resolver methods
  // -----------------------------------------------
  def getResolvers(): stdLib.Map[java.lang.String, graphqlDashComposeLib.libResolverMod.Resolver[_, TContext, _, _]] = js.native
  // -----------------------------------------------
  // Type methods
  // -----------------------------------------------
  def getType(): graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[
    graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[
    graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.native
  def hasExtension(extensionName: java.lang.String): scala.Boolean = js.native
  def hasField(fieldName: java.lang.String): scala.Boolean = js.native
  def hasFieldArg(fieldName: java.lang.String, argName: java.lang.String): scala.Boolean = js.native
  def hasFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): scala.Boolean = js.native
  def hasInputTypeComposer(): scala.Boolean = js.native
  def hasInterface(iface: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]): scala.Boolean = js.native
  def hasInterface(iface: graphqlLib.graphqlMod.GraphQLInterfaceType): scala.Boolean = js.native
  def hasInterface(iface: java.lang.String): scala.Boolean = js.native
  def hasRecordIdFn(): scala.Boolean = js.native
  def hasResolver(name: java.lang.String): scala.Boolean = js.native
  def isFieldNonNull(fieldName: java.lang.String): scala.Boolean = js.native
  def makeFieldNonNull(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeFieldNonNull(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeExtension(extensionName: java.lang.String): this.type = js.native
  def removeField(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeField(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): this.type = js.native
  def removeInputTypeComposer(): this.type = js.native
  def removeInterface(interfaceObj: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]): this.type = js.native
  def removeInterface(interfaceObj: graphqlLib.graphqlMod.GraphQLInterfaceType): this.type = js.native
  def removeOtherFields(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeResolver(resolverName: java.lang.String): this.type = js.native
  def reorderFields(names: js.Array[java.lang.String]): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setExtension(extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setExtensions(extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions): this.type = js.native
  def setField[TArgs](fieldName: java.lang.String, fieldConfig: ComposeFieldConfig[TSource, TContext, TArgs]): this.type = js.native
  def setFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setFieldExtensions(fieldName: java.lang.String, extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions): this.type = js.native
  def setFields(fields: ComposeFieldConfigMap[TSource, TContext]): this.type = js.native
  def setInputTypeComposer(itc: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext]): this.type = js.native
  def setInterfaces(
    interfaces: js.Array[
      (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]) | graphqlLib.graphqlMod.GraphQLInterfaceType
    ]
  ): this.type = js.native
  def setIsTypeOf(): this.type = js.native
  def setIsTypeOf(fn: graphqlLib.typeDefinitionMod.GraphQLIsTypeOfFn[_, _]): this.type = js.native
  def setIsTypeOf(fn: scala.Unit): this.type = js.native
  def setRecordIdFn(fn: GetRecordIdFn[TSource, TContext]): this.type = js.native
  def setResolver[TResolverSource, TArgs](
    name: java.lang.String,
    resolver: graphqlDashComposeLib.libResolverMod.Resolver[TResolverSource, TContext, TArgs, _]
  ): this.type = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
  def wrapResolver[TResolverSource, TArgs](
    resolverName: java.lang.String,
    cbResolver: graphqlDashComposeLib.libResolverMod.ResolverWrapCb[TResolverSource, TSource, TContext, TArgs, ArgsMap]
  ): this.type = js.native
  def wrapResolverAs[TResolverSource, TArgs](
    resolverName: java.lang.String,
    fromResolverName: java.lang.String,
    cbResolver: graphqlDashComposeLib.libResolverMod.ResolverWrapCb[TResolverSource, TSource, TContext, TArgs, ArgsMap]
  ): this.type = js.native
  def wrapResolverResolve[TResolverSource, TArgs](
    resolverName: java.lang.String,
    cbNextRp: graphqlDashComposeLib.libResolverMod.ResolverNextRpCb[TResolverSource, TContext, TArgs]
  ): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/lib/ObjectTypeComposer", "ObjectTypeComposer")
@js.native
object ObjectTypeComposer extends js.Object {
  def create[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposeDefinition[TSrc, TCtx]): graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
}

