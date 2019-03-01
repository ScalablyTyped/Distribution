package typings
package introDotJsLib.IntroJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var disableInteraction: js.UndefOr[scala.Boolean] = js.undefined
  var doneLabel: js.UndefOr[java.lang.String] = js.undefined
  var exitOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  var exitOnOverlayClick: js.UndefOr[scala.Boolean] = js.undefined
  var hideNext: js.UndefOr[scala.Boolean] = js.undefined
  var hidePrev: js.UndefOr[scala.Boolean] = js.undefined
  var highlightClass: js.UndefOr[java.lang.String] = js.undefined
  var hintAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var hintButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  var hintPosition: js.UndefOr[java.lang.String] = js.undefined
  var hints: js.UndefOr[js.Array[Hint]] = js.undefined
  var keyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  var nextLabel: js.UndefOr[java.lang.String] = js.undefined
  var overlayOpacity: js.UndefOr[scala.Double] = js.undefined
  var positionPrecedence: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var prevLabel: js.UndefOr[java.lang.String] = js.undefined
  var scrollPadding: js.UndefOr[scala.Double] = js.undefined
  var scrollToElement: js.UndefOr[scala.Boolean] = js.undefined
  var showBullets: js.UndefOr[scala.Boolean] = js.undefined
  var showButtons: js.UndefOr[scala.Boolean] = js.undefined
  var showProgress: js.UndefOr[scala.Boolean] = js.undefined
  var showStepNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var skipLabel: js.UndefOr[java.lang.String] = js.undefined
  var steps: js.UndefOr[js.Array[Step]] = js.undefined
  var tooltipClass: js.UndefOr[java.lang.String] = js.undefined
  var tooltipPosition: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    disableInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    doneLabel: java.lang.String = null,
    exitOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    exitOnOverlayClick: js.UndefOr[scala.Boolean] = js.undefined,
    hideNext: js.UndefOr[scala.Boolean] = js.undefined,
    hidePrev: js.UndefOr[scala.Boolean] = js.undefined,
    highlightClass: java.lang.String = null,
    hintAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    hintButtonLabel: java.lang.String = null,
    hintPosition: java.lang.String = null,
    hints: js.Array[Hint] = null,
    keyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    nextLabel: java.lang.String = null,
    overlayOpacity: scala.Int | scala.Double = null,
    positionPrecedence: js.Array[java.lang.String] = null,
    prevLabel: java.lang.String = null,
    scrollPadding: scala.Int | scala.Double = null,
    scrollToElement: js.UndefOr[scala.Boolean] = js.undefined,
    showBullets: js.UndefOr[scala.Boolean] = js.undefined,
    showButtons: js.UndefOr[scala.Boolean] = js.undefined,
    showProgress: js.UndefOr[scala.Boolean] = js.undefined,
    showStepNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    skipLabel: java.lang.String = null,
    steps: js.Array[Step] = null,
    tooltipClass: java.lang.String = null,
    tooltipPosition: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableInteraction)) __obj.updateDynamic("disableInteraction")(disableInteraction)
    if (doneLabel != null) __obj.updateDynamic("doneLabel")(doneLabel)
    if (!js.isUndefined(exitOnEsc)) __obj.updateDynamic("exitOnEsc")(exitOnEsc)
    if (!js.isUndefined(exitOnOverlayClick)) __obj.updateDynamic("exitOnOverlayClick")(exitOnOverlayClick)
    if (!js.isUndefined(hideNext)) __obj.updateDynamic("hideNext")(hideNext)
    if (!js.isUndefined(hidePrev)) __obj.updateDynamic("hidePrev")(hidePrev)
    if (highlightClass != null) __obj.updateDynamic("highlightClass")(highlightClass)
    if (!js.isUndefined(hintAnimation)) __obj.updateDynamic("hintAnimation")(hintAnimation)
    if (hintButtonLabel != null) __obj.updateDynamic("hintButtonLabel")(hintButtonLabel)
    if (hintPosition != null) __obj.updateDynamic("hintPosition")(hintPosition)
    if (hints != null) __obj.updateDynamic("hints")(hints)
    if (!js.isUndefined(keyboardNavigation)) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation)
    if (nextLabel != null) __obj.updateDynamic("nextLabel")(nextLabel)
    if (overlayOpacity != null) __obj.updateDynamic("overlayOpacity")(overlayOpacity.asInstanceOf[js.Any])
    if (positionPrecedence != null) __obj.updateDynamic("positionPrecedence")(positionPrecedence)
    if (prevLabel != null) __obj.updateDynamic("prevLabel")(prevLabel)
    if (scrollPadding != null) __obj.updateDynamic("scrollPadding")(scrollPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToElement)) __obj.updateDynamic("scrollToElement")(scrollToElement)
    if (!js.isUndefined(showBullets)) __obj.updateDynamic("showBullets")(showBullets)
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons)
    if (!js.isUndefined(showProgress)) __obj.updateDynamic("showProgress")(showProgress)
    if (!js.isUndefined(showStepNumbers)) __obj.updateDynamic("showStepNumbers")(showStepNumbers)
    if (skipLabel != null) __obj.updateDynamic("skipLabel")(skipLabel)
    if (steps != null) __obj.updateDynamic("steps")(steps)
    if (tooltipClass != null) __obj.updateDynamic("tooltipClass")(tooltipClass)
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition)
    __obj.asInstanceOf[Options]
  }
}

