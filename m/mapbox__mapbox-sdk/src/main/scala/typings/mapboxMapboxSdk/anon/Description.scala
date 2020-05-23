package typings.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Description {
  @scala.inline
  def apply(description: String = null, name: String = null): Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

