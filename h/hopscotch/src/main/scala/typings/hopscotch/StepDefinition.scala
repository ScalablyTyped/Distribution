package typings.hopscotch

import typings.hopscotch.hopscotchStrings.center
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepDefinition extends js.Object {
  var arrowOffset: js.UndefOr[Double | center] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var ctaLabel: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var fixedElement: js.UndefOr[Boolean] = js.undefined
  var multipage: js.UndefOr[Boolean] = js.undefined
  var nextOnTargetClick: js.UndefOr[Boolean] = js.undefined
  var onCTA: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var onNext: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var onPrev: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var onShow: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var placement: placementTypes
  var showCTAButton: js.UndefOr[Boolean] = js.undefined
  var showNextButton: js.UndefOr[Boolean] = js.undefined
  var showPrevButton: js.UndefOr[Boolean] = js.undefined
  var showSkip: js.UndefOr[Boolean] = js.undefined
  var target: String | HTMLElement | (js.Array[String | HTMLElement])
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var xOffset: js.UndefOr[Double | center] = js.undefined
  var yOffset: js.UndefOr[Double | center] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object StepDefinition {
  @scala.inline
  def apply(
    placement: placementTypes,
    target: String | HTMLElement | (js.Array[String | HTMLElement]),
    arrowOffset: Double | center = null,
    content: String = null,
    ctaLabel: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    fixedElement: js.UndefOr[Boolean] = js.undefined,
    multipage: js.UndefOr[Boolean] = js.undefined,
    nextOnTargetClick: js.UndefOr[Boolean] = js.undefined,
    onCTA: CallbackNameNamesOrDefinition = null,
    onNext: CallbackNameNamesOrDefinition = null,
    onPrev: CallbackNameNamesOrDefinition = null,
    onShow: CallbackNameNamesOrDefinition = null,
    padding: js.UndefOr[Double] = js.undefined,
    showCTAButton: js.UndefOr[Boolean] = js.undefined,
    showNextButton: js.UndefOr[Boolean] = js.undefined,
    showPrevButton: js.UndefOr[Boolean] = js.undefined,
    showSkip: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined,
    xOffset: Double | center = null,
    yOffset: Double | center = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): StepDefinition = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (arrowOffset != null) __obj.updateDynamic("arrowOffset")(arrowOffset.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (ctaLabel != null) __obj.updateDynamic("ctaLabel")(ctaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedElement)) __obj.updateDynamic("fixedElement")(fixedElement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipage)) __obj.updateDynamic("multipage")(multipage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nextOnTargetClick)) __obj.updateDynamic("nextOnTargetClick")(nextOnTargetClick.get.asInstanceOf[js.Any])
    if (onCTA != null) __obj.updateDynamic("onCTA")(onCTA.asInstanceOf[js.Any])
    if (onNext != null) __obj.updateDynamic("onNext")(onNext.asInstanceOf[js.Any])
    if (onPrev != null) __obj.updateDynamic("onPrev")(onPrev.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCTAButton)) __obj.updateDynamic("showCTAButton")(showCTAButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNextButton)) __obj.updateDynamic("showNextButton")(showNextButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrevButton)) __obj.updateDynamic("showPrevButton")(showPrevButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSkip)) __obj.updateDynamic("showSkip")(showSkip.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (xOffset != null) __obj.updateDynamic("xOffset")(xOffset.asInstanceOf[js.Any])
    if (yOffset != null) __obj.updateDynamic("yOffset")(yOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDefinition]
  }
}

