package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragDecryptedData extends js.Object {
  var frag: Fragment
  var id: java.lang.String
  var payload: js.Any
  var stats: Stats
}

object fragDecryptedData {
  @scala.inline
  def apply(frag: Fragment, id: java.lang.String, payload: js.Any, stats: Stats): fragDecryptedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frag")(frag)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[fragDecryptedData]
  }
}

