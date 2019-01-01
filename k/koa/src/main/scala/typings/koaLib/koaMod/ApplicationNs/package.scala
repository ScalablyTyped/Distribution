package typings
package koaLib.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ApplicationNs {
  type Context = ParameterizedContext[js.Any, js.Object]
  type Middleware[StateT, CustomT] = koaDashComposeLib.koaDashComposeMod.composeNs.Middleware[ParameterizedContext[StateT, CustomT]]
  type ParameterizedContext[StateT, CustomT] = BaseContext with koaLib.Anon_Accept[StateT] with CustomT
}
