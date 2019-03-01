package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyButtons extends js.Object {
  /**
    * The classes to use for button icons. Leave them null to use the classes from the styling you're using.
    */
  var classes: js.UndefOr[Anon_Closer] = js.undefined
  /**
    * Provide a button for the user to manually close the notice.
    */
  var closer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only show the closer button on hover.
    */
  var closer_hover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The various displayed text, helps facilitating internationalization.
    */
  var labels: js.UndefOr[Anon_Close] = js.undefined
  /**
    * Show the buttons even when the nonblock module is in use.
    */
  var show_on_nonblock: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Provide a button for the user to manually stick the notice.
    */
  var sticker: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only show the sticker button on hover.
    */
  var sticker_hover: js.UndefOr[scala.Boolean] = js.undefined
}

object PNotifyButtons {
  @scala.inline
  def apply(
    classes: Anon_Closer = null,
    closer: js.UndefOr[scala.Boolean] = js.undefined,
    closer_hover: js.UndefOr[scala.Boolean] = js.undefined,
    labels: Anon_Close = null,
    show_on_nonblock: js.UndefOr[scala.Boolean] = js.undefined,
    sticker: js.UndefOr[scala.Boolean] = js.undefined,
    sticker_hover: js.UndefOr[scala.Boolean] = js.undefined
  ): PNotifyButtons = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(closer)) __obj.updateDynamic("closer")(closer)
    if (!js.isUndefined(closer_hover)) __obj.updateDynamic("closer_hover")(closer_hover)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (!js.isUndefined(show_on_nonblock)) __obj.updateDynamic("show_on_nonblock")(show_on_nonblock)
    if (!js.isUndefined(sticker)) __obj.updateDynamic("sticker")(sticker)
    if (!js.isUndefined(sticker_hover)) __obj.updateDynamic("sticker_hover")(sticker_hover)
    __obj.asInstanceOf[PNotifyButtons]
  }
}

