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
    val __obj = js.Dynamic.literal(`return` = `return`)
    __obj.updateDynamic("break")(break)
    __obj.updateDynamic("caps")(caps)
    __obj.updateDynamic("cmd")(cmd)
    __obj.updateDynamic("control")(control)
    __obj.updateDynamic("ctl")(ctl)
    __obj.updateDynamic("del")(del)
    __obj.updateDynamic("escape")(escape)
    __obj.updateDynamic("ins")(ins)
    __obj.updateDynamic("option")(option)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("pgdn")(pgdn)
    __obj.updateDynamic("pgup")(pgup)
    __obj.updateDynamic("spacebar")(spacebar)
    __obj.updateDynamic("spc")(spc)
    __obj.updateDynamic("windows")(windows)
    __obj.asInstanceOf[AliasesMap]
  }
}

