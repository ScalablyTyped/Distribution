package typings.hapiHapi.anon

import typings.hapiHapi.mod.RouteExtObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in @hapi/hapi.@hapi/hapi.RouteRequestExtType ]:? @hapi/hapi.@hapi/hapi.RouteExtObject | std.Array<@hapi/hapi.@hapi/hapi.RouteExtObject>} */
trait keyinRouteRequestExtTypeR extends js.Object {
  var onCredentials: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.undefined
  var onPostAuth: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.undefined
  var onPostHandler: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.undefined
  var onPreAuth: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.undefined
  var onPreHandler: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.undefined
  var onPreResponse: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.undefined
}

object keyinRouteRequestExtTypeR {
  @scala.inline
  def apply(
    onCredentials: RouteExtObject | js.Array[RouteExtObject] = null,
    onPostAuth: RouteExtObject | js.Array[RouteExtObject] = null,
    onPostHandler: RouteExtObject | js.Array[RouteExtObject] = null,
    onPreAuth: RouteExtObject | js.Array[RouteExtObject] = null,
    onPreHandler: RouteExtObject | js.Array[RouteExtObject] = null,
    onPreResponse: RouteExtObject | js.Array[RouteExtObject] = null
  ): keyinRouteRequestExtTypeR = {
    val __obj = js.Dynamic.literal()
    if (onCredentials != null) __obj.updateDynamic("onCredentials")(onCredentials.asInstanceOf[js.Any])
    if (onPostAuth != null) __obj.updateDynamic("onPostAuth")(onPostAuth.asInstanceOf[js.Any])
    if (onPostHandler != null) __obj.updateDynamic("onPostHandler")(onPostHandler.asInstanceOf[js.Any])
    if (onPreAuth != null) __obj.updateDynamic("onPreAuth")(onPreAuth.asInstanceOf[js.Any])
    if (onPreHandler != null) __obj.updateDynamic("onPreHandler")(onPreHandler.asInstanceOf[js.Any])
    if (onPreResponse != null) __obj.updateDynamic("onPreResponse")(onPreResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinRouteRequestExtTypeR]
  }
}

