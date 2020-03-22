package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.apolloLink.mod.ApolloLink
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.filterRootFieldsMod.RootFilter
import typings.graphqlTools.graphqlToolsStrings.Mutation
import typings.graphqlTools.graphqlToolsStrings.Query
import typings.graphqlTools.graphqlToolsStrings.Subscription
import typings.graphqlTools.interfacesMod.GraphQLParseOptions
import typings.graphqlTools.interfacesMod.IAddResolveFunctionsToSchemaOptions
import typings.graphqlTools.interfacesMod.IDelegateToSchemaOptions
import typings.graphqlTools.interfacesMod.IDirectiveResolvers
import typings.graphqlTools.interfacesMod.IExecutableSchemaDefinition
import typings.graphqlTools.interfacesMod.IFieldIteratorFn
import typings.graphqlTools.interfacesMod.ILogger
import typings.graphqlTools.interfacesMod.IMockOptions
import typings.graphqlTools.interfacesMod.IMockServer
import typings.graphqlTools.interfacesMod.IMocks
import typings.graphqlTools.interfacesMod.IResolverValidationOptions
import typings.graphqlTools.interfacesMod.IResolvers
import typings.graphqlTools.interfacesMod.ITypeDefinitions
import typings.graphqlTools.interfacesMod.ITypedef
import typings.graphqlTools.interfacesMod.Transform
import typings.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher
import typings.graphqlTools.renameTypesMod.RenameOptions
import typings.graphqlTools.transformRootFieldsMod.RootTransformer
import typings.graphqlTools.wrapQueryMod.QueryWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AddArgumentsAsVariables protected ()
    extends typings.graphqlTools.transformsMod.AddArgumentsAsVariables {
    def this(schema: GraphQLSchema, args: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class AddTypenameToAbstract protected ()
    extends typings.graphqlTools.transformsMod.AddTypenameToAbstract {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class CheckResultAndHandleErrors protected ()
    extends typings.graphqlTools.transformsMod.CheckResultAndHandleErrors {
    def this(info: GraphQLResolveInfo) = this()
    def this(info: GraphQLResolveInfo, fieldName: String) = this()
  }
  
  @js.native
  class ExpandAbstractTypes protected ()
    extends typings.graphqlTools.transformsMod.ExpandAbstractTypes {
    def this(transformedSchema: GraphQLSchema, targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class ExtractField protected ()
    extends typings.graphqlTools.transformsMod.ExtractField {
    def this(hasFromTo: AnonFrom) = this()
  }
  
  @js.native
  class FilterRootFields protected ()
    extends typings.graphqlTools.transformsMod.FilterRootFields {
    def this(filter: RootFilter) = this()
  }
  
  @js.native
  class FilterToSchema protected ()
    extends typings.graphqlTools.transformsMod.FilterToSchema {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class FilterTypes protected ()
    extends typings.graphqlTools.transformsMod.FilterTypes {
    def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
  }
  
  @js.native
  class MockList protected ()
    extends typings.graphqlTools.mockMod.MockList {
    def this(len: js.Array[Double]) = this()
    def this(len: Double) = this()
    def this(len: js.Array[Double], wrappedFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
    def this(len: Double, wrappedFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
  }
  
  @js.native
  class RenameRootFields protected ()
    extends typings.graphqlTools.transformsMod.RenameRootFields {
    def this(renamer: js.Function3[
            /* operation */ Query | Mutation | Subscription, 
            /* name */ String, 
            /* field */ GraphQLField[_, _, StringDictionary[_]], 
            String
          ]) = this()
  }
  
  @js.native
  class RenameTypes protected ()
    extends typings.graphqlTools.transformsMod.RenameTypes {
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
  }
  
  @js.native
  class ReplaceFieldWithFragment protected ()
    extends typings.graphqlTools.transformsMod.ReplaceFieldWithFragment {
    def this(targetSchema: GraphQLSchema, fragments: js.Array[AnonField]) = this()
  }
  
  @js.native
  class SchemaDirectiveVisitor protected ()
    extends typings.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor {
    protected def this(config: AnonArgs) = this()
  }
  
  @js.native
  class SchemaError protected ()
    extends typings.graphqlTools.makeExecutableSchemaMod.SchemaError {
    def this(message: String) = this()
  }
  
  @js.native
  class TransformRootFields protected ()
    extends typings.graphqlTools.transformsMod.TransformRootFields {
    def this(transform: RootTransformer) = this()
  }
  
  @js.native
  class WrapQuery protected ()
    extends typings.graphqlTools.transformsMod.WrapQuery {
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
  def extractExtensionDefinitions(ast: DocumentNode): DocumentNodedefinitionsAr = js.native
  def forEachField(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
  def introspectSchema(fetcher: ApolloLink): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: ApolloLink, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: Fetcher): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: Fetcher, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def makeExecutableSchema[TContext](
    hasTypeDefsResolversConnectorsLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesParseOptionsInheritResolversFromInterfaces: IExecutableSchemaDefinition[TContext]
  ): GraphQLSchema = js.native
  def makeRemoteExecutableSchema(hasSchemaLinkFetcherCreateResolverBuildSchemaOptionsPrintSchemaOptions: AnonBuildSchemaOptions): GraphQLSchema = js.native
  def mergeSchemas(
    hasSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfacesMergeDirectives: AnonInheritResolversFromInterfaces
  ): GraphQLSchema = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def transformSchema(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchematransformsAr = js.native
  /* static members */
  @js.native
  object SchemaDirectiveVisitor extends js.Object {
    /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi]): StringDictionary[GraphQLDirective] = js.native
    def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
    def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi]): StringDictionary[js.Array[typings.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor]] = js.native
    def visitSchemaDirectives(
      schema: GraphQLSchema,
      directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi],
      context: StringDictionary[js.Any]
    ): StringDictionary[js.Array[typings.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor]] = js.native
  }
  
}

