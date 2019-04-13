package typings
package hlsDotJsLib.hlsDotJsMod

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
    val __obj = js.Dynamic.literal(frag = frag, id = id, payload = payload, stats = stats)
  
    __obj.asInstanceOf[fragDecryptedData]
  }
}

