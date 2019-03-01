package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.Any
  var style: js.Any
  var width: js.Any
}

object Anon_Color {
  @scala.inline
  def apply(color: js.Any, style: js.Any, width: js.Any): Anon_Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Color]
  }
}

