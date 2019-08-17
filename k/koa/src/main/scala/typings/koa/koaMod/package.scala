package typings.koa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaMod {
  import typings.koa.Anon_State

  type Context = ParameterizedContext[js.Any, js.Object]
  type Middleware[StateT, CustomT] = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify compose.Middleware<ParameterizedContext<StateT, CustomT>> */ js.Any
  type ParameterizedContext[StateT, CustomT] = ExtendableContext with Anon_State[StateT] with CustomT
}
