package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterSelect extends js.Object {
  var enterSelect: js.UndefOr[String] = js.native
  var suggestionIsOpen: js.UndefOr[String] = js.native
  var suggestionsCount: js.UndefOr[String] = js.native
  var suggestionsExist: js.UndefOr[String] = js.native
}

object EnterSelect {
  @scala.inline
  def apply(): EnterSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterSelect]
  }
  @scala.inline
  implicit class EnterSelectOps[Self <: EnterSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnterSelect(value: String): Self = this.set("enterSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterSelect: Self = this.set("enterSelect", js.undefined)
    @scala.inline
    def setSuggestionIsOpen(value: String): Self = this.set("suggestionIsOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionIsOpen: Self = this.set("suggestionIsOpen", js.undefined)
    @scala.inline
    def setSuggestionsCount(value: String): Self = this.set("suggestionsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsCount: Self = this.set("suggestionsCount", js.undefined)
    @scala.inline
    def setSuggestionsExist(value: String): Self = this.set("suggestionsExist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsExist: Self = this.set("suggestionsExist", js.undefined)
  }
  
}

