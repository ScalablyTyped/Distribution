package typings
package graphqlDashToolsLib.distTransformsExpandAbstractTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(graphql-tools.graphql-tools/dist/Interfaces.Transform) */ @js.native
trait ExpandAbstractTypes extends js.Object {
  var mapping: js.Any = js.native
  var reverseMapping: js.Any = js.native
  var targetSchema: js.Any = js.native
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
  def transformRequest(originalRequest: graphqlDashToolsLib.distInterfacesMod.Request): graphqlDashToolsLib.distInterfacesMod.Request = js.native
}

