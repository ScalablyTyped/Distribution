package typings.jqueryDotAreDashYouDashSure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**Options available to control dirty form checking*/
trait AreYouSureOptions extends js.Object {
  /**Callback when form is found to be dirty - allows control of submit/reset buttons etc*/
  var change: js.UndefOr[js.Function] = js.undefined
  /**Class to assign to the form when dirty*/
  var dirtyClass: js.UndefOr[String] = js.undefined
  /**Jquery selector to use to find input elements*/
  var fieldSelector: js.UndefOr[String] = js.undefined
  /**Message to show when attempting to quit a dirty form without saving*/
  var message: js.UndefOr[String] = js.undefined
  /**Make Are-You-Sure "silent" by disabling the warning message*/
  var silent: js.UndefOr[Boolean] = js.undefined
}

object AreYouSureOptions {
  @scala.inline
  def apply(
    change: js.Function = null,
    dirtyClass: String = null,
    fieldSelector: String = null,
    message: String = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): AreYouSureOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (dirtyClass != null) __obj.updateDynamic("dirtyClass")(dirtyClass)
    if (fieldSelector != null) __obj.updateDynamic("fieldSelector")(fieldSelector)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[AreYouSureOptions]
  }
}

