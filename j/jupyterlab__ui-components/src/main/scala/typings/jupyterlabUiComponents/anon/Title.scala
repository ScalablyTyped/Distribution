package typings.jupyterlabUiComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  var title: js.UndefOr[String] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
}

object Title {
  @scala.inline
  def apply(title: String = null, uuid: String = null): Title = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

