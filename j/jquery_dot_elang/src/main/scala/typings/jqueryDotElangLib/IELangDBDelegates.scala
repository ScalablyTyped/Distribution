package typings
package jqueryDotElangLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insertHandler")(insertHandler)
    __obj.updateDynamic("modifyHandler")(modifyHandler)
    __obj.updateDynamic("removeHandler")(removeHandler)
    __obj.updateDynamic("selectHandler")(selectHandler)
    __obj.asInstanceOf[IELangDBDelegates]
  }
}

