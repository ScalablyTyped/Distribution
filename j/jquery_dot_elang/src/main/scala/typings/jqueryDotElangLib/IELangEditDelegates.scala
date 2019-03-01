package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ELangEdit
trait IELangEditDelegates extends js.Object {
  var btnAddClickHandler: js.Function
  var btnAddHandler: js.Function
  var insertCallback: js.Function
  var insertHandler: js.Function
  var modifyCallback: js.Function
  var modifyHandler: js.Function
  var removeCallback: js.Function
  var removeHandler: js.Function
  var selectCallback: js.Function
  var selectHandler: js.Function
}

object IELangEditDelegates {
  @scala.inline
  def apply(
    btnAddClickHandler: js.Function,
    btnAddHandler: js.Function,
    insertCallback: js.Function,
    insertHandler: js.Function,
    modifyCallback: js.Function,
    modifyHandler: js.Function,
    removeCallback: js.Function,
    removeHandler: js.Function,
    selectCallback: js.Function,
    selectHandler: js.Function
  ): IELangEditDelegates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("btnAddClickHandler")(btnAddClickHandler)
    __obj.updateDynamic("btnAddHandler")(btnAddHandler)
    __obj.updateDynamic("insertCallback")(insertCallback)
    __obj.updateDynamic("insertHandler")(insertHandler)
    __obj.updateDynamic("modifyCallback")(modifyCallback)
    __obj.updateDynamic("modifyHandler")(modifyHandler)
    __obj.updateDynamic("removeCallback")(removeCallback)
    __obj.updateDynamic("removeHandler")(removeHandler)
    __obj.updateDynamic("selectCallback")(selectCallback)
    __obj.updateDynamic("selectHandler")(selectHandler)
    __obj.asInstanceOf[IELangEditDelegates]
  }
}

