package typings
package atMapboxSphericalmercatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Size extends js.Object {
  var size: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Size {
  @scala.inline
  def apply(size: scala.Int | scala.Double = null): Anon_Size = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Size]
  }
}

