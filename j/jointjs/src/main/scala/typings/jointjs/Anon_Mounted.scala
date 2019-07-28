package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mounted extends js.Object {
  var mounted: Double
  var unmounted: Double
}

object Anon_Mounted {
  @scala.inline
  def apply(mounted: Double, unmounted: Double): Anon_Mounted = {
    val __obj = js.Dynamic.literal(mounted = mounted, unmounted = unmounted)
  
    __obj.asInstanceOf[Anon_Mounted]
  }
}

