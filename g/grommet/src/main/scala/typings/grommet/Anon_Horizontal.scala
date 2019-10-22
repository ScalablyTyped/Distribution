package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Horizontal extends js.Object {
  var horizontal: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
}

object Anon_Horizontal {
  @scala.inline
  def apply(horizontal: String = null, vertical: String = null): Anon_Horizontal = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[Anon_Horizontal]
  }
}

