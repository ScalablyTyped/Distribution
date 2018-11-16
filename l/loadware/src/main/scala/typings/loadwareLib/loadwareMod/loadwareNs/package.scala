package typings
package loadwareLib.loadwareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loadwareNs {
  type Loadable[F /* <: loadwareLib.AnyFunction */] = java.lang.String | F | RecursiveLoadable[F]
}
