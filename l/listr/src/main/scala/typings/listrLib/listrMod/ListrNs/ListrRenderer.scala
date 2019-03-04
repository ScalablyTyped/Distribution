package typings
package listrLib.listrMod.ListrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrRenderer extends js.Object {
  var nonTTY: scala.Boolean
  def end(): scala.Unit
  def render(): scala.Unit
}

object ListrRenderer {
  @scala.inline
  def apply(end: js.Function0[scala.Unit], nonTTY: scala.Boolean, render: js.Function0[scala.Unit]): ListrRenderer = {
    val __obj = js.Dynamic.literal(end = end, nonTTY = nonTTY, render = render)
  
    __obj.asInstanceOf[ListrRenderer]
  }
}

