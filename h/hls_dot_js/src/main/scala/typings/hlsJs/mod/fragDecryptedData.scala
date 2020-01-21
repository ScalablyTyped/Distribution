package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragDecryptedData extends js.Object {
  var frag: Fragment
  var id: String
  var payload: js.Any
  var stats: Stats
}

object fragDecryptedData {
  @scala.inline
  def apply(frag: Fragment, id: String, payload: js.Any, stats: Stats): fragDecryptedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[fragDecryptedData]
  }
}

