package typings
package jsgraphLib.jsgraphMod.jsgraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colors extends js.Object {
  var black: jsgraphLib.jsgraphLibNumbers.`2`
  var gray: jsgraphLib.jsgraphLibNumbers.`1`
  var white: jsgraphLib.jsgraphLibNumbers.`0`
}

object colors {
  @scala.inline
  def apply(
    black: jsgraphLib.jsgraphLibNumbers.`2`,
    gray: jsgraphLib.jsgraphLibNumbers.`1`,
    white: jsgraphLib.jsgraphLibNumbers.`0`
  ): colors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("black")(black)
    __obj.updateDynamic("gray")(gray)
    __obj.updateDynamic("white")(white)
    __obj.asInstanceOf[colors]
  }
}

