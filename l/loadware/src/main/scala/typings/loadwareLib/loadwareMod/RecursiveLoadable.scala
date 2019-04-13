package typings
package loadwareLib.loadwareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecursiveLoadable[F /* <: loadwareLib.AnyFunction */]
  extends stdLib.Array[F | Loadable[F]]

