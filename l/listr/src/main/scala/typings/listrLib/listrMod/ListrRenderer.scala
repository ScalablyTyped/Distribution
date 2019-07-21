package typings
package listrLib.listrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrRenderer extends js.Object {
  def end(err: stdLib.Error): scala.Unit
  def render(): scala.Unit
}

object ListrRenderer {
  @scala.inline
  def apply(end: stdLib.Error => scala.Unit, render: () => scala.Unit): ListrRenderer = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[ListrRenderer]
  }
}

