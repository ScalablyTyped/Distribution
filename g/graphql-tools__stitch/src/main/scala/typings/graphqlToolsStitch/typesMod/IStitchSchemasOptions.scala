package typings.graphqlToolsStitch.typesMod

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import typings.graphqlToolsSchema.typesMod.ILogger
import typings.graphqlToolsStitch.anon.Left
import typings.graphqlToolsUtils.interfacesMod.GraphQLParseOptions
import typings.graphqlToolsUtils.interfacesMod.IDirectiveResolvers
import typings.graphqlToolsUtils.interfacesMod.IResolverValidationOptions
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.graphqlToolsUtils.interfacesMod.ITypeDefinitions
import typings.graphqlToolsUtils.interfacesMod.ITypedef
import typings.graphqlToolsUtils.interfacesMod.SchemaTransform
import typings.graphqlToolsUtils.pruneMod.PruneSchemaOptions
import typings.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitorClass
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<@graphql-tools/schema.@graphql-tools/schema.IExecutableSchemaDefinition<TContext>, 'typeDefs'> */
@js.native
trait IStitchSchemasOptions[TContext] extends js.Object {
  var allowUndefinedInResolve: js.UndefOr[Boolean] = js.native
  var directiveResolvers: js.UndefOr[IDirectiveResolvers[_, TContext]] = js.native
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.native
  var logger: js.UndefOr[ILogger] = js.native
  var mergeDirectives: js.UndefOr[Boolean] = js.native
  var mergeTypes: js.UndefOr[Boolean | js.Array[String] | MergeTypeFilter] = js.native
  var onTypeConflict: js.UndefOr[OnTypeConflict] = js.native
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.native
  var pruningOptions: js.UndefOr[PruneSchemaOptions] = js.native
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.native
  var resolvers: js.UndefOr[
    (IResolvers[_, TContext, Record[String, _], _]) | (js.Array[IResolvers[_, TContext, Record[String, _], _]])
  ] = js.native
  var schemaDirectives: js.UndefOr[Record[String, SchemaDirectiveVisitorClass]] = js.native
  var schemaTransforms: js.UndefOr[js.Array[SchemaTransform]] = js.native
  var schemas: js.UndefOr[js.Array[SchemaLikeObject]] = js.native
  var subschemas: js.UndefOr[js.Array[GraphQLSchema | SubschemaConfig]] = js.native
  var typeDefs: js.UndefOr[ITypeDefinitions] = js.native
  var types: js.UndefOr[js.Array[GraphQLNamedType]] = js.native
}

object IStitchSchemasOptions {
  @scala.inline
  def apply[TContext](): IStitchSchemasOptions[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStitchSchemasOptions[TContext]]
  }
  @scala.inline
  implicit class IStitchSchemasOptionsOps[Self <: IStitchSchemasOptions[_], TContext] (val x: Self with IStitchSchemasOptions[TContext]) extends AnyVal {
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
    def setAllowUndefinedInResolve(value: Boolean): Self = this.set("allowUndefinedInResolve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUndefinedInResolve: Self = this.set("allowUndefinedInResolve", js.undefined)
    @scala.inline
    def setDirectiveResolvers(value: IDirectiveResolvers[_, TContext]): Self = this.set("directiveResolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectiveResolvers: Self = this.set("directiveResolvers", js.undefined)
    @scala.inline
    def setInheritResolversFromInterfaces(value: Boolean): Self = this.set("inheritResolversFromInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInheritResolversFromInterfaces: Self = this.set("inheritResolversFromInterfaces", js.undefined)
    @scala.inline
    def setLogger(value: ILogger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setMergeDirectives(value: Boolean): Self = this.set("mergeDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeDirectives: Self = this.set("mergeDirectives", js.undefined)
    @scala.inline
    def setMergeTypesFunction2(value: (/* mergeTypeCandidates */ js.Array[MergeTypeCandidate], /* typeName */ String) => Boolean): Self = this.set("mergeTypes", js.Any.fromFunction2(value))
    @scala.inline
    def setMergeTypesVarargs(value: String*): Self = this.set("mergeTypes", js.Array(value :_*))
    @scala.inline
    def setMergeTypes(value: Boolean | js.Array[String] | MergeTypeFilter): Self = this.set("mergeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeTypes: Self = this.set("mergeTypes", js.undefined)
    @scala.inline
    def setOnTypeConflict(
      value: (/* left */ GraphQLNamedType, /* right */ GraphQLNamedType, /* info */ js.UndefOr[Left]) => GraphQLNamedType
    ): Self = this.set("onTypeConflict", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnTypeConflict: Self = this.set("onTypeConflict", js.undefined)
    @scala.inline
    def setParseOptions(value: GraphQLParseOptions): Self = this.set("parseOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseOptions: Self = this.set("parseOptions", js.undefined)
    @scala.inline
    def setPruningOptions(value: PruneSchemaOptions): Self = this.set("pruningOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePruningOptions: Self = this.set("pruningOptions", js.undefined)
    @scala.inline
    def setResolverValidationOptions(value: IResolverValidationOptions): Self = this.set("resolverValidationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolverValidationOptions: Self = this.set("resolverValidationOptions", js.undefined)
    @scala.inline
    def setResolversVarargs(value: (IResolvers[js.Any, TContext, Record[String, js.Any], js.Any])*): Self = this.set("resolvers", js.Array(value :_*))
    @scala.inline
    def setResolvers(
      value: (IResolvers[_, TContext, Record[String, _], _]) | (js.Array[IResolvers[_, TContext, Record[String, _], _]])
    ): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
    @scala.inline
    def setSchemaDirectives(value: Record[String, SchemaDirectiveVisitorClass]): Self = this.set("schemaDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaDirectives: Self = this.set("schemaDirectives", js.undefined)
    @scala.inline
    def setSchemaTransformsVarargs(value: SchemaTransform*): Self = this.set("schemaTransforms", js.Array(value :_*))
    @scala.inline
    def setSchemaTransforms(value: js.Array[SchemaTransform]): Self = this.set("schemaTransforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaTransforms: Self = this.set("schemaTransforms", js.undefined)
    @scala.inline
    def setSchemasVarargs(value: SchemaLikeObject*): Self = this.set("schemas", js.Array(value :_*))
    @scala.inline
    def setSchemas(value: js.Array[SchemaLikeObject]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
    @scala.inline
    def setSubschemasVarargs(value: (GraphQLSchema | SubschemaConfig)*): Self = this.set("subschemas", js.Array(value :_*))
    @scala.inline
    def setSubschemas(value: js.Array[GraphQLSchema | SubschemaConfig]): Self = this.set("subschemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubschemas: Self = this.set("subschemas", js.undefined)
    @scala.inline
    def setTypeDefsVarargs(value: ITypedef*): Self = this.set("typeDefs", js.Array(value :_*))
    @scala.inline
    def setTypeDefsFunction0(
      value: () => js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @graphql-tools/utils.@graphql-tools/utils/Interfaces.ITypedef */ js.Object
        ]
    ): Self = this.set("typeDefs", js.Any.fromFunction0(value))
    @scala.inline
    def setTypeDefs(value: ITypeDefinitions): Self = this.set("typeDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeDefs: Self = this.set("typeDefs", js.undefined)
    @scala.inline
    def setTypesVarargs(value: GraphQLNamedType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[GraphQLNamedType]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

