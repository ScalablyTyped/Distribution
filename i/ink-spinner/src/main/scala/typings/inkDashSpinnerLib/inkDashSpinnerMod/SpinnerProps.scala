package typings
package inkDashSpinnerLib.inkDashSpinnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  var `type`: js.UndefOr[cliDashSpinnersLib.cliDashSpinnersMod.cliSpinnersNs.SpinnerName] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(`type`: cliDashSpinnersLib.cliDashSpinnersMod.cliSpinnersNs.SpinnerName = null): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SpinnerProps]
  }
}

