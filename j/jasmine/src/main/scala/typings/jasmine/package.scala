package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  type ImplementationCallback = (js.Function0[js.Thenable[js.Any] | Unit]) | (js.Function1[/* done */ DoneFn, Unit])
}
