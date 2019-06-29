package typings
package koaDashWebsocketLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashWebsocketMod {
  type Middleware[StateT, CustomT] = koaDashComposeLib.koaDashComposeMod.Middleware[MiddlewareContext[StateT] with CustomT]
}
