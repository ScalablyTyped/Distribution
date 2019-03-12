package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayReasonText extends js.Object {
  var displayReasonText: js.UndefOr[java.lang.String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]] = js.undefined
  var onSuccess: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var transferDisplayType: js.UndefOr[
    knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelTransferDisplayType
  ] = js.undefined
}

object Anon_DisplayReasonText {
  @scala.inline
  def apply(
    displayReasonText: java.lang.String = null,
    onError: /* message */ java.lang.String => scala.Unit = null,
    onSuccess: () => scala.Unit = null,
    transferDisplayType: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelTransferDisplayType = null
  ): Anon_DisplayReasonText = {
    val __obj = js.Dynamic.literal()
    if (displayReasonText != null) __obj.updateDynamic("displayReasonText")(displayReasonText)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction0(onSuccess))
    if (transferDisplayType != null) __obj.updateDynamic("transferDisplayType")(transferDisplayType)
    __obj.asInstanceOf[Anon_DisplayReasonText]
  }
}

