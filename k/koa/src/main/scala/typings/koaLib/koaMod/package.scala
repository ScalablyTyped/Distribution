package typings
package koaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaMod {
  type Context = ParameterizedContext[js.Any, js.Object]
  type Middleware[StateT, CustomT] = koaDashComposeLib.koaDashComposeMod.Middleware[ParameterizedContext[StateT, CustomT]]
  type ParameterizedContext[StateT, CustomT] = BaseContext with koaLib.Anon_Accept[StateT] with CustomT
}
