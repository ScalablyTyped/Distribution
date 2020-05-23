package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContents extends js.Object {
  var tabContents: js.UndefOr[String] = js.undefined
}

object TabContents {
  @scala.inline
  def apply(tabContents: String = null): TabContents = {
    val __obj = js.Dynamic.literal()
    if (tabContents != null) __obj.updateDynamic("tabContents")(tabContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContents]
  }
}

