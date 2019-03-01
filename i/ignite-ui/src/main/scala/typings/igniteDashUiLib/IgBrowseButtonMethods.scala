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
    attachFilePicker: js.Function2[js.Object, js.Object, scala.Unit],
    destroy: js.Function0[scala.Unit],
    getFilePicker: js.Function0[scala.Unit]
  ): IgBrowseButtonMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachFilePicker")(attachFilePicker)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("getFilePicker")(getFilePicker)
    __obj.asInstanceOf[IgBrowseButtonMethods]
  }
}

