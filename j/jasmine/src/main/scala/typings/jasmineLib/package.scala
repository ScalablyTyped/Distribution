package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmineLib {
  type ImplementationCallback = js.Function0[js.Thenable[js.Any]] | js.Function0[scala.Unit] | (js.Function1[/* done */ DoneFn, scala.Unit])
}
