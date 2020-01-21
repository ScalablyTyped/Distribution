package typings.hlsJs.mod

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
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[keyLoadingData]
  }
}

