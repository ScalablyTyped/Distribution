package typings.javascriptDashAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Diagonal extends js.Object {
  var diagonal: js.UndefOr[Boolean] = js.undefined
}

object Anon_Diagonal {
  @scala.inline
  def apply(diagonal: js.UndefOr[Boolean] = js.undefined): Anon_Diagonal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(diagonal)) __obj.updateDynamic("diagonal")(diagonal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Diagonal]
  }
}

