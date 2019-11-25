package typings.keycode.keycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasesMap extends js.Object {
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
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasesMap]
  }
}

