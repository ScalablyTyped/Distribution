package typings
package hopscotchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TourDefinition extends HopscotchConfiguration {
  var id: java.lang.String
  var steps: js.Array[StepDefinition]
}

object TourDefinition {
  @scala.inline
  def apply(
    id: java.lang.String,
    steps: js.Array[StepDefinition],
    arrowWidth: scala.Int | scala.Double = null,
    bubbleWidth: scala.Int | scala.Double = null,
    buddleHeight: scala.Int | scala.Double = null,
    i18n: Anon_CloseTooltip = null,
    nextOnTargetClick: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: CallbackNameNamesOrDefinition = null,
    onEnd: CallbackNameNamesOrDefinition = null,
    onError: CallbackNameNamesOrDefinition = null,
    onNext: CallbackNameNamesOrDefinition = null,
    onPrev: CallbackNameNamesOrDefinition = null,
    onShow: CallbackNameNamesOrDefinition = null,
    onStart: CallbackNameNamesOrDefinition = null,
    scrollDuration: scala.Int | scala.Double = null,
    scrollTopMargin: scala.Int | scala.Double = null,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    showNextButton: js.UndefOr[scala.Boolean] = js.undefined,
    showPrevButton: js.UndefOr[scala.Boolean] = js.undefined,
    skipIfNoElement: js.UndefOr[scala.Boolean] = js.undefined,
    smoothScroll: js.UndefOr[scala.Boolean] = js.undefined
  ): TourDefinition = {
    val __obj = js.Dynamic.literal(id = id, steps = steps)
    if (arrowWidth != null) __obj.updateDynamic("arrowWidth")(arrowWidth.asInstanceOf[js.Any])
    if (bubbleWidth != null) __obj.updateDynamic("bubbleWidth")(bubbleWidth.asInstanceOf[js.Any])
    if (buddleHeight != null) __obj.updateDynamic("buddleHeight")(buddleHeight.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (!js.isUndefined(nextOnTargetClick)) __obj.updateDynamic("nextOnTargetClick")(nextOnTargetClick)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onNext != null) __obj.updateDynamic("onNext")(onNext.asInstanceOf[js.Any])
    if (onPrev != null) __obj.updateDynamic("onPrev")(onPrev.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (onStart != null) __obj.updateDynamic("onStart")(onStart.asInstanceOf[js.Any])
    if (scrollDuration != null) __obj.updateDynamic("scrollDuration")(scrollDuration.asInstanceOf[js.Any])
    if (scrollTopMargin != null) __obj.updateDynamic("scrollTopMargin")(scrollTopMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(showNextButton)) __obj.updateDynamic("showNextButton")(showNextButton)
    if (!js.isUndefined(showPrevButton)) __obj.updateDynamic("showPrevButton")(showPrevButton)
    if (!js.isUndefined(skipIfNoElement)) __obj.updateDynamic("skipIfNoElement")(skipIfNoElement)
    if (!js.isUndefined(smoothScroll)) __obj.updateDynamic("smoothScroll")(smoothScroll)
    __obj.asInstanceOf[TourDefinition]
  }
}

