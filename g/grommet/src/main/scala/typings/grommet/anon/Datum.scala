package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datum extends js.Object {
  var datum: js.UndefOr[js.Object] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
}

object Datum {
  @scala.inline
  def apply(datum: js.Object = null, index: js.UndefOr[Double] = js.undefined): Datum = {
    val __obj = js.Dynamic.literal()
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datum]
  }
}

