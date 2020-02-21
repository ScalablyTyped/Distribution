package typings.karmaIeLauncher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLauncher extends js.Object {
  /** run IE in emulation mode */
  var `x-ua-compatible`: js.UndefOr[String] = js.undefined
}

object CustomLauncher {
  @scala.inline
  def apply(`x-ua-compatible`: String = null): CustomLauncher = {
    val __obj = js.Dynamic.literal()
    if (`x-ua-compatible` != null) __obj.updateDynamic("x-ua-compatible")(`x-ua-compatible`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLauncher]
  }
}

