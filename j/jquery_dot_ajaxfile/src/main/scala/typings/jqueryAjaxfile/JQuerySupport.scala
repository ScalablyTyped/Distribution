package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  Collection of properties of the current browser
*/
trait JQuerySupport extends js.Object {
  var ajax: js.UndefOr[Boolean] = js.undefined
  var boxModel: js.UndefOr[Boolean] = js.undefined
  var changeBubbles: js.UndefOr[Boolean] = js.undefined
  var checkClone: js.UndefOr[Boolean] = js.undefined
  var checkOn: js.UndefOr[Boolean] = js.undefined
  var cors: js.UndefOr[Boolean] = js.undefined
  var cssFloat: js.UndefOr[Boolean] = js.undefined
  var hrefNormalized: js.UndefOr[Boolean] = js.undefined
  var htmlSerialize: js.UndefOr[Boolean] = js.undefined
  var leadingWhitespace: js.UndefOr[Boolean] = js.undefined
  var noCloneChecked: js.UndefOr[Boolean] = js.undefined
  var noCloneEvent: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Boolean] = js.undefined
  var optDisabled: js.UndefOr[Boolean] = js.undefined
  var optSelected: js.UndefOr[Boolean] = js.undefined
  var scriptEval: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var style: js.UndefOr[Boolean] = js.undefined
  var submitBubbles: js.UndefOr[Boolean] = js.undefined
  var tbody: js.UndefOr[Boolean] = js.undefined
}

object JQuerySupport {
  @scala.inline
  def apply(
    ajax: js.UndefOr[Boolean] = js.undefined,
    boxModel: js.UndefOr[Boolean] = js.undefined,
    changeBubbles: js.UndefOr[Boolean] = js.undefined,
    checkClone: js.UndefOr[Boolean] = js.undefined,
    checkOn: js.UndefOr[Boolean] = js.undefined,
    cors: js.UndefOr[Boolean] = js.undefined,
    cssFloat: js.UndefOr[Boolean] = js.undefined,
    hrefNormalized: js.UndefOr[Boolean] = js.undefined,
    htmlSerialize: js.UndefOr[Boolean] = js.undefined,
    leadingWhitespace: js.UndefOr[Boolean] = js.undefined,
    noCloneChecked: js.UndefOr[Boolean] = js.undefined,
    noCloneEvent: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Boolean] = js.undefined,
    optDisabled: js.UndefOr[Boolean] = js.undefined,
    optSelected: js.UndefOr[Boolean] = js.undefined,
    scriptEval: () => Boolean = null,
    style: js.UndefOr[Boolean] = js.undefined,
    submitBubbles: js.UndefOr[Boolean] = js.undefined,
    tbody: js.UndefOr[Boolean] = js.undefined
  ): JQuerySupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ajax)) __obj.updateDynamic("ajax")(ajax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boxModel)) __obj.updateDynamic("boxModel")(boxModel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(changeBubbles)) __obj.updateDynamic("changeBubbles")(changeBubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkClone)) __obj.updateDynamic("checkClone")(checkClone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkOn)) __obj.updateDynamic("checkOn")(checkOn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cssFloat)) __obj.updateDynamic("cssFloat")(cssFloat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hrefNormalized)) __obj.updateDynamic("hrefNormalized")(hrefNormalized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlSerialize)) __obj.updateDynamic("htmlSerialize")(htmlSerialize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leadingWhitespace)) __obj.updateDynamic("leadingWhitespace")(leadingWhitespace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noCloneChecked)) __obj.updateDynamic("noCloneChecked")(noCloneChecked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noCloneEvent)) __obj.updateDynamic("noCloneEvent")(noCloneEvent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optDisabled)) __obj.updateDynamic("optDisabled")(optDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optSelected)) __obj.updateDynamic("optSelected")(optSelected.get.asInstanceOf[js.Any])
    if (scriptEval != null) __obj.updateDynamic("scriptEval")(js.Any.fromFunction0(scriptEval))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.get.asInstanceOf[js.Any])
    if (!js.isUndefined(submitBubbles)) __obj.updateDynamic("submitBubbles")(submitBubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tbody)) __obj.updateDynamic("tbody")(tbody.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
}

