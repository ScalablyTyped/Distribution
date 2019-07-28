package typings.knuddelsDashUserappsDashApi

import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod.Global.KnuddelTransferDisplayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayReasonText extends js.Object {
  var displayReasonText: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
  var transferDisplayType: js.UndefOr[KnuddelTransferDisplayType] = js.undefined
}

object Anon_DisplayReasonText {
  @scala.inline
  def apply(
    displayReasonText: String = null,
    onError: /* message */ String => Unit = null,
    onSuccess: () => Unit = null,
    transferDisplayType: KnuddelTransferDisplayType = null
  ): Anon_DisplayReasonText = {
    val __obj = js.Dynamic.literal()
    if (displayReasonText != null) __obj.updateDynamic("displayReasonText")(displayReasonText)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction0(onSuccess))
    if (transferDisplayType != null) __obj.updateDynamic("transferDisplayType")(transferDisplayType)
    __obj.asInstanceOf[Anon_DisplayReasonText]
  }
}

