package typings.karmaViewport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object viewportMod {
  type ViewportCallback[T] = js.Function1[/* breakpoint */ java.lang.String, T]
}
