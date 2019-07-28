package typings.hapi.hapiMod

import typings.hapi.Anon_Access
import typings.hapi.hapiMod.UtilNs.HTTP_METHODS_PARTIAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestRoute extends js.Object {
  var auth: Anon_Access
  /** the route internal normalized string representing the normalized path. */
  var fingerprint: String
  /** the route HTTP method. */
  var method: HTTP_METHODS_PARTIAL
  /** the route path. */
  var path: String
  /** the active realm associated with the route. */
  var realm: ServerRealm
  /** the route options object with all defaults applied. */
  var settings: RouteOptions
  /** the route vhost option if configured. */
  var vhost: js.UndefOr[String | js.Array[String]] = js.undefined
}

object RequestRoute {
  @scala.inline
  def apply(
    auth: Anon_Access,
    fingerprint: String,
    method: HTTP_METHODS_PARTIAL,
    path: String,
    realm: ServerRealm,
    settings: RouteOptions,
    vhost: String | js.Array[String] = null
  ): RequestRoute = {
    val __obj = js.Dynamic.literal(auth = auth, fingerprint = fingerprint, method = method, path = path, realm = realm, settings = settings)
    if (vhost != null) __obj.updateDynamic("vhost")(vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestRoute]
  }
}

