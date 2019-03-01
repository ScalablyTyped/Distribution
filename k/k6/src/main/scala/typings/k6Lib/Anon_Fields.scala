package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: js.UndefOr[js.Object] = js.undefined
  var formSelector: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[k6Lib.httpMod.RequestParams] = js.undefined
  var submitSelector: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Fields {
  @scala.inline
  def apply(
    fields: js.Object = null,
    formSelector: java.lang.String = null,
    params: k6Lib.httpMod.RequestParams = null,
    submitSelector: java.lang.String = null
  ): Anon_Fields = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (formSelector != null) __obj.updateDynamic("formSelector")(formSelector)
    if (params != null) __obj.updateDynamic("params")(params)
    if (submitSelector != null) __obj.updateDynamic("submitSelector")(submitSelector)
    __obj.asInstanceOf[Anon_Fields]
  }
}

