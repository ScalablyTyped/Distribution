package typings.graphqlTools.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.IResolversParameter
import typings.graphqlTools.mergeSchemasMod.OnTypeConflict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InheritResolversFromInterfaces extends js.Object {
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined
  var mergeDirectives: js.UndefOr[Boolean] = js.undefined
  var onTypeConflict: js.UndefOr[OnTypeConflict] = js.undefined
  var resolvers: js.UndefOr[IResolversParameter] = js.undefined
  var schemaDirectives: js.UndefOr[StringDictionary[TypeofSchemaDirectiveVisi]] = js.undefined
  var schemas: js.Array[String | GraphQLSchema | DocumentNode | js.Array[GraphQLNamedType]]
}

object InheritResolversFromInterfaces {
  @scala.inline
  def apply(
    schemas: js.Array[String | GraphQLSchema | DocumentNode | js.Array[GraphQLNamedType]],
    inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined,
    mergeDirectives: js.UndefOr[Boolean] = js.undefined,
    onTypeConflict: (/* left */ GraphQLNamedType, /* right */ GraphQLNamedType, /* info */ js.UndefOr[Left]) => GraphQLNamedType = null,
    resolvers: IResolversParameter = null,
    schemaDirectives: StringDictionary[TypeofSchemaDirectiveVisi] = null
  ): InheritResolversFromInterfaces = {
    val __obj = js.Dynamic.literal(schemas = schemas.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritResolversFromInterfaces)) __obj.updateDynamic("inheritResolversFromInterfaces")(inheritResolversFromInterfaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeDirectives)) __obj.updateDynamic("mergeDirectives")(mergeDirectives.get.asInstanceOf[js.Any])
    if (onTypeConflict != null) __obj.updateDynamic("onTypeConflict")(js.Any.fromFunction3(onTypeConflict))
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (schemaDirectives != null) __obj.updateDynamic("schemaDirectives")(schemaDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[InheritResolversFromInterfaces]
  }
}

