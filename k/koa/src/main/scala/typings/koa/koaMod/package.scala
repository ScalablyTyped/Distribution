package typings.koa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaMod {
  import typings.koa.Anon_State

  type Context = ParameterizedContext[DefaultState, DefaultContext]
  type DefaultContextExtends = js.Object
  /**
    * This interface can be augmented by users to add types to Koa's default state
    */
  type DefaultState = DefaultStateExtends
  type DefaultStateExtends = js.Any
  type Middleware[StateT, CustomT] = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify compose.Middleware<ParameterizedContext<StateT, CustomT>> */ js.Any
  type Next = js.Function0[js.Promise[js.Any]]
  type ParameterizedContext[StateT, CustomT] = ExtendableContext with Anon_State[StateT] with CustomT
}
