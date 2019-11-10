package typings.ink.inkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var ctrl: Boolean
  var downArrow: Boolean
  var escape: Boolean
  var leftArrow: Boolean
  var meta: Boolean
  var `return`: Boolean
  var rightArrow: Boolean
  var shift: Boolean
  var upArrow: Boolean
}

object Key {
  @scala.inline
  def apply(
    ctrl: Boolean,
    downArrow: Boolean,
    escape: Boolean,
    leftArrow: Boolean,
    meta: Boolean,
    `return`: Boolean,
    rightArrow: Boolean,
    shift: Boolean,
    upArrow: Boolean
  ): Key = {
    val __obj = js.Dynamic.literal(ctrl = ctrl, downArrow = downArrow, escape = escape, leftArrow = leftArrow, meta = meta, rightArrow = rightArrow, shift = shift, upArrow = upArrow)
    __obj.updateDynamic("return")(`return`)
    __obj.asInstanceOf[Key]
  }
}

