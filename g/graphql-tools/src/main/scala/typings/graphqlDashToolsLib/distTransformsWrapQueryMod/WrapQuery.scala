package typings
package graphqlDashToolsLib.distTransformsWrapQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(graphql-tools.graphql-tools/dist/Interfaces.Transform) */ @js.native
trait WrapQuery extends js.Object {
  var extractor: js.Any = js.native
  var path: js.Any = js.native
  var transformRequest: js.UndefOr[
    js.Function1[
      /* originalRequest */ graphqlDashToolsLib.distInterfacesMod.Request, 
      graphqlDashToolsLib.distInterfacesMod.Request
    ]
  ] = js.native
  var transformResult: js.UndefOr[
    js.Function1[
      /* result */ graphqlDashToolsLib.distInterfacesMod.Result, 
      graphqlDashToolsLib.distInterfacesMod.Result
    ]
  ] = js.native
  var transformSchema: js.UndefOr[
    js.Function1[
      /* schema */ graphqlLib.graphqlMod.GraphQLSchema, 
      graphqlLib.graphqlMod.GraphQLSchema
    ]
  ] = js.native
  var wrapper: js.Any = js.native
  def transformRequest(originalRequest: graphqlDashToolsLib.distInterfacesMod.Request): graphqlDashToolsLib.distInterfacesMod.Request = js.native
  def transformResult(originalResult: graphqlDashToolsLib.distInterfacesMod.Result): graphqlDashToolsLib.distInterfacesMod.Result = js.native
}

