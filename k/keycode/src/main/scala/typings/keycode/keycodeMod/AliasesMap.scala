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
    val __obj = js.Dynamic.literal(break = break, caps = caps, cmd = cmd, control = control, ctl = ctl, del = del, escape = escape, ins = ins, option = option, pause = pause, pgdn = pgdn, pgup = pgup, spacebar = spacebar, spc = spc, windows = windows)
    __obj.updateDynamic("return")(`return`)
    __obj.asInstanceOf[AliasesMap]
  }
}

