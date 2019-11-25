package typings.atHapiHapi.atHapiHapiMod

import typings.atHapiHapi.Anon_Access
import typings.atHapiHapi.atHapiHapiMod.Util.HTTP_METHODS_PARTIAL
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
  var settings: RouteSettings
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
    settings: RouteSettings,
    vhost: String | js.Array[String] = null
  ): RequestRoute = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    if (vhost != null) __obj.updateDynamic("vhost")(vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestRoute]
  }
}

