package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TabContents extends js.Object {
  var tabContents: js.UndefOr[String] = js.undefined
}

object Anon_TabContents {
  @scala.inline
  def apply(tabContents: String = null): Anon_TabContents = {
    val __obj = js.Dynamic.literal()
    if (tabContents != null) __obj.updateDynamic("tabContents")(tabContents)
    __obj.asInstanceOf[Anon_TabContents]
  }
}

