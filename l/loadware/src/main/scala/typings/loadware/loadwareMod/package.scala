package typings.loadware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loadwareMod {
  import typings.loadware.AnyFunction

  type Loadable[F /* <: AnyFunction */] = String | F | RecursiveLoadable[F]
}
