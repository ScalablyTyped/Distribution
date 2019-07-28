package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdaptiveBinaryIndices extends js.Object {
  var adaptiveBinaryIndices: js.UndefOr[Boolean] = js.undefined
}

object Anon_AdaptiveBinaryIndices {
  @scala.inline
  def apply(adaptiveBinaryIndices: js.UndefOr[Boolean] = js.undefined): Anon_AdaptiveBinaryIndices = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adaptiveBinaryIndices)) __obj.updateDynamic("adaptiveBinaryIndices")(adaptiveBinaryIndices)
    __obj.asInstanceOf[Anon_AdaptiveBinaryIndices]
  }
}

