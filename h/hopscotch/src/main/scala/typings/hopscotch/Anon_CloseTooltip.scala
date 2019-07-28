package typings.hopscotch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseTooltip extends js.Object {
  var closeTooltip: js.UndefOr[String] = js.undefined
  var doneBtn: js.UndefOr[String] = js.undefined
  var nextBtn: js.UndefOr[String] = js.undefined
  var prevBtn: js.UndefOr[String] = js.undefined
  var skipBtn: js.UndefOr[String] = js.undefined
  var stepNums: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_CloseTooltip {
  @scala.inline
  def apply(
    closeTooltip: String = null,
    doneBtn: String = null,
    nextBtn: String = null,
    prevBtn: String = null,
    skipBtn: String = null,
    stepNums: js.Array[String] = null
  ): Anon_CloseTooltip = {
    val __obj = js.Dynamic.literal()
    if (closeTooltip != null) __obj.updateDynamic("closeTooltip")(closeTooltip)
    if (doneBtn != null) __obj.updateDynamic("doneBtn")(doneBtn)
    if (nextBtn != null) __obj.updateDynamic("nextBtn")(nextBtn)
    if (prevBtn != null) __obj.updateDynamic("prevBtn")(prevBtn)
    if (skipBtn != null) __obj.updateDynamic("skipBtn")(skipBtn)
    if (stepNums != null) __obj.updateDynamic("stepNums")(stepNums)
    __obj.asInstanceOf[Anon_CloseTooltip]
  }
}

