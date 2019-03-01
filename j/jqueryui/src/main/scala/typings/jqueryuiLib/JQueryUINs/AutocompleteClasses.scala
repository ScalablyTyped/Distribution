package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteClasses extends js.Object {
  var `ui-autocomplete`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-autocomplete-input`: js.UndefOr[java.lang.String] = js.undefined
}

object AutocompleteClasses {
  @scala.inline
  def apply(`ui-autocomplete`: java.lang.String = null, `ui-autocomplete-input`: java.lang.String = null): AutocompleteClasses = {
    val __obj = js.Dynamic.literal()
    if (`ui-autocomplete` != null) __obj.updateDynamic("ui-autocomplete")(`ui-autocomplete`)
    if (`ui-autocomplete-input` != null) __obj.updateDynamic("ui-autocomplete-input")(`ui-autocomplete-input`)
    __obj.asInstanceOf[AutocompleteClasses]
  }
}

