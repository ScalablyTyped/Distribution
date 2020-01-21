package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatum extends js.Object {
  var datum: js.UndefOr[js.Object] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
}

object AnonDatum {
  @scala.inline
  def apply(datum: js.Object = null, index: Int | Double = null): AnonDatum = {
    val __obj = js.Dynamic.literal()
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatum]
  }
}

