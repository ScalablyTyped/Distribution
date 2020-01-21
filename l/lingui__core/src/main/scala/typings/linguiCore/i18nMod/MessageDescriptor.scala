package typings.linguiCore.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDescriptor extends js.Object {
  var defaults: js.UndefOr[String] = js.undefined
  var formats: js.UndefOr[js.Object] = js.undefined
  var id: String
  var values: js.UndefOr[js.Object] = js.undefined
}

object MessageDescriptor {
  @scala.inline
  def apply(id: String, defaults: String = null, formats: js.Object = null, values: js.Object = null): MessageDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptor]
  }
}

