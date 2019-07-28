package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var width: Double
}

object Anon_Height {
  @scala.inline
  def apply(width: Double, height: Int | Double = null): Anon_Height = {
    val __obj = js.Dynamic.literal(width = width)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

