package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteClasses extends js.Object {
  var `ui-autocomplete`: js.UndefOr[String] = js.undefined
  var `ui-autocomplete-input`: js.UndefOr[String] = js.undefined
}

object AutocompleteClasses {
  @scala.inline
  def apply(`ui-autocomplete`: String = null, `ui-autocomplete-input`: String = null): AutocompleteClasses = {
    val __obj = js.Dynamic.literal()
    if (`ui-autocomplete` != null) __obj.updateDynamic("ui-autocomplete")(`ui-autocomplete`)
    if (`ui-autocomplete-input` != null) __obj.updateDynamic("ui-autocomplete-input")(`ui-autocomplete-input`)
    __obj.asInstanceOf[AutocompleteClasses]
  }
}

