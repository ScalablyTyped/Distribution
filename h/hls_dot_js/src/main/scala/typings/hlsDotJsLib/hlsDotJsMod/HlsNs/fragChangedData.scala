package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragChangedData extends js.Object {
  var frag: Fragment
  var id: java.lang.String
}

object fragChangedData {
  @scala.inline
  def apply(frag: Fragment, id: java.lang.String): fragChangedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frag")(frag)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[fragChangedData]
  }
}

