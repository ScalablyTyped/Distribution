package typings.johnnyFive.mod.IR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayOption extends js.Object {
  var emitter: Double | String
  var freq: js.UndefOr[Double] = js.undefined
  var pins: js.Array[Double | String]
}

object ArrayOption {
  @scala.inline
  def apply(emitter: Double | String, pins: js.Array[Double | String], freq: js.UndefOr[Double] = js.undefined): ArrayOption = {
    val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
    if (!js.isUndefined(freq)) __obj.updateDynamic("freq")(freq.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOption]
  }
}

