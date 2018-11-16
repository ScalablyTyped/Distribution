package typings
package kosDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kosDashCoreMod {
  type GetKosState[T] = js.Function0[T]
  type KosDispatch = js.Function1[/* action */ Action[js.Any], scala.Unit]
}
