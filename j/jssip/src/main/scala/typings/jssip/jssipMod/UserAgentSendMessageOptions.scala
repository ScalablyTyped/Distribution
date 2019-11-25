package typings.jssip.jssipMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentSendMessageOptions extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var eventHandlers: js.UndefOr[StringDictionary[js.Function1[/* data */ js.Any, Unit]]] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}

object UserAgentSendMessageOptions {
  @scala.inline
  def apply(
    contentType: String = null,
    eventHandlers: StringDictionary[js.Function1[/* data */ js.Any, Unit]] = null,
    extraHeaders: js.Array[String] = null
  ): UserAgentSendMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (eventHandlers != null) __obj.updateDynamic("eventHandlers")(eventHandlers.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentSendMessageOptions]
  }
}

