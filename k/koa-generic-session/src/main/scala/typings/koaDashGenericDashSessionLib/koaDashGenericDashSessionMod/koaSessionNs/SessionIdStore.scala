package typings
package koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaSessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionIdStore extends js.Object {
  def get(): js.Any
  def reset(): scala.Unit
  def set(sid: java.lang.String, session: Session): scala.Unit
}

object SessionIdStore {
  @scala.inline
  def apply(
    get: js.Function0[js.Any],
    reset: js.Function0[scala.Unit],
    set: js.Function2[java.lang.String, Session, scala.Unit]
  ): SessionIdStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[SessionIdStore]
  }
}

