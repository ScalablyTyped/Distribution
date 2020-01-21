package typings.johnnyFive.mod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixIC2Option extends js.Object {
  var addresses: js.UndefOr[js.Array[_]] = js.undefined
  var controller: String
  var dims: js.UndefOr[js.Any] = js.undefined
  var isBicolor: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
}

object MatrixIC2Option {
  @scala.inline
  def apply(
    controller: String,
    addresses: js.Array[_] = null,
    dims: js.Any = null,
    isBicolor: js.UndefOr[Boolean] = js.undefined,
    rotation: Int | Double = null
  ): MatrixIC2Option = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (dims != null) __obj.updateDynamic("dims")(dims.asInstanceOf[js.Any])
    if (!js.isUndefined(isBicolor)) __obj.updateDynamic("isBicolor")(isBicolor.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixIC2Option]
  }
}

