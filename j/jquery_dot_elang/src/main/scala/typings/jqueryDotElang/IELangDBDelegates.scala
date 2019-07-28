package typings.jqueryDotElang

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
    val __obj = js.Dynamic.literal(insertHandler = insertHandler, modifyHandler = modifyHandler, removeHandler = removeHandler, selectHandler = selectHandler)
  
    __obj.asInstanceOf[IELangDBDelegates]
  }
}

