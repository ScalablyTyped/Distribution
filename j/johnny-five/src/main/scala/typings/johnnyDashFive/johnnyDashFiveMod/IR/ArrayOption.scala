package typings.johnnyDashFive.johnnyDashFiveMod.IR

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
  def apply(emitter: Double | String, pins: js.Array[Double | String], freq: Int | Double = null): ArrayOption = {
    val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], pins = pins)
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOption]
  }
}

