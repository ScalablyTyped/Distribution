package typings
package jsonapiDashSerializerLib.jsonapiDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONAPIErrorOptions extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var detail: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var links: js.UndefOr[jsonapiDashSerializerLib.Anon_About] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var source: js.UndefOr[jsonapiDashSerializerLib.Anon_Parameter] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object JSONAPIErrorOptions {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    detail: java.lang.String = null,
    id: java.lang.String = null,
    links: jsonapiDashSerializerLib.Anon_About = null,
    meta: js.Any = null,
    source: jsonapiDashSerializerLib.Anon_Parameter = null,
    status: java.lang.String = null,
    title: java.lang.String = null
  ): JSONAPIErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (id != null) __obj.updateDynamic("id")(id)
    if (links != null) __obj.updateDynamic("links")(links)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (source != null) __obj.updateDynamic("source")(source)
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[JSONAPIErrorOptions]
  }
}

