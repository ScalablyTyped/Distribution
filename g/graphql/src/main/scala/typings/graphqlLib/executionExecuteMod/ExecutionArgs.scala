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
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]
    ]
  ] = js.undefined
  var operationName: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var rootValue: js.UndefOr[js.Any] = js.undefined
  var schema: graphqlLib.typeSchemaMod.GraphQLSchema
  var variableValues: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]]] = js.undefined
}

