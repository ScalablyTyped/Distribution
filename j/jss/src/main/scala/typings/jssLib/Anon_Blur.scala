package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blur extends js.Object {
  var blur: jssLib.cssMod.Length
  var color: js.Any
  var inset: js.UndefOr[jssLib.jssLibStrings.inset] = js.undefined
  var spread: jssLib.cssMod.Length
  var x: jssLib.cssMod.Length
  var y: jssLib.cssMod.Length
}

object Anon_Blur {
  @scala.inline
  def apply(
    blur: jssLib.cssMod.Length,
    color: js.Any,
    spread: jssLib.cssMod.Length,
    x: jssLib.cssMod.Length,
    y: jssLib.cssMod.Length,
    inset: jssLib.jssLibStrings.inset = null
  ): Anon_Blur = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("spread")(spread.asInstanceOf[js.Any])
    __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset)
    __obj.asInstanceOf[Anon_Blur]
  }
}

