package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Transform extends js.Object {
  var transformRequest: js.UndefOr[js.Function1[/* originalRequest */ Request, Request]] = js.undefined
  var transformResult: js.UndefOr[js.Function1[/* result */ Result, Result]] = js.undefined
  var transformSchema: js.UndefOr[
    js.Function1[
      /* schema */ graphqlLib.graphqlMod.GraphQLSchema, 
      graphqlLib.graphqlMod.GraphQLSchema
    ]
  ] = js.undefined
}

