package typings.jqueryAjaxfile.AjaxFileKnockout

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileInputWrapper extends js.Object {
  def fileSelected(): Boolean = js.native
  def getElement(): HTMLInputElement = js.native
}

object IFileInputWrapper {
  @scala.inline
  def apply(fileSelected: () => Boolean, getElement: () => HTMLInputElement): IFileInputWrapper = {
    val __obj = js.Dynamic.literal(fileSelected = js.Any.fromFunction0(fileSelected), getElement = js.Any.fromFunction0(getElement))
    __obj.asInstanceOf[IFileInputWrapper]
  }
  @scala.inline
  implicit class IFileInputWrapperOps[Self <: IFileInputWrapper] (val x: Self) extends AnyVal {
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
    def setFileSelected(value: () => Boolean): Self = this.set("fileSelected", js.Any.fromFunction0(value))
    @scala.inline
    def setGetElement(value: () => HTMLInputElement): Self = this.set("getElement", js.Any.fromFunction0(value))
  }
  
}

