package typings.jsmediatags.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndIx extends js.Object {
  var endIx: Double
  var insertIx: js.UndefOr[Double] = js.undefined
  var startIx: Double
}

object EndIx {
  @scala.inline
  def apply(endIx: Double, startIx: Double, insertIx: js.UndefOr[Double] = js.undefined): EndIx = {
    val __obj = js.Dynamic.literal(endIx = endIx.asInstanceOf[js.Any], startIx = startIx.asInstanceOf[js.Any])
    if (!js.isUndefined(insertIx)) __obj.updateDynamic("insertIx")(insertIx.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIx]
  }
}

