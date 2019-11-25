package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ZIndex extends js.Object {
  var zIndex: js.UndefOr[String] = js.undefined
}

object Anon_ZIndex {
  @scala.inline
  def apply(zIndex: String = null): Anon_ZIndex = {
    val __obj = js.Dynamic.literal()
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ZIndex]
  }
}

