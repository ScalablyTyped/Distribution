package typings.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  def setEnabled(isEnable: String): Unit = js.native
  def setImagePath(imagePath: String): Unit = js.native
  def setTitle(title: String): Unit = js.native
}

object Item {
  @scala.inline
  def apply(setEnabled: String => Unit, setImagePath: String => Unit, setTitle: String => Unit): Item = {
    val __obj = js.Dynamic.literal(setEnabled = js.Any.fromFunction1(setEnabled), setImagePath = js.Any.fromFunction1(setImagePath), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
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
    def setSetEnabled(value: String => Unit): Self = this.set("setEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def setSetImagePath(value: String => Unit): Self = this.set("setImagePath", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: String => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
  }
  
}

