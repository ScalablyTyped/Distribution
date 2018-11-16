package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iferrLib {
  type nodeCallback[T] = js.Function2[/* err */ js.UndefOr[stdLib.Error], /* repeated */T, js.Any]
}
