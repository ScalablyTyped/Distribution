package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Weight extends js.Object {
  var weight: js.UndefOr[String] = js.undefined
}

object Anon_Weight {
  @scala.inline
  def apply(weight: String = null): Anon_Weight = {
    val __obj = js.Dynamic.literal()
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[Anon_Weight]
  }
}

