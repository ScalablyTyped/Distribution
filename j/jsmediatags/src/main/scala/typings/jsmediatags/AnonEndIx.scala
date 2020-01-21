package typings.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndIx extends js.Object {
  var endIx: Double
  var insertIx: js.UndefOr[Double] = js.undefined
  var startIx: Double
}

object AnonEndIx {
  @scala.inline
  def apply(endIx: Double, startIx: Double, insertIx: Int | Double = null): AnonEndIx = {
    val __obj = js.Dynamic.literal(endIx = endIx.asInstanceOf[js.Any], startIx = startIx.asInstanceOf[js.Any])
    if (insertIx != null) __obj.updateDynamic("insertIx")(insertIx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndIx]
  }
}

