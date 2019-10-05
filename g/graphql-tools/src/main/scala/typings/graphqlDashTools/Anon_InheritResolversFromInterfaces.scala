package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphqlDashTools.distInterfacesMod.IResolversParameter
import typings.graphqlDashTools.distStitchingMergeSchemasMod.OnTypeConflict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InheritResolversFromInterfaces extends js.Object {
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined
  var mergeDirectives: js.UndefOr[Boolean] = js.undefined
  var onTypeConflict: js.UndefOr[OnTypeConflict] = js.undefined
  var resolvers: js.UndefOr[IResolversParameter] = js.undefined
  var schemaDirectives: js.UndefOr[StringDictionary[TypeofClassSchemaDirectiveVisitor]] = js.undefined
  var schemas: js.Array[String | GraphQLSchema | DocumentNode | js.Array[GraphQLNamedType]]
}

object Anon_InheritResolversFromInterfaces {
  @scala.inline
  def apply(
    schemas: js.Array[String | GraphQLSchema | DocumentNode | js.Array[GraphQLNamedType]],
    inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined,
    mergeDirectives: js.UndefOr[Boolean] = js.undefined,
    onTypeConflict: (/* left */ GraphQLNamedType, /* right */ GraphQLNamedType, /* info */ js.UndefOr[Anon_Left]) => GraphQLNamedType = null,
    resolvers: IResolversParameter = null,
    schemaDirectives: StringDictionary[TypeofClassSchemaDirectiveVisitor] = null
  ): Anon_InheritResolversFromInterfaces = {
    val __obj = js.Dynamic.literal(schemas = schemas)
    if (!js.isUndefined(inheritResolversFromInterfaces)) __obj.updateDynamic("inheritResolversFromInterfaces")(inheritResolversFromInterfaces)
    if (!js.isUndefined(mergeDirectives)) __obj.updateDynamic("mergeDirectives")(mergeDirectives)
    if (onTypeConflict != null) __obj.updateDynamic("onTypeConflict")(js.Any.fromFunction3(onTypeConflict))
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (schemaDirectives != null) __obj.updateDynamic("schemaDirectives")(schemaDirectives)
    __obj.asInstanceOf[Anon_InheritResolversFromInterfaces]
  }
}

