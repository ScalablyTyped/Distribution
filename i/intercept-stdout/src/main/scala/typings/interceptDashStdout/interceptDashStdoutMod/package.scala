package typings.interceptDashStdout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interceptDashStdoutMod {
  type hookFunction = js.Function1[/* txt */ String, String | Unit]
  type unhookFunction = js.Function0[Unit]
}
