package typings.lab.labMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptOptions extends js.Object {
  /** Pass Lab CLI options */
  var cli: js.UndefOr[js.Any] = js.undefined
  /** Enable auto-execution of the script? (true) */
  var schedule: js.UndefOr[Boolean] = js.undefined
}

object ScriptOptions {
  @scala.inline
  def apply(cli: js.Any = null, schedule: js.UndefOr[Boolean] = js.undefined): ScriptOptions = {
    val __obj = js.Dynamic.literal()
    if (cli != null) __obj.updateDynamic("cli")(cli.asInstanceOf[js.Any])
    if (!js.isUndefined(schedule)) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptOptions]
  }
}

