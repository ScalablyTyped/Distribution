package typings.koaSession.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rolling extends js.Object {
  var rolling: js.UndefOr[Boolean] = js.undefined
}

object Rolling {
  @scala.inline
  def apply(rolling: js.UndefOr[Boolean] = js.undefined): Rolling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rolling]
  }
}

