package typings.loadware

import typings.loadware.AnyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loadwareMod {
  type Loadable[F /* <: AnyFunction */] = String | F | RecursiveLoadable[F]
}
