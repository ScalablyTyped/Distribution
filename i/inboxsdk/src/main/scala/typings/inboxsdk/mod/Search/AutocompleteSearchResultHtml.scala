package typings.inboxsdk.mod.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteSearchResultHtml
  extends AutocompleteSearchResultBase
     with AutocompleteSearchResult {
  var descriptionHTML: String = js.native
  var nameHTML: String = js.native
}

object AutocompleteSearchResultHtml {
  @scala.inline
  def apply(descriptionHTML: String, nameHTML: String): AutocompleteSearchResultHtml = {
    val __obj = js.Dynamic.literal(descriptionHTML = descriptionHTML.asInstanceOf[js.Any], nameHTML = nameHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteSearchResultHtml]
  }
  @scala.inline
  implicit class AutocompleteSearchResultHtmlOps[Self <: AutocompleteSearchResultHtml] (val x: Self) extends AnyVal {
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
    def setDescriptionHTML(value: String): Self = this.set("descriptionHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameHTML(value: String): Self = this.set("nameHTML", value.asInstanceOf[js.Any])
  }
  
}

