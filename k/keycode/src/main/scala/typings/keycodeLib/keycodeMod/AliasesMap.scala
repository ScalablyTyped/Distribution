package typings
package keycodeLib.keycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasesMap extends js.Object {
  var break: scala.Double
  var caps: scala.Double
  var cmd: scala.Double
  var control: scala.Double
  var ctl: scala.Double
  var del: scala.Double
  var escape: scala.Double
  var ins: scala.Double
  var option: scala.Double
  var pause: scala.Double
  var pgdn: scala.Double
  var pgup: scala.Double
  var `return`: scala.Double
  var spacebar: scala.Double
  var spc: scala.Double
  var windows: scala.Double
}

object AliasesMap {
  @scala.inline
  def apply(
    break: scala.Double,
    caps: scala.Double,
    cmd: scala.Double,
    control: scala.Double,
    ctl: scala.Double,
    del: scala.Double,
    escape: scala.Double,
    ins: scala.Double,
    option: scala.Double,
    pause: scala.Double,
    pgdn: scala.Double,
    pgup: scala.Double,
    `return`: scala.Double,
    spacebar: scala.Double,
    spc: scala.Double,
    windows: scala.Double
  ): AliasesMap = {
    val __obj = js.Dynamic.literal(break = break, caps = caps, cmd = cmd, control = control, ctl = ctl, del = del, escape = escape, ins = ins, option = option, pause = pause, pgdn = pgdn, pgup = pgup, spacebar = spacebar, spc = spc, windows = windows)
    __obj.updateDynamic("return")(`return`)
    __obj.asInstanceOf[AliasesMap]
  }
}

