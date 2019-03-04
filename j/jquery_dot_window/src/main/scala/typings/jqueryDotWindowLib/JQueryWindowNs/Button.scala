package typings
package jqueryDotWindowLib.JQueryWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Button definition
trait Button extends js.Object {
  /**
    **/
  var clazz: js.UndefOr[java.lang.String] = js.undefined
  /**
    **/
  var id: java.lang.String
  /**
    **/
  var image: java.lang.String
  /**
    **/
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    **/
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    **/
  def callback(btn: Button, wnd: Window): scala.Unit
}

object Button {
  @scala.inline
  def apply(
    callback: js.Function2[Button, Window, scala.Unit],
    id: java.lang.String,
    image: java.lang.String,
    clazz: java.lang.String = null,
    style: java.lang.String = null,
    title: java.lang.String = null
  ): Button = {
    val __obj = js.Dynamic.literal(callback = callback, id = id, image = image)
    if (clazz != null) __obj.updateDynamic("clazz")(clazz)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Button]
  }
}

