package typings.graphqlToolsUtils.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphql.definitionMod.GraphQLType
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.graphqlToolsUtilsStrings.Query
import typings.graphqlToolsUtils.graphqlToolsUtilsStrings.Subscription
import typings.graphqlToolsUtils.interfacesMod.RootFieldFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldFilter extends js.Object {
  var fieldFilter: js.UndefOr[js.Function2[/* typeName */ String, /* fieldName */ String, Boolean]] = js.undefined
  var rootFieldFilter: js.UndefOr[RootFieldFilter] = js.undefined
  var schema: GraphQLSchema
  var typeFilter: js.UndefOr[js.Function2[/* typeName */ String, /* type */ GraphQLType, Boolean]] = js.undefined
}

object FieldFilter {
  @scala.inline
  def apply(
    schema: GraphQLSchema,
    fieldFilter: (/* typeName */ String, /* fieldName */ String) => Boolean = null,
    rootFieldFilter: (/* operation */ js.UndefOr[
      Query | typings.graphqlToolsUtils.graphqlToolsUtilsStrings.Mutation | Subscription
    ], /* rootFieldName */ js.UndefOr[String], /* fieldConfig */ js.UndefOr[GraphQLFieldConfig[js.Any, js.Any, StringDictionary[js.Any]]]) => Boolean = null,
    typeFilter: (/* typeName */ String, /* type */ GraphQLType) => Boolean = null
  ): FieldFilter = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (fieldFilter != null) __obj.updateDynamic("fieldFilter")(js.Any.fromFunction2(fieldFilter))
    if (rootFieldFilter != null) __obj.updateDynamic("rootFieldFilter")(js.Any.fromFunction3(rootFieldFilter))
    if (typeFilter != null) __obj.updateDynamic("typeFilter")(js.Any.fromFunction2(typeFilter))
    __obj.asInstanceOf[FieldFilter]
  }
}

