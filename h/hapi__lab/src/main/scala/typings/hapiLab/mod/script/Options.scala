package typings.hapiLab.mod.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 
    */
  var cli: js.UndefOr[Cli] = js.undefined
  /**
    * Determines if execution of tests should be delayed until the CLI runs them explicitly.
    * 
    * @default true
    */
  var schedule: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(cli: Cli = null, schedule: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (cli != null) __obj.updateDynamic("cli")(cli.asInstanceOf[js.Any])
    if (!js.isUndefined(schedule)) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

