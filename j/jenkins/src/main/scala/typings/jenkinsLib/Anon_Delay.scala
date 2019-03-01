package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[jenkinsLib.jenkinsLibStrings.text | jenkinsLib.jenkinsLibStrings.html] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    `type`: jenkinsLib.jenkinsLibStrings.text | jenkinsLib.jenkinsLibStrings.html = null
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delay]
  }
}

