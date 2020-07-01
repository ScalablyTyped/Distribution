package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icons1 extends js.Object {
  var icons: js.UndefOr[`1`] = js.undefined
}

object Icons1 {
  @scala.inline
  def apply(icons: `1` = null): Icons1 = {
    val __obj = js.Dynamic.literal()
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icons1]
  }
}

