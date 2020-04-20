package typings.matterJs.mod

import typings.matterJs.matterJsStrings.mousedown
import typings.matterJs.matterJsStrings.mousemove
import typings.matterJs.matterJsStrings.mouseup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseEvent[T] extends IEvent[T] {
  @JSName("name")
  var name_IMouseEvent: mousedown | mousemove | mouseup
}

object IMouseEvent {
  @scala.inline
  def apply[T](name: mousedown | mousemove | mouseup, source: T): IMouseEvent[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEvent[T]]
  }
}

