package typings.keycode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasesMap extends js.Object {
  @JSName("\u2325")
  var Optionkey: Double
  @JSName("\u2318")
  var Placeofinterestsign: Double
  @JSName("\u2303")
  var Uparrowhead: Double
  @JSName("\u21E7")
  var Upwardswhitearrow: Double
  var break: Double
  var caps: Double
  var cmd: Double
  var control: Double
  var ctl: Double
  var del: Double
  var escape: Double
  var ins: Double
  var option: Double
  var pause: Double
  var pgdn: Double
  var pgup: Double
  var `return`: Double
  var spacebar: Double
  var spc: Double
  var windows: Double
}

object AliasesMap {
  @scala.inline
  def apply(
    Optionkey: Double,
    Placeofinterestsign: Double,
    Uparrowhead: Double,
    Upwardswhitearrow: Double,
    break: Double,
    caps: Double,
    cmd: Double,
    control: Double,
    ctl: Double,
    del: Double,
    escape: Double,
    ins: Double,
    option: Double,
    pause: Double,
    pgdn: Double,
    pgup: Double,
    `return`: Double,
    spacebar: Double,
    spc: Double,
    windows: Double
  ): AliasesMap = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], caps = caps.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], ctl = ctl.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pgdn = pgdn.asInstanceOf[js.Any], pgup = pgup.asInstanceOf[js.Any], spacebar = spacebar.asInstanceOf[js.Any], spc = spc.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.updateDynamic("\u2325")(Optionkey.asInstanceOf[js.Any])
    __obj.updateDynamic("\u2318")(Placeofinterestsign.asInstanceOf[js.Any])
    __obj.updateDynamic("\u2303")(Uparrowhead.asInstanceOf[js.Any])
    __obj.updateDynamic("\u21E7")(Upwardswhitearrow.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasesMap]
  }
}

