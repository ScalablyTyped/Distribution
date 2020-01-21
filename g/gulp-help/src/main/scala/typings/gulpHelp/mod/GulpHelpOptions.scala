package typings.gulpHelp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GulpHelpOptions extends js.Object {
  /**
    * A function to run after the default help task runs
    */
  var afterPrintCallback: js.UndefOr[js.Function] = js.undefined
  /**
    * Adds aliases to the default help task
    */
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Modifies the default help message
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Hide all task dependencies
    */
  var hideDepsMessage: js.UndefOr[Boolean] = js.undefined
  /**
    * Hide all tasks with no help message defined. Useful when including 3rd party tasks
    */
  var hideEmpty: js.UndefOr[Boolean] = js.undefined
}

object GulpHelpOptions {
  @scala.inline
  def apply(
    afterPrintCallback: js.Function = null,
    aliases: js.Array[String] = null,
    description: String = null,
    hideDepsMessage: js.UndefOr[Boolean] = js.undefined,
    hideEmpty: js.UndefOr[Boolean] = js.undefined
  ): GulpHelpOptions = {
    val __obj = js.Dynamic.literal()
    if (afterPrintCallback != null) __obj.updateDynamic("afterPrintCallback")(afterPrintCallback.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDepsMessage)) __obj.updateDynamic("hideDepsMessage")(hideDepsMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(hideEmpty)) __obj.updateDynamic("hideEmpty")(hideEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[GulpHelpOptions]
  }
}

