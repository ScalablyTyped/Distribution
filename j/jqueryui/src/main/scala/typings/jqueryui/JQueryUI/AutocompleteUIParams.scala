package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteUIParams extends js.Object {
  var content: js.UndefOr[js.Any] = js.undefined
  /**
    * The item selected from the menu, if any. Otherwise the property is null
    */
  var item: js.UndefOr[js.Any] = js.undefined
}

object AutocompleteUIParams {
  @scala.inline
  def apply(content: js.Any = null, item: js.Any = null): AutocompleteUIParams = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteUIParams]
  }
}

