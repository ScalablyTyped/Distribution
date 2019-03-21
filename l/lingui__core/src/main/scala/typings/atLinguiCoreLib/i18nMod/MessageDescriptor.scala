package typings
package atLinguiCoreLib.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDescriptor extends js.Object {
  var defaults: js.UndefOr[java.lang.String] = js.undefined
  var formats: js.UndefOr[js.Object] = js.undefined
  var id: java.lang.String
  var values: js.UndefOr[js.Object] = js.undefined
}

object MessageDescriptor {
  @scala.inline
  def apply(
    id: java.lang.String,
    defaults: java.lang.String = null,
    formats: js.Object = null,
    values: js.Object = null
  ): MessageDescriptor = {
    val __obj = js.Dynamic.literal(id = id)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (formats != null) __obj.updateDynamic("formats")(formats)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[MessageDescriptor]
  }
}

