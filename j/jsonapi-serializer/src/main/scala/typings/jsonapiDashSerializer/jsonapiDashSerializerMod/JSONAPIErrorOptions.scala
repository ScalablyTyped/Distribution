package typings.jsonapiDashSerializer.jsonapiDashSerializerMod

import typings.jsonapiDashSerializer.Anon_About
import typings.jsonapiDashSerializer.Anon_Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONAPIErrorOptions extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var detail: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var links: js.UndefOr[Anon_About] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var source: js.UndefOr[Anon_Parameter] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object JSONAPIErrorOptions {
  @scala.inline
  def apply(
    code: String = null,
    detail: String = null,
    id: String = null,
    links: Anon_About = null,
    meta: js.Any = null,
    source: Anon_Parameter = null,
    status: String = null,
    title: String = null
  ): JSONAPIErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONAPIErrorOptions]
  }
}

