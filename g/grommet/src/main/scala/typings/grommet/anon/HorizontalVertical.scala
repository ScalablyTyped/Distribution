package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalVertical extends js.Object {
  var horizontal: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
}

object HorizontalVertical {
  @scala.inline
  def apply(horizontal: String = null, vertical: String = null): HorizontalVertical = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalVertical]
  }
}

