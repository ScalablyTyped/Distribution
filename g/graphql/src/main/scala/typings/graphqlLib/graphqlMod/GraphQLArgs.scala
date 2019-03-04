package typings
package graphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLArgs extends js.Object {
  var contextValue: js.UndefOr[js.Any] = js.undefined
  var fieldResolver: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ] = js.undefined
  var operationName: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var rootValue: js.UndefOr[js.Any] = js.undefined
  var schema: graphqlLib.typeSchemaMod.GraphQLSchema
  var source: graphqlLib.languageSourceMod.Source | java.lang.String
  var variableValues: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object GraphQLArgs {
  @scala.inline
  def apply(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source | java.lang.String,
    contextValue: js.Any = null,
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ] = null,
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null,
    rootValue: js.Any = null,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): GraphQLArgs = {
    val __obj = js.Dynamic.literal(schema = schema, source = source.asInstanceOf[js.Any])
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue)
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(fieldResolver.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue)
    if (variableValues != null) __obj.updateDynamic("variableValues")(variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLArgs]
  }
}

