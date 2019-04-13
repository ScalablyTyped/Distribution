package typings
package loadwareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loadwareMod {
  type Loadable[F /* <: loadwareLib.AnyFunction */] = java.lang.String | F | RecursiveLoadable[F]
}
