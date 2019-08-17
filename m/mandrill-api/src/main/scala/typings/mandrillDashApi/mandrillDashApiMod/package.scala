package typings.mandrillDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mandrillDashApiMod {
  import typings.std.Error

  type ICallback = js.Function1[/* json */ js.Object, Unit]
  type IErrorCallback = js.Function1[/* err */ Error, Unit]
}
