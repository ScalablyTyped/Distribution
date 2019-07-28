package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgBrowseButtonMethods extends js.Object {
  def attachFilePicker(e: js.Object, isHidden: js.Object): Unit
  /**
  	 * $(".selector").igUpload("destroy");
  	 */
  def destroy(): Unit
  def getFilePicker(): Unit
}

object IgBrowseButtonMethods {
  @scala.inline
  def apply(attachFilePicker: (js.Object, js.Object) => Unit, destroy: () => Unit, getFilePicker: () => Unit): IgBrowseButtonMethods = {
    val __obj = js.Dynamic.literal(attachFilePicker = js.Any.fromFunction2(attachFilePicker), destroy = js.Any.fromFunction0(destroy), getFilePicker = js.Any.fromFunction0(getFilePicker))
  
    __obj.asInstanceOf[IgBrowseButtonMethods]
  }
}

