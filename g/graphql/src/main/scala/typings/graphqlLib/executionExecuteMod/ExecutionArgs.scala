package typings
package graphqlLib.executionExecuteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionArgs extends js.Object {
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
  var variableValues: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object ExecutionArgs {
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
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ExecutionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("document")(document)
    __obj.updateDynamic("schema")(schema)
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue)
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(fieldResolver.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue)
    if (variableValues != null) __obj.updateDynamic("variableValues")(variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionArgs]
  }
}

