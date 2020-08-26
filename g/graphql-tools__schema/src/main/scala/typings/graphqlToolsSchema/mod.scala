package typings.graphqlToolsSchema

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsSchema.anon.Definitions
import typings.graphqlToolsSchema.typesMod.IExecutableSchemaDefinition
import typings.graphqlToolsSchema.typesMod.ILogger
import typings.graphqlToolsUtils.interfacesMod.GraphQLParseOptions
import typings.graphqlToolsUtils.interfacesMod.IAddResolversToSchemaOptions
import typings.graphqlToolsUtils.interfacesMod.IDirectiveResolvers
import typings.graphqlToolsUtils.interfacesMod.IResolverValidationOptions
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.graphqlToolsUtils.interfacesMod.ITypeDefinitions
import typings.graphqlToolsUtils.interfacesMod.ITypedef
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/schema", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def addCatchUndefinedToSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def addErrorLoggingToSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def addErrorLoggingToSchema(schema: GraphQLSchema, logger: ILogger): GraphQLSchema = js.native
  def addResolversToSchema(schemaOrOptions: GraphQLSchema): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: GraphQLSchema,
    legacyInputResolvers: js.UndefOr[scala.Nothing],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addResolversToSchema(schemaOrOptions: GraphQLSchema, legacyInputResolvers: IResolvers[_, _, Record[String, _], _]): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: GraphQLSchema,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addResolversToSchema(schemaOrOptions: IAddResolversToSchemaOptions): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: js.UndefOr[scala.Nothing],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _]
  ): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addSchemaLevelResolver(schema: GraphQLSchema, fn: GraphQLFieldResolver[_, _, StringDictionary[_]]): GraphQLSchema = js.native
  def assertResolversPresent(schema: GraphQLSchema): Unit = js.native
  def assertResolversPresent(schema: GraphQLSchema, resolverValidationOptions: IResolverValidationOptions): Unit = js.native
  def attachDirectiveResolvers(schema: GraphQLSchema, directiveResolvers: IDirectiveResolvers[_, _]): GraphQLSchema = js.native
  def buildDocumentFromTypeDefinitions(typeDefinitions: ITypeDefinitions): DocumentNode = js.native
  def buildDocumentFromTypeDefinitions(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): DocumentNode = js.native
  def buildSchemaFromTypeDefinitions(typeDefinitions: ITypeDefinitions): GraphQLSchema = js.native
  def buildSchemaFromTypeDefinitions(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): GraphQLSchema = js.native
  def chainResolvers(resolvers: js.Array[GraphQLFieldResolver[_, _, StringDictionary[_]]]): js.Function4[
    /* root */ js.Any, 
    /* args */ StringDictionary[js.Any], 
    /* ctx */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    _
  ] = js.native
  def checkForResolveTypeResolver(schema: GraphQLSchema): Unit = js.native
  def checkForResolveTypeResolver(schema: GraphQLSchema, requireResolversForResolveType: Boolean): Unit = js.native
  def concatenateTypeDefs(typeDefinitionsAry: js.Array[ITypedef]): String = js.native
  def concatenateTypeDefs(typeDefinitionsAry: js.Array[ITypedef], calledFunctionRefs: js.Any): String = js.native
  def decorateWithLogger(fn: GraphQLFieldResolver[_, _, StringDictionary[_]], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def extendResolversFromInterfaces(schema: GraphQLSchema, resolvers: IResolvers[_, _, Record[String, _], _]): IResolvers[_, _, Record[String, _], _] = js.native
  def extractExtensionDefinitions(ast: DocumentNode): Definitions = js.native
  def filterExtensionDefinitions(ast: DocumentNode): Definitions = js.native
  def makeExecutableSchema[TContext](
    hasTypeDefsResolversLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesSchemaTransformsParseOptionsInheritResolversFromInterfacesPruningOptions: IExecutableSchemaDefinition[TContext]
  ): GraphQLSchema = js.native
}

