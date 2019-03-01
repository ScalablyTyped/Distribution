package typings
package hopscotchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepDefinition extends js.Object {
  var arrowOffset: js.UndefOr[scala.Double | hopscotchLib.hopscotchLibStrings.center] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var ctaLabel: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var fixedElement: js.UndefOr[scala.Boolean] = js.undefined
  var multipage: js.UndefOr[scala.Boolean] = js.undefined
  var nextOnTargetClick: js.UndefOr[scala.Boolean] = js.undefined
  var onCTA: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var onNext: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var onPrev: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var onShow: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var placement: placementTypes
  var showCTAButton: js.UndefOr[scala.Boolean] = js.undefined
  var showNextButton: js.UndefOr[scala.Boolean] = js.undefined
  var showPrevButton: js.UndefOr[scala.Boolean] = js.undefined
  var showSkip: js.UndefOr[scala.Boolean] = js.undefined
  var target: java.lang.String | stdLib.HTMLElement | (js.Array[java.lang.String | stdLib.HTMLElement])
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var xOffset: js.UndefOr[scala.Double | hopscotchLib.hopscotchLibStrings.center] = js.undefined
  var yOffset: js.UndefOr[scala.Double | hopscotchLib.hopscotchLibStrings.center] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object StepDefinition {
  @scala.inline
  def apply(
    placement: placementTypes,
    target: java.lang.String | stdLib.HTMLElement | (js.Array[java.lang.String | stdLib.HTMLElement]),
    arrowOffset: scala.Double | hopscotchLib.hopscotchLibStrings.center = null,
    content: java.lang.String = null,
    ctaLabel: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    fixedElement: js.UndefOr[scala.Boolean] = js.undefined,
    multipage: js.UndefOr[scala.Boolean] = js.undefined,
    nextOnTargetClick: js.UndefOr[scala.Boolean] = js.undefined,
    onCTA: CallbackNameNamesOrDefinition = null,
    onNext: CallbackNameNamesOrDefinition = null,
    onPrev: CallbackNameNamesOrDefinition = null,
    onShow: CallbackNameNamesOrDefinition = null,
    padding: scala.Int | scala.Double = null,
    showCTAButton: js.UndefOr[scala.Boolean] = js.undefined,
    showNextButton: js.UndefOr[scala.Boolean] = js.undefined,
    showPrevButton: js.UndefOr[scala.Boolean] = js.undefined,
    showSkip: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    xOffset: scala.Double | hopscotchLib.hopscotchLibStrings.center = null,
    yOffset: scala.Double | hopscotchLib.hopscotchLibStrings.center = null,
    zIndex: scala.Int | scala.Double = null
  ): StepDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("placement")(placement)
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (arrowOffset != null) __obj.updateDynamic("arrowOffset")(arrowOffset.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (ctaLabel != null) __obj.updateDynamic("ctaLabel")(ctaLabel)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedElement)) __obj.updateDynamic("fixedElement")(fixedElement)
    if (!js.isUndefined(multipage)) __obj.updateDynamic("multipage")(multipage)
    if (!js.isUndefined(nextOnTargetClick)) __obj.updateDynamic("nextOnTargetClick")(nextOnTargetClick)
    if (onCTA != null) __obj.updateDynamic("onCTA")(onCTA.asInstanceOf[js.Any])
    if (onNext != null) __obj.updateDynamic("onNext")(onNext.asInstanceOf[js.Any])
    if (onPrev != null) __obj.updateDynamic("onPrev")(onPrev.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(showCTAButton)) __obj.updateDynamic("showCTAButton")(showCTAButton)
    if (!js.isUndefined(showNextButton)) __obj.updateDynamic("showNextButton")(showNextButton)
    if (!js.isUndefined(showPrevButton)) __obj.updateDynamic("showPrevButton")(showPrevButton)
    if (!js.isUndefined(showSkip)) __obj.updateDynamic("showSkip")(showSkip)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xOffset != null) __obj.updateDynamic("xOffset")(xOffset.asInstanceOf[js.Any])
    if (yOffset != null) __obj.updateDynamic("yOffset")(yOffset.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDefinition]
  }
}

