package typings.koaDashGenericDashSession.koaDashGenericDashSessionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session
  extends /* key */ StringDictionary[js.Any] {
  var cookie: js.Any
}

object Session {
  @scala.inline
  def apply(cookie: js.Any, StringDictionary: /* key */ StringDictionary[js.Any] = null): Session = {
    val __obj = js.Dynamic.literal(cookie = cookie)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Session]
  }
}

