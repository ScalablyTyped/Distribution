package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgBrowseButtonMethods extends js.Object {
  def attachFilePicker(e: js.Object, isHidden: js.Object): Unit = js.native
  /**
    * $(".selector").igUpload("destroy");
    */
  def destroy(): Unit = js.native
  def getFilePicker(): Unit = js.native
}

object IgBrowseButtonMethods {
  @scala.inline
  def apply(attachFilePicker: (js.Object, js.Object) => Unit, destroy: () => Unit, getFilePicker: () => Unit): IgBrowseButtonMethods = {
    val __obj = js.Dynamic.literal(attachFilePicker = js.Any.fromFunction2(attachFilePicker), destroy = js.Any.fromFunction0(destroy), getFilePicker = js.Any.fromFunction0(getFilePicker))
    __obj.asInstanceOf[IgBrowseButtonMethods]
  }
  @scala.inline
  implicit class IgBrowseButtonMethodsOps[Self <: IgBrowseButtonMethods] (val x: Self) extends AnyVal {
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
    def setAttachFilePicker(value: (js.Object, js.Object) => Unit): Self = this.set("attachFilePicker", js.Any.fromFunction2(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFilePicker(value: () => Unit): Self = this.set("getFilePicker", js.Any.fromFunction0(value))
  }
  
}

