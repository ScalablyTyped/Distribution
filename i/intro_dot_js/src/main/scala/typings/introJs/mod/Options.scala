package typings.introJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var disableInteraction: js.UndefOr[Boolean] = js.undefined
  var doneLabel: js.UndefOr[String] = js.undefined
  var exitOnEsc: js.UndefOr[Boolean] = js.undefined
  var exitOnOverlayClick: js.UndefOr[Boolean] = js.undefined
  var hideNext: js.UndefOr[Boolean] = js.undefined
  var hidePrev: js.UndefOr[Boolean] = js.undefined
  var highlightClass: js.UndefOr[String] = js.undefined
  var hintAnimation: js.UndefOr[Boolean] = js.undefined
  var hintButtonLabel: js.UndefOr[String] = js.undefined
  var hintPosition: js.UndefOr[String] = js.undefined
  var hints: js.UndefOr[js.Array[Hint]] = js.undefined
  var keyboardNavigation: js.UndefOr[Boolean] = js.undefined
  var nextLabel: js.UndefOr[String] = js.undefined
  var overlayOpacity: js.UndefOr[Double] = js.undefined
  var positionPrecedence: js.UndefOr[js.Array[String]] = js.undefined
  var prevLabel: js.UndefOr[String] = js.undefined
  var scrollPadding: js.UndefOr[Double] = js.undefined
  var scrollToElement: js.UndefOr[Boolean] = js.undefined
  var showBullets: js.UndefOr[Boolean] = js.undefined
  var showButtons: js.UndefOr[Boolean] = js.undefined
  var showProgress: js.UndefOr[Boolean] = js.undefined
  var showStepNumbers: js.UndefOr[Boolean] = js.undefined
  var skipLabel: js.UndefOr[String] = js.undefined
  var steps: js.UndefOr[js.Array[Step]] = js.undefined
  var tooltipClass: js.UndefOr[String] = js.undefined
  var tooltipPosition: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    disableInteraction: js.UndefOr[Boolean] = js.undefined,
    doneLabel: String = null,
    exitOnEsc: js.UndefOr[Boolean] = js.undefined,
    exitOnOverlayClick: js.UndefOr[Boolean] = js.undefined,
    hideNext: js.UndefOr[Boolean] = js.undefined,
    hidePrev: js.UndefOr[Boolean] = js.undefined,
    highlightClass: String = null,
    hintAnimation: js.UndefOr[Boolean] = js.undefined,
    hintButtonLabel: String = null,
    hintPosition: String = null,
    hints: js.Array[Hint] = null,
    keyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    nextLabel: String = null,
    overlayOpacity: js.UndefOr[Double] = js.undefined,
    positionPrecedence: js.Array[String] = null,
    prevLabel: String = null,
    scrollPadding: js.UndefOr[Double] = js.undefined,
    scrollToElement: js.UndefOr[Boolean] = js.undefined,
    showBullets: js.UndefOr[Boolean] = js.undefined,
    showButtons: js.UndefOr[Boolean] = js.undefined,
    showProgress: js.UndefOr[Boolean] = js.undefined,
    showStepNumbers: js.UndefOr[Boolean] = js.undefined,
    skipLabel: String = null,
    steps: js.Array[Step] = null,
    tooltipClass: String = null,
    tooltipPosition: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableInteraction)) __obj.updateDynamic("disableInteraction")(disableInteraction.get.asInstanceOf[js.Any])
    if (doneLabel != null) __obj.updateDynamic("doneLabel")(doneLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(exitOnEsc)) __obj.updateDynamic("exitOnEsc")(exitOnEsc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exitOnOverlayClick)) __obj.updateDynamic("exitOnOverlayClick")(exitOnOverlayClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNext)) __obj.updateDynamic("hideNext")(hideNext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePrev)) __obj.updateDynamic("hidePrev")(hidePrev.get.asInstanceOf[js.Any])
    if (highlightClass != null) __obj.updateDynamic("highlightClass")(highlightClass.asInstanceOf[js.Any])
    if (!js.isUndefined(hintAnimation)) __obj.updateDynamic("hintAnimation")(hintAnimation.get.asInstanceOf[js.Any])
    if (hintButtonLabel != null) __obj.updateDynamic("hintButtonLabel")(hintButtonLabel.asInstanceOf[js.Any])
    if (hintPosition != null) __obj.updateDynamic("hintPosition")(hintPosition.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardNavigation)) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation.get.asInstanceOf[js.Any])
    if (nextLabel != null) __obj.updateDynamic("nextLabel")(nextLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayOpacity)) __obj.updateDynamic("overlayOpacity")(overlayOpacity.get.asInstanceOf[js.Any])
    if (positionPrecedence != null) __obj.updateDynamic("positionPrecedence")(positionPrecedence.asInstanceOf[js.Any])
    if (prevLabel != null) __obj.updateDynamic("prevLabel")(prevLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPadding)) __obj.updateDynamic("scrollPadding")(scrollPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToElement)) __obj.updateDynamic("scrollToElement")(scrollToElement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showBullets)) __obj.updateDynamic("showBullets")(showBullets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showProgress)) __obj.updateDynamic("showProgress")(showProgress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showStepNumbers)) __obj.updateDynamic("showStepNumbers")(showStepNumbers.get.asInstanceOf[js.Any])
    if (skipLabel != null) __obj.updateDynamic("skipLabel")(skipLabel.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (tooltipClass != null) __obj.updateDynamic("tooltipClass")(tooltipClass.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

