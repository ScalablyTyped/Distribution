package typings.jqueryWindow.JQueryWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Button definition
@js.native
trait Button extends js.Object {
  /**
    **/
  var clazz: js.UndefOr[String] = js.native
  /**
    **/
  var id: String = js.native
  /**
    **/
  var image: String = js.native
  /**
    **/
  var style: js.UndefOr[String] = js.native
  /**
    **/
  var title: js.UndefOr[String] = js.native
  /**
    **/
  def callback(btn: Button, wnd: Window): Unit = js.native
}

object Button {
  @scala.inline
  def apply(callback: (Button, Window) => Unit, id: String, image: String): Button = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallback(value: (Button, Window) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setClazz(value: String): Self = this.set("clazz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClazz: Self = this.set("clazz", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

