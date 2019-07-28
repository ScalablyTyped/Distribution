package typings.joi.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexOptions extends js.Object {
  /**
    * hex decoded representation must be byte aligned.
    * @default false
    */
  var byteAligned: js.UndefOr[Boolean] = js.undefined
}

object HexOptions {
  @scala.inline
  def apply(byteAligned: js.UndefOr[Boolean] = js.undefined): HexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(byteAligned)) __obj.updateDynamic("byteAligned")(byteAligned)
    __obj.asInstanceOf[HexOptions]
  }
}

