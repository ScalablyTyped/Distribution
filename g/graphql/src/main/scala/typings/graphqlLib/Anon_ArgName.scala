package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgName extends js.Object {
  var contextValue: js.UndefOr[js.Any] = js.undefined
  var document: graphqlLib.languageAstMod.DocumentNode
  var fieldResolver: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ] = js.undefined
  var operationName: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var rootValue: js.UndefOr[js.Any] = js.undefined
  var schema: graphqlLib.typeSchemaMod.GraphQLSchema
  var subscribeFieldResolver: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ] = js.undefined
  var variableValues: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object Anon_ArgName {
  @scala.inline
  def apply(
    document: graphqlLib.languageAstMod.DocumentNode,
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    contextValue: js.Any = null,
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ] = null,
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null,
    rootValue: js.Any = null,
    subscribeFieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ] = null,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): Anon_ArgName = {
    val __obj = js.Dynamic.literal(document = document, schema = schema)
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue)
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(fieldResolver.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue)
    if (subscribeFieldResolver != null) __obj.updateDynamic("subscribeFieldResolver")(subscribeFieldResolver.asInstanceOf[js.Any])
    if (variableValues != null) __obj.updateDynamic("variableValues")(variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgName]
  }
}

