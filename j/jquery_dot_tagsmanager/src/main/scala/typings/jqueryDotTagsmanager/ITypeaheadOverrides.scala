package typings.jqueryDotTagsmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypeaheadOverrides extends js.Object {
  var instanceSelectHandler: js.UndefOr[js.Function] = js.undefined
  var select: js.UndefOr[js.Function] = js.undefined
  var selectedClass: js.UndefOr[String] = js.undefined
}

object ITypeaheadOverrides {
  @scala.inline
  def apply(
    instanceSelectHandler: js.Function = null,
    select: js.Function = null,
    selectedClass: String = null
  ): ITypeaheadOverrides = {
    val __obj = js.Dynamic.literal()
    if (instanceSelectHandler != null) __obj.updateDynamic("instanceSelectHandler")(instanceSelectHandler.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (selectedClass != null) __obj.updateDynamic("selectedClass")(selectedClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeaheadOverrides]
  }
}

