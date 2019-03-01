package typings
package atMaterialMenuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomLeft extends js.Object {
  var bottom: js.UndefOr[java.lang.String]
  var left: js.UndefOr[java.lang.String]
  var right: js.UndefOr[java.lang.String]
  var top: js.UndefOr[java.lang.String]
}

object Anon_BottomLeft {
  @scala.inline
  def apply(
    bottom: java.lang.String = null,
    left: java.lang.String = null,
    right: java.lang.String = null,
    top: java.lang.String = null
  ): Anon_BottomLeft = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Anon_BottomLeft]
  }
}

