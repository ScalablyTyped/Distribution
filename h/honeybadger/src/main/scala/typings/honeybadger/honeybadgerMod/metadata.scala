package typings.honeybadger.honeybadgerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait metadata extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var cgiData: js.UndefOr[js.Object] = js.undefined
  var component: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[js.Object] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var session: js.UndefOr[js.Object] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object metadata {
  @scala.inline
  def apply(
    action: String = null,
    cgiData: js.Object = null,
    component: String = null,
    context: js.Object = null,
    fingerprint: String = null,
    headers: js.Object = null,
    message: String = null,
    name: String = null,
    params: js.Object = null,
    session: js.Object = null,
    url: String = null
  ): metadata = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (cgiData != null) __obj.updateDynamic("cgiData")(cgiData)
    if (component != null) __obj.updateDynamic("component")(component)
    if (context != null) __obj.updateDynamic("context")(context)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (params != null) __obj.updateDynamic("params")(params)
    if (session != null) __obj.updateDynamic("session")(session)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[metadata]
  }
}

