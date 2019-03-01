package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashComponentsPanel extends js.Object {
  def addItemToDocument(): js.Any
  def reload(): js.Any
}

object FlashComponentsPanel {
  @scala.inline
  def apply(addItemToDocument: js.Function0[js.Any], reload: js.Function0[js.Any]): FlashComponentsPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addItemToDocument")(addItemToDocument)
    __obj.updateDynamic("reload")(reload)
    __obj.asInstanceOf[FlashComponentsPanel]
  }
}

