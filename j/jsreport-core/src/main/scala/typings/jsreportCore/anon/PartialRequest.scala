package typings.jsreportCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-core.jsreport-core.Request> */
trait PartialRequest extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var template: js.UndefOr[PartialTemplate] = js.undefined
}

object PartialRequest {
  @scala.inline
  def apply(data: js.Any = null, options: js.Object = null, template: PartialTemplate = null): PartialRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRequest]
  }
}

