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
  def apply(end: () => scala.Unit, nonTTY: scala.Boolean, render: () => scala.Unit): ListrRenderer = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), nonTTY = nonTTY, render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[ListrRenderer]
  }
}

