package typings.koaDashJwt.koaDashJwtMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koaDashJwt.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify compose.Middleware<ParameterizedContext<StateT, CustomT>> * / any */ @js.native
trait Middleware extends js.Object {
  def unless(): typings.koa.koaMod.Middleware[DefaultState, DefaultContext] = js.native
  def unless(params: Anon_Path): typings.koa.koaMod.Middleware[DefaultState, DefaultContext] = js.native
}

