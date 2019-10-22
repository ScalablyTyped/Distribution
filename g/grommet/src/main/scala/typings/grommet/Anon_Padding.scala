package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Padding extends js.Object {
  var padding: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object Anon_Padding {
  @scala.inline
  def apply(padding: String = null, weight: Int | Double = null): Anon_Padding = {
    val __obj = js.Dynamic.literal()
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Padding]
  }
}

