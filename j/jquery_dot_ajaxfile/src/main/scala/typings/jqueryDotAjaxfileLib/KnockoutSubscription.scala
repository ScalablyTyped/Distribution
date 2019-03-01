package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutSubscription extends js.Object {
  def dispose(): scala.Unit
}

object KnockoutSubscription {
  @scala.inline
  def apply(dispose: js.Function0[scala.Unit]): KnockoutSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose)
    __obj.asInstanceOf[KnockoutSubscription]
  }
}

