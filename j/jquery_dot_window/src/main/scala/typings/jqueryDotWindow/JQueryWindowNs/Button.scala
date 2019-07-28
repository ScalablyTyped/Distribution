package typings.jqueryDotWindow.JQueryWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Button definition
trait Button extends js.Object {
  /**
    **/
  var clazz: js.UndefOr[String] = js.undefined
  /**
    **/
  var id: String
  /**
    **/
  var image: String
  /**
    **/
  var style: js.UndefOr[String] = js.undefined
  /**
    **/
  var title: js.UndefOr[String] = js.undefined
  /**
    **/
  def callback(btn: Button, wnd: Window): Unit
}

object Button {
  @scala.inline
  def apply(
    callback: (Button, Window) => Unit,
    id: String,
    image: String,
    clazz: String = null,
    style: String = null,
    title: String = null
  ): Button = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), id = id, image = image)
    if (clazz != null) __obj.updateDynamic("clazz")(clazz)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Button]
  }
}

