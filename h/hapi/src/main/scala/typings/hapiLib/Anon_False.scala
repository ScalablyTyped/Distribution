package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var log: js.UndefOr[js.Array[java.lang.String] | hapiLib.hapiLibNumbers.`false`] = js.undefined
  var request: js.UndefOr[js.Array[java.lang.String] | hapiLib.hapiLibNumbers.`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(
    log: js.Array[java.lang.String] | hapiLib.hapiLibNumbers.`false` = null,
    request: js.Array[java.lang.String] | hapiLib.hapiLibNumbers.`false` = null
  ): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

