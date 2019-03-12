package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onAttach: js.UndefOr[js.Function1[/* event */ jpmLib.FFAddonSDKNs.FrameEvent, _]] = js.undefined
  var onDetach: js.UndefOr[js.Function1[/* event */ jpmLib.FFAddonSDKNs.FrameEvent, _]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* event */ jpmLib.FFAddonSDKNs.FrameEvent, _]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* message */ jpmLib.FFAddonSDKNs.FrameEvent, _]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* event */ jpmLib.FFAddonSDKNs.FrameEvent, _]] = js.undefined
  var url: java.lang.String
}

object Anon_Event {
  @scala.inline
  def apply(
    url: java.lang.String,
    name: java.lang.String = null,
    onAttach: /* event */ jpmLib.FFAddonSDKNs.FrameEvent => _ = null,
    onDetach: /* event */ jpmLib.FFAddonSDKNs.FrameEvent => _ = null,
    onLoad: /* event */ jpmLib.FFAddonSDKNs.FrameEvent => _ = null,
    onMessage: /* message */ jpmLib.FFAddonSDKNs.FrameEvent => _ = null,
    onReady: /* event */ jpmLib.FFAddonSDKNs.FrameEvent => _ = null
  ): Anon_Event = {
    val __obj = js.Dynamic.literal(url = url)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onAttach != null) __obj.updateDynamic("onAttach")(js.Any.fromFunction1(onAttach))
    if (onDetach != null) __obj.updateDynamic("onDetach")(js.Any.fromFunction1(onDetach))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    __obj.asInstanceOf[Anon_Event]
  }
}

