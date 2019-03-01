package typings
package koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaSessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cookie: js.Any
}

object Session {
  @scala.inline
  def apply(
    cookie: js.Any,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Session = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookie")(cookie)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Session]
  }
}

