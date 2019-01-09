package typings
package graphqlDashToolsLib.distTransformsCheckResultAndHandleErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Lifted 3 members from Set(graphql-tools.graphql-tools/dist/Interfaces.Transform) */ @js.native
trait CheckResultAndHandleErrors extends js.Object {
  var fieldName: js.UndefOr[js.Any] = js.native
  var info: js.Any = js.native
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
  def transformResult(result: js.Any): js.Any = js.native
}

