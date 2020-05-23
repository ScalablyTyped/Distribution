package typings.hopscotch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseTooltip extends js.Object {
  var closeTooltip: js.UndefOr[String] = js.undefined
  var doneBtn: js.UndefOr[String] = js.undefined
  var nextBtn: js.UndefOr[String] = js.undefined
  var prevBtn: js.UndefOr[String] = js.undefined
  var skipBtn: js.UndefOr[String] = js.undefined
  var stepNums: js.UndefOr[js.Array[String]] = js.undefined
}

object CloseTooltip {
  @scala.inline
  def apply(
    closeTooltip: String = null,
    doneBtn: String = null,
    nextBtn: String = null,
    prevBtn: String = null,
    skipBtn: String = null,
    stepNums: js.Array[String] = null
  ): CloseTooltip = {
    val __obj = js.Dynamic.literal()
    if (closeTooltip != null) __obj.updateDynamic("closeTooltip")(closeTooltip.asInstanceOf[js.Any])
    if (doneBtn != null) __obj.updateDynamic("doneBtn")(doneBtn.asInstanceOf[js.Any])
    if (nextBtn != null) __obj.updateDynamic("nextBtn")(nextBtn.asInstanceOf[js.Any])
    if (prevBtn != null) __obj.updateDynamic("prevBtn")(prevBtn.asInstanceOf[js.Any])
    if (skipBtn != null) __obj.updateDynamic("skipBtn")(skipBtn.asInstanceOf[js.Any])
    if (stepNums != null) __obj.updateDynamic("stepNums")(stepNums.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseTooltip]
  }
}

