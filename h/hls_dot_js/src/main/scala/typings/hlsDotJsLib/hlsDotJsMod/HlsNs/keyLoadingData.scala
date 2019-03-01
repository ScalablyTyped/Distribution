package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interface destroyingData {}
trait keyLoadingData extends js.Object {
  var frag: Fragment
}

object keyLoadingData {
  @scala.inline
  def apply(frag: Fragment): keyLoadingData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frag")(frag)
    __obj.asInstanceOf[keyLoadingData]
  }
}

