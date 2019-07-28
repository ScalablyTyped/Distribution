package typings.jqueryDotNicescroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Left extends js.Object {
  var left: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object Anon_Left {
  @scala.inline
  def apply(left: Int | Double = null, top: Int | Double = null): Anon_Left = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Left]
  }
}

