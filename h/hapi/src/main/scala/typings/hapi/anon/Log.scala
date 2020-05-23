package typings.hapi.anon

import typings.hapi.hapiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  var log: js.UndefOr[js.Array[String] | `false`] = js.undefined
  var request: js.UndefOr[js.Array[String] | `false`] = js.undefined
}

object Log {
  @scala.inline
  def apply(log: js.Array[String] | `false` = null, request: js.Array[String] | `false` = null): Log = {
    val __obj = js.Dynamic.literal()
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
}

