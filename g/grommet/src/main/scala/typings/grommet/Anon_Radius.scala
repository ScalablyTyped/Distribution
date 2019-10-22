package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Radius extends js.Object {
  var radius: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object Anon_Radius {
  @scala.inline
  def apply(radius: String = null, width: String = null): Anon_Radius = {
    val __obj = js.Dynamic.literal()
    if (radius != null) __obj.updateDynamic("radius")(radius)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Radius]
  }
}

