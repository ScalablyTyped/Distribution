package typings.grommet

import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var margin: js.UndefOr[MarginType] = js.undefined
}

object Anon2 {
  @scala.inline
  def apply(margin: MarginType = null): Anon2 = {
    val __obj = js.Dynamic.literal()
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
}

