package typings
package graphqlDashToolsLib.distGenerateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/generate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val attachConnectorsToContext: js.Function = js.native
  def addResolveFunctionsToSchema(options: graphqlDashToolsLib.distInterfacesMod.IAddResolveFunctionsToSchemaOptions): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: graphqlDashToolsLib.distInterfacesMod.IAddResolveFunctionsToSchemaOptions,
    legacyInputResolvers: graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _]
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: graphqlDashToolsLib.distInterfacesMod.IAddResolveFunctionsToSchemaOptions,
    legacyInputResolvers: graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _],
    legacyInputValidationOptions: graphqlDashToolsLib.distInterfacesMod.IResolverValidationOptions
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def addResolveFunctionsToSchema(options: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: graphqlLib.graphqlMod.GraphQLSchema,
    legacyInputResolvers: graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _]
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: graphqlLib.graphqlMod.GraphQLSchema,
    legacyInputResolvers: graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _],
    legacyInputValidationOptions: graphqlDashToolsLib.distInterfacesMod.IResolverValidationOptions
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def addSchemaLevelResolveFunction(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    fn: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): scala.Unit = js.native
  def assertResolveFunctionsPresent(schema: graphqlLib.graphqlMod.GraphQLSchema): scala.Unit = js.native
  def assertResolveFunctionsPresent(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    resolverValidationOptions: graphqlDashToolsLib.distInterfacesMod.IResolverValidationOptions
  ): scala.Unit = js.native
  def attachDirectiveResolvers(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    directiveResolvers: graphqlDashToolsLib.distInterfacesMod.IDirectiveResolvers[_, _]
  ): scala.Unit = js.native
  def buildSchemaFromTypeDefinitions(typeDefinitions: graphqlDashToolsLib.distInterfacesMod.ITypeDefinitions): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def buildSchemaFromTypeDefinitions(
    typeDefinitions: graphqlDashToolsLib.distInterfacesMod.ITypeDefinitions,
    parseOptions: graphqlDashToolsLib.distInterfacesMod.GraphQLParseOptions
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def chainResolvers(
    resolvers: js.Array[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): js.Function4[
    /* root */ js.Any, 
    /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* ctx */ js.Any, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    _
  ] = js.native
  def checkForResolveTypeResolver(schema: graphqlLib.graphqlMod.GraphQLSchema): scala.Unit = js.native
  def checkForResolveTypeResolver(schema: graphqlLib.graphqlMod.GraphQLSchema, requireResolversForResolveType: scala.Boolean): scala.Unit = js.native
  def concatenateTypeDefs(typeDefinitionsAry: js.Array[graphqlDashToolsLib.distInterfacesMod.ITypedef]): java.lang.String = js.native
  def concatenateTypeDefs(
    typeDefinitionsAry: js.Array[graphqlDashToolsLib.distInterfacesMod.ITypedef],
    calledFunctionRefs: js.Any
  ): java.lang.String = js.native
  def decorateWithLogger(
    fn: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    logger: graphqlDashToolsLib.distInterfacesMod.ILogger,
    hint: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def decorateWithLogger(
    fn: js.UndefOr[scala.Nothing],
    logger: graphqlDashToolsLib.distInterfacesMod.ILogger,
    hint: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def extendResolversFromInterfaces(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    resolvers: graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _]
  ): graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _] = js.native
  def extractExtensionDefinitions(ast: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode with graphqlDashToolsLib.Anon_Definitions = js.native
  def forEachField(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    fn: graphqlDashToolsLib.distInterfacesMod.IFieldIteratorFn
  ): scala.Unit = js.native
}

