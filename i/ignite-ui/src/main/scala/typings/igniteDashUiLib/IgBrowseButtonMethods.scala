package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgBrowseButtonMethods extends js.Object {
  def attachFilePicker(e: js.Object, isHidden: js.Object): scala.Unit
  /**
  	 * $(".selector").igUpload("destroy");
  	 */
  def destroy(): scala.Unit
  def getFilePicker(): scala.Unit
}

object IgBrowseButtonMethods {
  @scala.inline
  def apply(
    attachFilePicker: (js.Object, js.Object) => scala.Unit,
    destroy: () => scala.Unit,
    getFilePicker: () => scala.Unit
  ): IgBrowseButtonMethods = {
    val __obj = js.Dynamic.literal(attachFilePicker = js.Any.fromFunction2(attachFilePicker), destroy = js.Any.fromFunction0(destroy), getFilePicker = js.Any.fromFunction0(getFilePicker))
  
    __obj.asInstanceOf[IgBrowseButtonMethods]
  }
}

