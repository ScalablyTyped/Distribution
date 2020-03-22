package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.GraphQLParseOptions
import typings.graphqlTools.interfacesMod.IAddResolveFunctionsToSchemaOptions
import typings.graphqlTools.interfacesMod.IDirectiveResolvers
import typings.graphqlTools.interfacesMod.IFieldIteratorFn
import typings.graphqlTools.interfacesMod.ILogger
import typings.graphqlTools.interfacesMod.IResolverValidationOptions
import typings.graphqlTools.interfacesMod.IResolvers
import typings.graphqlTools.interfacesMod.ITypeDefinitions
import typings.graphqlTools.interfacesMod.ITypedef
import typings.graphqlTools.schemaErrorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/generate", JSImport.Namespace)
@js.native
object generateMod extends js.Object {
  @js.native
  class SchemaError protected () extends default {
    def this(message: String) = this()
  }
  
  val attachConnectorsToContext: js.Function = js.native
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
  def extractExtensionDefinitions(ast: DocumentNode): DocumentNodedefinitionsAr = js.native
  def forEachField(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
}

