package typings.jointjs.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateOptions extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.undefined
}

object RotateOptions {
  @scala.inline
  def apply(absolute: js.UndefOr[Boolean] = js.undefined): RotateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    __obj.asInstanceOf[RotateOptions]
  }
}

