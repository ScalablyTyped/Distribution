package typings.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IELangDBDelegates extends js.Object {
  var insertHandler: js.Function
  var modifyHandler: js.Function
  var removeHandler: js.Function
  var selectHandler: js.Function
}

object IELangDBDelegates {
  @scala.inline
  def apply(
    insertHandler: js.Function,
    modifyHandler: js.Function,
    removeHandler: js.Function,
    selectHandler: js.Function
  ): IELangDBDelegates = {
    val __obj = js.Dynamic.literal(insertHandler = insertHandler.asInstanceOf[js.Any], modifyHandler = modifyHandler.asInstanceOf[js.Any], removeHandler = removeHandler.asInstanceOf[js.Any], selectHandler = selectHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangDBDelegates]
  }
}

