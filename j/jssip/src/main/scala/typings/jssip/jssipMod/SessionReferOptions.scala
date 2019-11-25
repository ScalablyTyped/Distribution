package typings.jssip.jssipMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionReferOptions extends js.Object {
  var eventHandlers: js.UndefOr[StringDictionary[js.Function1[/* data */ js.Any, Unit]]] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var replaces: js.UndefOr[RTCSession] = js.undefined
}

object SessionReferOptions {
  @scala.inline
  def apply(
    eventHandlers: StringDictionary[js.Function1[/* data */ js.Any, Unit]] = null,
    extraHeaders: js.Array[String] = null,
    replaces: RTCSession = null
  ): SessionReferOptions = {
    val __obj = js.Dynamic.literal()
    if (eventHandlers != null) __obj.updateDynamic("eventHandlers")(eventHandlers.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (replaces != null) __obj.updateDynamic("replaces")(replaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionReferOptions]
  }
}

