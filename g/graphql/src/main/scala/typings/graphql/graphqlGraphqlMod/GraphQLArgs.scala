package typings.graphql.graphqlGraphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageSourceMod.Source
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLTypeResolver
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLArgs extends js.Object {
  var contextValue: js.UndefOr[js.Any] = js.undefined
  var fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.undefined
  var operationName: js.UndefOr[Maybe[String]] = js.undefined
  var rootValue: js.UndefOr[js.Any] = js.undefined
  var schema: GraphQLSchema
  var source: String | Source
  var typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]] = js.undefined
  var variableValues: js.UndefOr[Maybe[StringDictionary[_]]] = js.undefined
}

object GraphQLArgs {
  @scala.inline
  def apply(
    schema: GraphQLSchema,
    source: String | Source,
    contextValue: js.Any = null,
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]] = null,
    operationName: Maybe[String] = null,
    rootValue: js.Any = null,
    typeResolver: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]] = null,
    variableValues: Maybe[StringDictionary[_]] = null
  ): GraphQLArgs = {
    val __obj = js.Dynamic.literal(schema = schema, source = source.asInstanceOf[js.Any])
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue)
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(fieldResolver.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue)
    if (typeResolver != null) __obj.updateDynamic("typeResolver")(typeResolver.asInstanceOf[js.Any])
    if (variableValues != null) __obj.updateDynamic("variableValues")(variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLArgs]
  }
}

