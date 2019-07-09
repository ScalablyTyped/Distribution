package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mounted extends js.Object {
  var mounted: scala.Double
  var unmounted: scala.Double
}

object Anon_Mounted {
  @scala.inline
  def apply(mounted: scala.Double, unmounted: scala.Double): Anon_Mounted = {
    val __obj = js.Dynamic.literal(mounted = mounted, unmounted = unmounted)
  
    __obj.asInstanceOf[Anon_Mounted]
  }
}

