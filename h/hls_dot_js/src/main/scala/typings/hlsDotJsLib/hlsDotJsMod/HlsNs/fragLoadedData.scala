package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragLoadedData extends js.Object {
  var frag: Fragment
  var payload: js.Any
}

object fragLoadedData {
  @scala.inline
  def apply(frag: Fragment, payload: js.Any): fragLoadedData = {
    val __obj = js.Dynamic.literal(frag = frag, payload = payload)
  
    __obj.asInstanceOf[fragLoadedData]
  }
}

