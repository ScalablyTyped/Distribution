package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnterSelect extends js.Object {
  var enterSelect: js.UndefOr[java.lang.String] = js.undefined
  var suggestionIsOpen: js.UndefOr[java.lang.String] = js.undefined
  var suggestionsCount: js.UndefOr[java.lang.String] = js.undefined
  var suggestionsExist: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EnterSelect {
  @scala.inline
  def apply(
    enterSelect: java.lang.String = null,
    suggestionIsOpen: java.lang.String = null,
    suggestionsCount: java.lang.String = null,
    suggestionsExist: java.lang.String = null
  ): Anon_EnterSelect = {
    val __obj = js.Dynamic.literal()
    if (enterSelect != null) __obj.updateDynamic("enterSelect")(enterSelect)
    if (suggestionIsOpen != null) __obj.updateDynamic("suggestionIsOpen")(suggestionIsOpen)
    if (suggestionsCount != null) __obj.updateDynamic("suggestionsCount")(suggestionsCount)
    if (suggestionsExist != null) __obj.updateDynamic("suggestionsExist")(suggestionsExist)
    __obj.asInstanceOf[Anon_EnterSelect]
  }
}

