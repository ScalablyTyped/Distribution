package typings.graphqlToolsLoad.schemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsMerge.anon.TypeofSchemaDirectiveVisi
import typings.graphqlToolsMerge.mergeTypedefsMod.CompareFn
import typings.graphqlToolsSchema.typesMod.ILogger
import typings.graphqlToolsUtils.interfacesMod.IResolverValidationOptions
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.graphqlToolsUtils.loadersMod.Loader
import typings.graphqlToolsUtils.loadersMod.SingleFileOptions
import typings.graphqlToolsUtils.loadersMod.Source
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.BuildSchemaOptions & @graphql-tools/load.@graphql-tools/load/load-typedefs.LoadTypedefsOptions<{[key: string] : any}> & std.Partial<@graphql-tools/merge.@graphql-tools/merge.MergeSchemasConfig<@graphql-tools/utils.@graphql-tools/utils/Interfaces.IResolvers<any, any, std.Record<string, any>, any>>> & {  includeSources :boolean | undefined} */
@js.native
trait LoadSchemaOptions
  extends /* key */ StringDictionary[js.Any] {
  /**
    * If enabled, the parser will parse empty fields sets in the Schema
    * Definition Language. Otherwise, the parser will follow the current
    * specification.
    *
    * This option is provided to ease adoption of the final SDL specification
    * and will be removed in v16.
    */
  var allowLegacySDLEmptyFields: js.UndefOr[Boolean] = js.native
  /**
    * If enabled, the parser will parse implemented interfaces with no `&`
    * character between each interface. Otherwise, the parser will follow the
    * current specification.
    *
    * This option is provided to ease adoption of the final SDL specification
    * and will be removed in v16.
    */
  var allowLegacySDLImplementsInterfaces: js.UndefOr[Boolean] = js.native
  /**
    * When building a schema from a GraphQL service's introspection result, it
    * might be safe to assume the schema is valid. Set to true to assume the
    * produced schema is valid.
    *
    * Default: false
    */
  var assumeValid: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to assume the SDL is valid.
    *
    * Default: false
    */
  var assumeValidSDL: js.UndefOr[Boolean] = js.native
  var cache: js.UndefOr[StringDictionary[Source]] = js.native
  /**
    * Descriptions are defined as preceding string literals, however an older
    * experimental version of the SDL supported preceding comments as
    * descriptions. Set to true to enable this deprecated behavior.
    * This option is provided to ease adoption and will be removed in v16.
    *
    * Default: false
    */
  var commentDescriptions: js.UndefOr[Boolean] = js.native
  var convertExtensions: js.UndefOr[Boolean] = js.native
  var cwd: js.UndefOr[String] = js.native
  var exclusions: js.UndefOr[js.Array[String]] = js.native
  /**
    * EXPERIMENTAL:
    *
    * If enabled, the parser will understand and parse variable definitions
    * contained in a fragment definition. They'll be represented in the
    * `variableDefinitions` field of the FragmentDefinitionNode.
    *
    * The syntax is identical to normal, query-defined variables. For example:
    *
    *   fragment A($var: Boolean = false) on T  {
    *     ...
    *   }
    *
    * Note: this feature is experimental and may change or be removed in the
    * future.
    */
  var experimentalFragmentVariables: js.UndefOr[Boolean] = js.native
  var filterKinds: js.UndefOr[js.Array[String]] = js.native
  var forceSchemaDefinition: js.UndefOr[Boolean] = js.native
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Adds a list of Sources in to `extensions.sources`
    *
    * Disabled by default.
    */
  var includeSources: js.UndefOr[Boolean] = js.native
  var loaders: js.Array[Loader[String, SingleFileOptions]] = js.native
  var logger: js.UndefOr[ILogger] = js.native
  /**
    * By default, the parser creates AST nodes that know the location
    * in the source that they correspond to. This configuration flag
    * disables that behavior for performance or testing.
    */
  var noLocation: js.UndefOr[Boolean] = js.native
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.native
  var resolvers: js.UndefOr[
    (IResolvers[_, _, Record[String, _], _]) | (js.Array[IResolvers[_, _, Record[String, _], _]])
  ] = js.native
  var reverseDirectives: js.UndefOr[Boolean] = js.native
  var schemaDirectives: js.UndefOr[StringDictionary[TypeofSchemaDirectiveVisi]] = js.native
  var schemas: js.UndefOr[js.Array[GraphQLSchema]] = js.native
  var sort: js.UndefOr[Boolean] with (js.UndefOr[Boolean | CompareFn[String]]) = js.native
  var throwOnConflict: js.UndefOr[Boolean] = js.native
  var typeDefs: js.UndefOr[(js.Array[DocumentNode | String]) | DocumentNode | String] = js.native
  var useSchemaDefinition: js.UndefOr[Boolean] = js.native
}

object LoadSchemaOptions {
  @scala.inline
  def apply(
    loaders: js.Array[Loader[String, SingleFileOptions]],
    sort: js.UndefOr[Boolean] with (js.UndefOr[Boolean | CompareFn[String]])
  ): LoadSchemaOptions = {
    val __obj = js.Dynamic.literal(loaders = loaders.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadSchemaOptions]
  }
  @scala.inline
  implicit class LoadSchemaOptionsOps[Self <: LoadSchemaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoadersVarargs(value: (Loader[String, SingleFileOptions])*): Self = this.set("loaders", js.Array(value :_*))
    @scala.inline
    def setLoaders(value: js.Array[Loader[String, SingleFileOptions]]): Self = this.set("loaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setSort(value: js.UndefOr[Boolean] with (js.UndefOr[Boolean | CompareFn[String]])): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowLegacySDLEmptyFields(value: Boolean): Self = this.set("allowLegacySDLEmptyFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowLegacySDLEmptyFields: Self = this.set("allowLegacySDLEmptyFields", js.undefined)
    @scala.inline
    def setAllowLegacySDLImplementsInterfaces(value: Boolean): Self = this.set("allowLegacySDLImplementsInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowLegacySDLImplementsInterfaces: Self = this.set("allowLegacySDLImplementsInterfaces", js.undefined)
    @scala.inline
    def setAssumeValid(value: Boolean): Self = this.set("assumeValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumeValid: Self = this.set("assumeValid", js.undefined)
    @scala.inline
    def setAssumeValidSDL(value: Boolean): Self = this.set("assumeValidSDL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumeValidSDL: Self = this.set("assumeValidSDL", js.undefined)
    @scala.inline
    def setCache(value: StringDictionary[Source]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCommentDescriptions(value: Boolean): Self = this.set("commentDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentDescriptions: Self = this.set("commentDescriptions", js.undefined)
    @scala.inline
    def setConvertExtensions(value: Boolean): Self = this.set("convertExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvertExtensions: Self = this.set("convertExtensions", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setExclusionsVarargs(value: String*): Self = this.set("exclusions", js.Array(value :_*))
    @scala.inline
    def setExclusions(value: js.Array[String]): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusions: Self = this.set("exclusions", js.undefined)
    @scala.inline
    def setExperimentalFragmentVariables(value: Boolean): Self = this.set("experimentalFragmentVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentalFragmentVariables: Self = this.set("experimentalFragmentVariables", js.undefined)
    @scala.inline
    def setFilterKindsVarargs(value: String*): Self = this.set("filterKinds", js.Array(value :_*))
    @scala.inline
    def setFilterKinds(value: js.Array[String]): Self = this.set("filterKinds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterKinds: Self = this.set("filterKinds", js.undefined)
    @scala.inline
    def setForceSchemaDefinition(value: Boolean): Self = this.set("forceSchemaDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSchemaDefinition: Self = this.set("forceSchemaDefinition", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIncludeSources(value: Boolean): Self = this.set("includeSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSources: Self = this.set("includeSources", js.undefined)
    @scala.inline
    def setLogger(value: ILogger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setNoLocation(value: Boolean): Self = this.set("noLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoLocation: Self = this.set("noLocation", js.undefined)
    @scala.inline
    def setResolverValidationOptions(value: IResolverValidationOptions): Self = this.set("resolverValidationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolverValidationOptions: Self = this.set("resolverValidationOptions", js.undefined)
    @scala.inline
    def setResolversVarargs(value: (IResolvers[js.Any, js.Any, Record[String, js.Any], js.Any])*): Self = this.set("resolvers", js.Array(value :_*))
    @scala.inline
    def setResolvers(
      value: (IResolvers[_, _, Record[String, _], _]) | (js.Array[IResolvers[_, _, Record[String, _], _]])
    ): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
    @scala.inline
    def setReverseDirectives(value: Boolean): Self = this.set("reverseDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseDirectives: Self = this.set("reverseDirectives", js.undefined)
    @scala.inline
    def setSchemaDirectives(value: StringDictionary[TypeofSchemaDirectiveVisi]): Self = this.set("schemaDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaDirectives: Self = this.set("schemaDirectives", js.undefined)
    @scala.inline
    def setSchemasVarargs(value: GraphQLSchema*): Self = this.set("schemas", js.Array(value :_*))
    @scala.inline
    def setSchemas(value: js.Array[GraphQLSchema]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
    @scala.inline
    def setThrowOnConflict(value: Boolean): Self = this.set("throwOnConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnConflict: Self = this.set("throwOnConflict", js.undefined)
    @scala.inline
    def setTypeDefsVarargs(value: (DocumentNode | String)*): Self = this.set("typeDefs", js.Array(value :_*))
    @scala.inline
    def setTypeDefs(value: (js.Array[DocumentNode | String]) | DocumentNode | String): Self = this.set("typeDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeDefs: Self = this.set("typeDefs", js.undefined)
    @scala.inline
    def setUseSchemaDefinition(value: Boolean): Self = this.set("useSchemaDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSchemaDefinition: Self = this.set("useSchemaDefinition", js.undefined)
  }
  
}

