package typings.atHapiHapi

import typings.atHapiHapi.atHapiHapiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var log: js.UndefOr[js.Array[String] | `false`] = js.undefined
  var request: js.UndefOr[js.Array[String] | `false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(log: js.Array[String] | `false` = null, request: js.Array[String] | `false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

