package typings.graphqlToolsSchema.typesMod

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

@js.native
trait IExecutableSchemaDefinition[TContext] extends js.Object {
  /**
    * Set to `false` to have resolvers throw an if they return undefined, which
    * can help make debugging easier
    */
  var allowUndefinedInResolve: js.UndefOr[Boolean] = js.native
  /**
    * Map of directive resolvers
    */
  var directiveResolvers: js.UndefOr[IDirectiveResolvers[_, TContext]] = js.native
  /**
    * GraphQL object types that implement interfaces will inherit any missing
    * resolvers from their interface types defined in the `resolvers` object
    */
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.native
  /**
    * Logger instance used to print errors to the server console that are
    * usually swallowed by GraphQL.
    */
  var logger: js.UndefOr[ILogger] = js.native
  /**
    * Additional options for parsing the type definitions if they are provided
    * as a string
    */
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.native
  /**
    * Additional options for removing unused types from the schema
    */
  var pruningOptions: js.UndefOr[PruneSchemaOptions] = js.native
  /**
    * Additional options for validating the provided resolvers
    */
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.native
  /**
    * Object describing the field resolvers for the provided type definitions
    */
  var resolvers: js.UndefOr[
    (IResolvers[_, TContext, Record[String, _], _]) | (js.Array[IResolvers[_, TContext, Record[String, _], _]])
  ] = js.native
  /**
    * A map of schema directives used with the legacy class-based implementation
    * of schema directives
    */
  var schemaDirectives: js.UndefOr[Record[String, SchemaDirectiveVisitorClass]] = js.native
  /**
    * An array of schema transformation functions
    */
  var schemaTransforms: js.UndefOr[js.Array[SchemaTransform]] = js.native
  /**
    * The type definitions used to create the schema
    */
  var typeDefs: ITypeDefinitions = js.native
}

object IExecutableSchemaDefinition {
  @scala.inline
  def apply[TContext](typeDefs: ITypeDefinitions): IExecutableSchemaDefinition[TContext] = {
    val __obj = js.Dynamic.literal(typeDefs = typeDefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecutableSchemaDefinition[TContext]]
  }
  @scala.inline
  implicit class IExecutableSchemaDefinitionOps[Self <: IExecutableSchemaDefinition[_], TContext] (val x: Self with IExecutableSchemaDefinition[TContext]) extends AnyVal {
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
  }
  
}

