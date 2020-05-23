package typings.javascriptAstar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagonal extends js.Object {
  var diagonal: js.UndefOr[Boolean] = js.undefined
}

object Diagonal {
  @scala.inline
  def apply(diagonal: js.UndefOr[Boolean] = js.undefined): Diagonal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(diagonal)) __obj.updateDynamic("diagonal")(diagonal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagonal]
  }
}

