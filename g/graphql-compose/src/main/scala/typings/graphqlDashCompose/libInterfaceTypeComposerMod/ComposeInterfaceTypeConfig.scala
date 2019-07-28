package typings.graphqlDashCompose.libInterfaceTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLTypeResolver
import typings.graphqlDashCompose.libObjectTypeComposerMod.ComposeFieldConfigMap
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Extensions
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeInterfaceTypeConfig[TSource, TContext] extends js.Object {
  var description: js.UndefOr[String | Null] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var fields: js.UndefOr[Thunk[ComposeFieldConfigMap[TSource, TContext]]] = js.undefined
  var name: String
  var resolveType: js.UndefOr[(GraphQLTypeResolver[TSource, TContext, StringDictionary[_]]) | Null] = js.undefined
}

object ComposeInterfaceTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    name: String,
    description: String = null,
    extensions: Extensions = null,
    fields: Thunk[ComposeFieldConfigMap[TSource, TContext]] = null,
    resolveType: GraphQLTypeResolver[TSource, TContext, StringDictionary[_]] = null
  ): ComposeInterfaceTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(resolveType)
    __obj.asInstanceOf[ComposeInterfaceTypeConfig[TSource, TContext]]
  }
}

