package typings
package gulpDashHelpLib.gulpDashHelpMod

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
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Modifies the default help message
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Hide all task dependencies
    */
  var hideDepsMessage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Hide all tasks with no help message defined. Useful when including 3rd party tasks
    */
  var hideEmpty: js.UndefOr[scala.Boolean] = js.undefined
}

object GulpHelpOptions {
  @scala.inline
  def apply(
    afterPrintCallback: js.Function = null,
    aliases: js.Array[java.lang.String] = null,
    description: java.lang.String = null,
    hideDepsMessage: js.UndefOr[scala.Boolean] = js.undefined,
    hideEmpty: js.UndefOr[scala.Boolean] = js.undefined
  ): GulpHelpOptions = {
    val __obj = js.Dynamic.literal()
    if (afterPrintCallback != null) __obj.updateDynamic("afterPrintCallback")(afterPrintCallback)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(hideDepsMessage)) __obj.updateDynamic("hideDepsMessage")(hideDepsMessage)
    if (!js.isUndefined(hideEmpty)) __obj.updateDynamic("hideEmpty")(hideEmpty)
    __obj.asInstanceOf[GulpHelpOptions]
  }
}

