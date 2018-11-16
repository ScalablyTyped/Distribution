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

