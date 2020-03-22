package typings.jupyterlabUiComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle extends js.Object {
  var title: js.UndefOr[String] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
}

object AnonTitle {
  @scala.inline
  def apply(title: String = null, uuid: String = null): AnonTitle = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitle]
  }
}

