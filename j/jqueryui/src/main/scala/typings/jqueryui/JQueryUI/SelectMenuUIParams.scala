package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectMenuUIParams extends js.Object {
  var item: js.UndefOr[JQuery] = js.undefined
}

object SelectMenuUIParams {
  @scala.inline
  def apply(item: JQuery = null): SelectMenuUIParams = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[SelectMenuUIParams]
  }
}

