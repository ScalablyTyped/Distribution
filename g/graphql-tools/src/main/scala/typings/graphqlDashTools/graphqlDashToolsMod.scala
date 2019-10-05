package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.apolloDashLinkMod.ApolloLink
import typings.graphql.graphqlMod.GraphQLDirective
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashTools.distInterfacesMod.GraphQLParseOptions
import typings.graphqlDashTools.distInterfacesMod.IAddResolveFunctionsToSchemaOptions
import typings.graphqlDashTools.distInterfacesMod.IDelegateToSchemaOptions
import typings.graphqlDashTools.distInterfacesMod.IDirectiveResolvers
import typings.graphqlDashTools.distInterfacesMod.IExecutableSchemaDefinition
import typings.graphqlDashTools.distInterfacesMod.IFieldIteratorFn
import typings.graphqlDashTools.distInterfacesMod.ILogger
import typings.graphqlDashTools.distInterfacesMod.IMockOptions
import typings.graphqlDashTools.distInterfacesMod.IMockServer
import typings.graphqlDashTools.distInterfacesMod.IMocks
import typings.graphqlDashTools.distInterfacesMod.IResolverValidationOptions
import typings.graphqlDashTools.distInterfacesMod.IResolvers
import typings.graphqlDashTools.distInterfacesMod.ITypeDefinitions
import typings.graphqlDashTools.distInterfacesMod.ITypedef
import typings.graphqlDashTools.distInterfacesMod.Transform
import typings.graphqlDashTools.distStitchingMakeRemoteExecutableSchemaMod.Fetcher
import typings.graphqlDashTools.distTransformsFilterRootFieldsMod.RootFilter
import typings.graphqlDashTools.distTransformsRenameTypesMod.RenameOptions
import typings.graphqlDashTools.distTransformsTransformRootFieldsMod.RootTransformer
import typings.graphqlDashTools.distTransformsWrapQueryMod.QueryWrapper
import typings.graphqlDashTools.graphqlDashToolsStrings.Mutation
import typings.graphqlDashTools.graphqlDashToolsStrings.Query
import typings.graphqlDashTools.graphqlDashToolsStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", JSImport.Namespace)
@js.native
object graphqlDashToolsMod extends js.Object {
  @js.native
  class AddArgumentsAsVariables protected ()
    extends typings.graphqlDashTools.distTransformsMod.AddArgumentsAsVariables {
    def this(schema: GraphQLSchema, args: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class AddTypenameToAbstract protected ()
    extends typings.graphqlDashTools.distTransformsMod.AddTypenameToAbstract {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class CheckResultAndHandleErrors protected ()
    extends typings.graphqlDashTools.distTransformsMod.CheckResultAndHandleErrors {
    def this(info: GraphQLResolveInfo) = this()
    def this(info: GraphQLResolveInfo, fieldName: String) = this()
  }
  
  @js.native
  class ExpandAbstractTypes protected ()
    extends typings.graphqlDashTools.distTransformsMod.ExpandAbstractTypes {
    def this(transformedSchema: GraphQLSchema, targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class ExtractField protected ()
    extends typings.graphqlDashTools.distTransformsMod.ExtractField {
    def this(hasFromTo: Anon_From) = this()
  }
  
  @js.native
  class FilterRootFields protected ()
    extends typings.graphqlDashTools.distTransformsMod.FilterRootFields {
    def this(filter: RootFilter) = this()
  }
  
  @js.native
  class FilterToSchema protected ()
    extends typings.graphqlDashTools.distTransformsMod.FilterToSchema {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class FilterTypes protected ()
    extends typings.graphqlDashTools.distTransformsMod.FilterTypes {
    def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
  }
  
  @js.native
  class MockList protected ()
    extends typings.graphqlDashTools.distMockMod.MockList {
    def this(len: js.Array[Double]) = this()
    def this(len: Double) = this()
    def this(len: js.Array[Double], wrappedFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
    def this(len: Double, wrappedFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
  }
  
  @js.native
  class RenameRootFields protected ()
    extends typings.graphqlDashTools.distTransformsMod.RenameRootFields {
    def this(renamer: js.Function3[
            /* operation */ Query | Mutation | Subscription, 
            /* name */ String, 
            /* field */ GraphQLField[_, _, StringDictionary[_]], 
            String
          ]) = this()
  }
  
  @js.native
  class RenameTypes protected ()
    extends typings.graphqlDashTools.distTransformsMod.RenameTypes {
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
  }
  
  @js.native
  class ReplaceFieldWithFragment protected ()
    extends typings.graphqlDashTools.distTransformsMod.ReplaceFieldWithFragment {
    def this(targetSchema: GraphQLSchema, fragments: js.Array[Anon_Field]) = this()
  }
  
  @js.native
  class SchemaDirectiveVisitor protected ()
    extends typings.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor {
    protected def this(config: Anon_Args) = this()
  }
  
  @js.native
  class SchemaError protected ()
    extends typings.graphqlDashTools.distMakeExecutableSchemaMod.SchemaError {
    def this(message: String) = this()
  }
  
  @js.native
  class TransformRootFields protected ()
    extends typings.graphqlDashTools.distTransformsMod.TransformRootFields {
    def this(transform: RootTransformer) = this()
  }
  
  @js.native
  class WrapQuery protected ()
    extends typings.graphqlDashTools.distTransformsMod.WrapQuery {
    def this(path: js.Array[String], wrapper: QueryWrapper, extractor: js.Function1[/* result */ js.Any, _]) = this()
  }
  
  val attachConnectorsToContext: js.Function = js.native
  val defaultMergedResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  def addCatchUndefinedToSchema(schema: GraphQLSchema): Unit = js.native
  def addErrorLoggingToSchema(schema: GraphQLSchema, logger: ILogger): Unit = js.native
  def addMockFunctionsToSchema(hasSchemaMocksPreserveResolvers: IMockOptions): Unit = js.native
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
  def defaultCreateRemoteResolver(fetcher: Fetcher): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def delegateToSchema(options: GraphQLSchema, args: js.Any*): js.Promise[_] = js.native
  def delegateToSchema(options: IDelegateToSchemaOptions[StringDictionary[_]], args: js.Any*): js.Promise[_] = js.native
  def extendResolversFromInterfaces(schema: GraphQLSchema, resolvers: IResolvers[_, _]): IResolvers[_, _] = js.native
  def extractExtensionDefinitions(ast: DocumentNode): DocumentNode with Anon_Definitions = js.native
  def forEachField(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
  def introspectSchema(fetcher: ApolloLink): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: ApolloLink, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: Fetcher): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: Fetcher, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def makeExecutableSchema[TContext](
    hasTypeDefsResolversConnectorsLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesParseOptionsInheritResolversFromInterfaces: IExecutableSchemaDefinition[TContext]
  ): GraphQLSchema = js.native
  def makeRemoteExecutableSchema(hasSchemaLinkFetcherCreateResolverBuildSchemaOptionsPrintSchemaOptions: Anon_ArgName): GraphQLSchema = js.native
  def mergeSchemas(
    hasSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfacesMergeDirectives: Anon_InheritResolversFromInterfaces
  ): GraphQLSchema = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def transformSchema(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchema with Anon_Transforms = js.native
  /* static members */
  @js.native
  object SchemaDirectiveVisitor extends js.Object {
    /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor]): StringDictionary[GraphQLDirective] = js.native
    def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
    def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor]): StringDictionary[js.Array[typings.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor]] = js.native
    def visitSchemaDirectives(
      schema: GraphQLSchema,
      directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor],
      context: StringDictionary[js.Any]
    ): StringDictionary[js.Array[typings.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor]] = js.native
  }
  
}

