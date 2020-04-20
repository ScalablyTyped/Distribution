package typings.jupyterlabApputils.vdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUseSignalState[SENDER, ARGS] extends js.Object {
  var value: js.Tuple2[js.UndefOr[SENDER], js.UndefOr[ARGS]]
}

object IUseSignalState {
  @scala.inline
  def apply[SENDER, ARGS](value: js.Tuple2[js.UndefOr[SENDER], js.UndefOr[ARGS]]): IUseSignalState[SENDER, ARGS] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUseSignalState[SENDER, ARGS]]
  }
}

