package typings.inkSpinner.mod

import typings.cliSpinners.mod.SpinnerName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  /**
    * Type of a spinner to use. See https://github.com/sindresorhus/cli-spinners for available spinners.
    *
    * @default 'dot'
    */
  var `type`: js.UndefOr[SpinnerName] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(`type`: SpinnerName = null): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
}

