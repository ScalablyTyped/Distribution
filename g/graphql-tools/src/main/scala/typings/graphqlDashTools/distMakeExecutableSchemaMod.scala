package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashTools.distInterfacesMod.GraphQLParseOptions
import typings.graphqlDashTools.distInterfacesMod.IAddResolveFunctionsToSchemaOptions
import typings.graphqlDashTools.distInterfacesMod.IDirectiveResolvers
import typings.graphqlDashTools.distInterfacesMod.IExecutableSchemaDefinition
import typings.graphqlDashTools.distInterfacesMod.IFieldIteratorFn
import typings.graphqlDashTools.distInterfacesMod.ILogger
import typings.graphqlDashTools.distInterfacesMod.IResolverValidationOptions
import typings.graphqlDashTools.distInterfacesMod.IResolvers
import typings.graphqlDashTools.distInterfacesMod.ITypeDefinitions
import typings.graphqlDashTools.distInterfacesMod.ITypedef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/makeExecutableSchema", JSImport.Namespace)
@js.native
object distMakeExecutableSchemaMod extends js.Object {
  @js.native
  class SchemaError protected ()
    extends typings.graphqlDashTools.distGenerateMod.SchemaError {
    def this(message: String) = this()
  }
  
  val attachConnectorsToContext: js.Function = js.native
  def addCatchUndefinedToSchema(schema: GraphQLSchema): Unit = js.native
  def addErrorLoggingToSchema(schema: GraphQLSchema, logger: ILogger): Unit = js.native
  def addResolveFunctionsToSchema(options: GraphQLSchema): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(options: GraphQLSchema, legacyInputResolvers: IResolvers[_, _]): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: GraphQLSchema,
    legacyInputResolvers: IResolvers[_, _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(options: IAddResolveFunctionsToSchemaOptions): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(options: IAddResolveFunctionsToSchemaOptions, legacyInputResolvers: IResolvers[_, _]): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: IAddResolveFunctionsToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addSchemaLevelResolveFunction(schema: GraphQLSchema, fn: GraphQLFieldResolver[_, _, StringDictionary[_]]): Unit = js.native
  def assertResolveFunctionsPresent(schema: GraphQLSchema): Unit = js.native
  def assertResolveFunctionsPresent(schema: GraphQLSchema, resolverValidationOptions: IResolverValidationOptions): Unit = js.native
  def attachDirectiveResolvers(schema: GraphQLSchema, directiveResolvers: IDirectiveResolvers[_, _]): Unit = js.native
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
  def decorateWithLogger(fn: js.UndefOr[scala.Nothing], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def decorateWithLogger(fn: GraphQLFieldResolver[_, _, StringDictionary[_]], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def extendResolversFromInterfaces(schema: GraphQLSchema, resolvers: IResolvers[_, _]): IResolvers[_, _] = js.native
  def extractExtensionDefinitions(ast: DocumentNode): DocumentNode with Anon_Definitions = js.native
  def forEachField(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
  def makeExecutableSchema[TContext](
    hasTypeDefsResolversConnectorsLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesParseOptionsInheritResolversFromInterfaces: IExecutableSchemaDefinition[TContext]
  ): GraphQLSchema = js.native
}

