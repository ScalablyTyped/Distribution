package typings.jpm

import typings.jpm.FFAddonSDK.FrameEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var onAttach: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.undefined
  var onDetach: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* message */ FrameEvent, _]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* event */ FrameEvent, _]] = js.undefined
  var url: String
}

object AnonName {
  @scala.inline
  def apply(
    url: String,
    name: String = null,
    onAttach: /* event */ FrameEvent => _ = null,
    onDetach: /* event */ FrameEvent => _ = null,
    onLoad: /* event */ FrameEvent => _ = null,
    onMessage: /* message */ FrameEvent => _ = null,
    onReady: /* event */ FrameEvent => _ = null
  ): AnonName = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAttach != null) __obj.updateDynamic("onAttach")(js.Any.fromFunction1(onAttach))
    if (onDetach != null) __obj.updateDynamic("onDetach")(js.Any.fromFunction1(onDetach))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    __obj.asInstanceOf[AnonName]
  }
}

