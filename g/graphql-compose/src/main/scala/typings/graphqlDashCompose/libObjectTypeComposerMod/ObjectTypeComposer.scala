package typings.graphqlDashCompose.libObjectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLInputObjectType
import typings.graphql.graphqlMod.GraphQLInterfaceType
import typings.graphql.graphqlMod.GraphQLObjectType
import typings.graphql.typeDefinitionMod.GraphQLFieldConfig
import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLIsTypeOfFn
import typings.graphql.typeDefinitionMod.GraphQLList
import typings.graphql.typeDefinitionMod.GraphQLNonNull
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer
import typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer
import typings.graphqlDashCompose.libInterfaceTypeComposerMod.ComposeInterfaceType
import typings.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer
import typings.graphqlDashCompose.libResolverMod.Resolver
import typings.graphqlDashCompose.libResolverMod.ResolverMiddleware
import typings.graphqlDashCompose.libResolverMod.ResolverNextRpCb
import typings.graphqlDashCompose.libResolverMod.ResolverOpts
import typings.graphqlDashCompose.libResolverMod.ResolverWrapCb
import typings.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposer
import typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer
import typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer
import typings.graphqlDashCompose.libUtilsDefinitionsMod.DirectiveArgs
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Extensions
import typings.graphqlDashCompose.libUtilsDefinitionsMod.ExtensionsDirective
import typings.std.Map
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/ObjectTypeComposer", "ObjectTypeComposer")
@js.native
class ObjectTypeComposer[TSource, TContext] protected () extends _ComposeOutputType[TSource, TContext] {
  def this(gqType: GraphQLObjectType[_, _, StringDictionary[_]], schemaComposer: SchemaComposer[TContext]) = this()
  var gqType: GraphQLObjectTypeExtended[TSource, TContext] = js.native
  var schemaComposer: SchemaComposer[TContext] = js.native
  def addFieldArgs(fieldName: String, newArgs: ComposeFieldConfigMap[TSource, TContext]): this.type = js.native
  /**
    * Add new fields or replace existed in a GraphQL type
    */
  def addFields(newFields: ComposeFieldConfigMap[TSource, TContext]): this.type = js.native
  def addInterface(interfaceObj: String): this.type = js.native
  def addInterface(interfaceObj: GraphQLInterfaceType): this.type = js.native
  def addInterface(interfaceObj: InterfaceTypeComposer[_, TContext]): this.type = js.native
  /**
    * Add new fields or replace existed (where field name may have dots)
    */
  def addNestedFields(newFields: ComposeFieldConfigMap[TSource, TContext]): this.type = js.native
  /**
    * -----------------------------------------------
    * Misc methods
    * -----------------------------------------------
    */
  def addRelation[TRelationSource, TArgs](fieldName: String, relationOpts: RelationOpts[TRelationSource, TSource, TContext, TArgs]): this.type = js.native
  def addResolver[TResolverSource, TArgs](resolver: Resolver[TResolverSource, TContext, TArgs, _]): this.type = js.native
  def addResolver[TResolverSource, TArgs](resolver: ResolverOpts[TResolverSource, TContext, TArgs, _]): this.type = js.native
  def clearExtensions(): this.type = js.native
  def clearFieldArgExtensions(fieldName: String, argName: String): this.type = js.native
  def clearFieldExtensions(fieldName: String): this.type = js.native
  def clone[TCloneSource](newTypeName: String): ObjectTypeComposer[TCloneSource, TContext] = js.native
  def deprecateFields(fields: String): this.type = js.native
  def deprecateFields(fields: js.Array[String]): this.type = js.native
  def deprecateFields(fields: StringDictionary[String]): this.type = js.native
  def extendExtensions(extensions: Extensions): this.type = js.native
  def extendField[TArgs](fieldName: String, partialFieldConfig: Partial[ComposeFieldConfig[TSource, TContext, TArgs]]): this.type = js.native
  def extendFieldArgExtensions(fieldName: String, argName: String, extensions: Extensions): this.type = js.native
  def extendFieldExtensions(fieldName: String, extensions: Extensions): this.type = js.native
  def get(path: String): js.Any = js.native
  def get(path: js.Array[String]): js.Any = js.native
  def getDescription(): String = js.native
  def getDirectiveById(idx: Double): DirectiveArgs | Unit = js.native
  def getDirectiveByName(directiveName: String): DirectiveArgs | Unit = js.native
  def getDirectiveNames(): js.Array[String] = js.native
  /**
    * -----------------------------------------------
    * Directive methods
    *
    * Directive methods are usefull if you declare your schemas via SDL.
    * Users who actively use `graphql-tools` can open new abilities for writing
    * your own directive handlers.
    *
    * If you create your schemas via config objects, then probably you
    * no need in `directives`. Instead directives better to use `extensions`.
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
  def getField[TArgs](fieldName: String): ComposeFieldConfigAsObject[TSource, TContext, TArgs] = js.native
  def getFieldArg(fieldName: String, argName: String): ComposeArgumentConfigAsObject = js.native
  def getFieldArgDirectiveById(fieldName: String, argName: String, idx: Double): DirectiveArgs | Unit = js.native
  def getFieldArgDirectiveByName(fieldName: String, argName: String, directiveName: String): DirectiveArgs | Unit = js.native
  def getFieldArgDirectiveNames(fieldName: String, argName: String): js.Array[String] = js.native
  def getFieldArgDirectives(fieldName: String, argName: String): js.Array[ExtensionsDirective] = js.native
  def getFieldArgExtension(fieldName: String, argName: String, extensionName: String): js.Any = js.native
  def getFieldArgExtensions(fieldName: String, argName: String): Extensions = js.native
  /**
    * Alias for `getFieldArgTC()` but returns statically checked InputTypeComposer.
    * If field have other type then error will be thrown.
    */
  def getFieldArgITC(fieldName: String, argName: String): InputTypeComposer[TContext] = js.native
  def getFieldArgTC(fieldName: String, argName: String): InputTypeComposer[TContext] | EnumTypeComposer[TContext] | ScalarTypeComposer[TContext] = js.native
  def getFieldArgType(fieldName: String, argName: String): GraphQLInputType = js.native
  def getFieldArgs[TArgs](fieldName: String): ComposeFieldConfigArgumentMap[TArgs] = js.native
  def getFieldConfig(fieldName: String): GraphQLFieldConfig[TSource, TContext, StringDictionary[_]] = js.native
  def getFieldDirectiveById(fieldName: String, idx: Double): DirectiveArgs | Unit = js.native
  def getFieldDirectiveByName(fieldName: String, directiveName: String): DirectiveArgs | Unit = js.native
  def getFieldDirectiveNames(fieldName: String): js.Array[String] = js.native
  def getFieldDirectives(fieldName: String): js.Array[ExtensionsDirective] = js.native
  def getFieldExtension(fieldName: String, extensionName: String): js.Any = js.native
  def getFieldExtensions(fieldName: String): Extensions = js.native
  def getFieldNames(): js.Array[String] = js.native
  /**
    * Alias for `getFieldTC()` but returns statically checked ObjectTypeComposer.
    * If field have other type then error will be thrown.
    */
  def getFieldOTC(fieldName: String): ObjectTypeComposer[TSource, TContext] = js.native
  def getFieldTC(fieldName: String): (ObjectTypeComposer[TSource, TContext]) | EnumTypeComposer[TContext] | (InterfaceTypeComposer[TSource, TContext]) | (UnionTypeComposer[TSource, TContext]) | ScalarTypeComposer[TContext] = js.native
  def getFieldType(fieldName: String): GraphQLOutputType = js.native
  /**
    * -----------------------------------------------
    * Field methods
    * -----------------------------------------------
    */
  def getFields(): ComposeFieldConfigMap[TSource, TContext] = js.native
  def getITC(): InputTypeComposer[TContext] = js.native
  /**
    * -----------------------------------------------
    * InputType methods
    * -----------------------------------------------
    */
  def getInputType(): GraphQLInputObjectType = js.native
  def getInputTypeComposer(): InputTypeComposer[TContext] = js.native
  /**
    * -----------------------------------------------
    * Interface methods
    * -----------------------------------------------
    */
  def getInterfaces(): js.Array[ComposeInterfaceType] = js.native
  def getIsTypeOf(): (GraphQLIsTypeOfFn[TSource, TContext]) | Null | Unit = js.native
  /**
    * Get function that returns record id, from provided object.
    */
  def getRecordId(source: TSource): String | Double = js.native
  def getRecordId(source: TSource, args: ArgsMap): String | Double = js.native
  def getRecordId(source: TSource, args: ArgsMap, context: TContext): String | Double = js.native
  def getRecordIdFn(): GetRecordIdFn[TSource, TContext] = js.native
  def getRelations(): RelationThunkMap[_, TContext] = js.native
  /**
    * Returns existed Resolver by name.
    *
    * Resolver may be additionally wrapped by middlewares. Eg:
    *
    * @example
    *     async function authMiddleware(resolve, source, args, context, info) {
    *       if (somehowCheckAuthInContext(context)) {
    *         return resolve(source, args, context, info);
    *       }
    *       throw new Error('You must be authorized');
    *     }
    *
    *     schemaComposer.Query.addFields({
    *       userById: UserTC.getResolver('findById', [authMiddleware]),
    *       userByIds: UserTC.getResolver('findByIds', [authMiddleware]),
    *     });
    *
    * @param name
    * @param middlewares type ResolverMiddleware = (resolve, source, args, context, info) => any;
    */
  def getResolver[TResolverSource, TArgs](name: String): Resolver[TResolverSource, TContext, TArgs, _] = js.native
  def getResolver[TResolverSource, TArgs](name: String, middlewares: js.Array[ResolverMiddleware[TResolverSource, TContext, TArgs]]): Resolver[TResolverSource, TContext, TArgs, _] = js.native
  /**
    * -----------------------------------------------
    * Resolver methods
    * -----------------------------------------------
    */
  def getResolvers(): Map[String, Resolver[_, TContext, _, _]] = js.native
  /**
    * -----------------------------------------------
    * Type methods
    * -----------------------------------------------
    */
  def getType(): GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getTypeName(): String = js.native
  def getTypeNonNull(): GraphQLNonNull[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getTypePlural(): GraphQLList[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def hasExtension(extensionName: String): Boolean = js.native
  def hasField(fieldName: String): Boolean = js.native
  def hasFieldArg(fieldName: String, argName: String): Boolean = js.native
  def hasFieldArgExtension(fieldName: String, argName: String, extensionName: String): Boolean = js.native
  def hasFieldExtension(fieldName: String, extensionName: String): Boolean = js.native
  def hasInputTypeComposer(): Boolean = js.native
  def hasInterface(iface: String): Boolean = js.native
  def hasInterface(iface: GraphQLInterfaceType): Boolean = js.native
  def hasInterface(iface: InterfaceTypeComposer[_, TContext]): Boolean = js.native
  def hasRecordIdFn(): Boolean = js.native
  def hasResolver(name: String): Boolean = js.native
  def isFieldNonNull(fieldName: String): Boolean = js.native
  def makeFieldNonNull(fieldNameOrArray: String): this.type = js.native
  def makeFieldNonNull(fieldNameOrArray: js.Array[String]): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: String): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: js.Array[String]): this.type = js.native
  def merge(`type`: GraphQLInterfaceType): this.type = js.native
  /**
    * Merge fields and interfaces from provided `GraphQLObjectType`, or `ObjectTypeComposer`.
    * Also you may provide `GraphQLInterfaceType` or `InterfaceTypeComposer` for adding fields.
    */
  def merge(`type`: GraphQLObjectType[_, _, StringDictionary[_]]): this.type = js.native
  def merge(`type`: InterfaceTypeComposer[_, _]): this.type = js.native
  def merge(`type`: ObjectTypeComposer[_, _]): this.type = js.native
  def removeExtension(extensionName: String): this.type = js.native
  def removeField(fieldNameOrArray: String): this.type = js.native
  def removeField(fieldNameOrArray: js.Array[String]): this.type = js.native
  def removeFieldArgExtension(fieldName: String, argName: String, extensionName: String): this.type = js.native
  def removeFieldExtension(fieldName: String, extensionName: String): this.type = js.native
  def removeInputTypeComposer(): this.type = js.native
  def removeInterface(interfaceObj: GraphQLInterfaceType): this.type = js.native
  def removeInterface(interfaceObj: InterfaceTypeComposer[_, TContext]): this.type = js.native
  def removeOtherFields(fieldNameOrArray: String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[String]): this.type = js.native
  def removeResolver(resolverName: String): this.type = js.native
  def reorderFields(names: js.Array[String]): this.type = js.native
  def setDescription(description: String): this.type = js.native
  def setExtension(extensionName: String, value: js.Any): this.type = js.native
  def setExtensions(extensions: Extensions): this.type = js.native
  def setField[TArgs](fieldName: String, fieldConfig: ComposeFieldConfig[TSource, TContext, TArgs]): this.type = js.native
  def setFieldArg(fieldName: String, argName: String, argConfig: ComposeArgumentConfig): this.type = js.native
  def setFieldArgExtension(fieldName: String, argName: String, extensionName: String, value: js.Any): this.type = js.native
  def setFieldArgExtensions(fieldName: String, argName: String, extensions: Extensions): this.type = js.native
  def setFieldArgs(fieldName: String, args: ComposeFieldConfigArgumentMap[_]): this.type = js.native
  def setFieldExtension(fieldName: String, extensionName: String, value: js.Any): this.type = js.native
  def setFieldExtensions(fieldName: String, extensions: Extensions): this.type = js.native
  def setFields(fields: ComposeFieldConfigMap[TSource, TContext]): this.type = js.native
  def setInputTypeComposer(itc: InputTypeComposer[TContext]): this.type = js.native
  def setInterfaces(interfaces: js.Array[ComposeInterfaceType | GraphQLInterfaceType]): this.type = js.native
  def setIsTypeOf(): this.type = js.native
  def setIsTypeOf(fn: Unit): this.type = js.native
  def setIsTypeOf(fn: GraphQLIsTypeOfFn[_, _]): this.type = js.native
  def setRecordIdFn(fn: GetRecordIdFn[TSource, TContext]): this.type = js.native
  def setResolver[TResolverSource, TArgs](name: String, resolver: Resolver[TResolverSource, TContext, TArgs, _]): this.type = js.native
  def setTypeName(name: String): this.type = js.native
  def wrapResolver[TResolverSource, TArgs](
    resolverName: String,
    cbResolver: ResolverWrapCb[TResolverSource, TSource, TContext, TArgs, ArgsMap]
  ): this.type = js.native
  def wrapResolverAs[TResolverSource, TArgs](
    resolverName: String,
    fromResolverName: String,
    cbResolver: ResolverWrapCb[TResolverSource, TSource, TContext, TArgs, ArgsMap]
  ): this.type = js.native
  def wrapResolverResolve[TResolverSource, TArgs](resolverName: String, cbNextRp: ResolverNextRpCb[TResolverSource, TContext, TArgs]): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/lib/ObjectTypeComposer", "ObjectTypeComposer")
@js.native
object ObjectTypeComposer extends js.Object {
  /**
    * Create `ObjectTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](typeDef: ObjectTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): ObjectTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `ObjectTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: ObjectTypeComposeDefinition[TSrc, TCtx]): ObjectTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: ObjectTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): ObjectTypeComposer[TSrc, TCtx] = js.native
}

