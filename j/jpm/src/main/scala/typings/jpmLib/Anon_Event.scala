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
    onAttach: js.Function1[/* event */ jpmLib.FFAddonSDKNs.FrameEvent, _] = null,
    onDetach: js.Function1[/* event */ jpmLib.FFAddonSDKNs.FrameEvent, _] = null,
    onLoad: js.Function1[/* event */ jpmLib.FFAddonSDKNs.FrameEvent, _] = null,
    onMessage: js.Function1[/* message */ jpmLib.FFAddonSDKNs.FrameEvent, _] = null,
    onReady: js.Function1[/* event */ jpmLib.FFAddonSDKNs.FrameEvent, _] = null
  ): Anon_Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onAttach != null) __obj.updateDynamic("onAttach")(onAttach)
    if (onDetach != null) __obj.updateDynamic("onDetach")(onDetach)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onMessage != null) __obj.updateDynamic("onMessage")(onMessage)
    if (onReady != null) __obj.updateDynamic("onReady")(onReady)
    __obj.asInstanceOf[Anon_Event]
  }
}

