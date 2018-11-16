package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequestRoute extends js.Object {
  var auth: hapiLib.Anon_Access
  /** the route internal normalized string representing the normalized path. */
  var fingerprint: java.lang.String
  /** the route HTTP method. */
  var method: hapiLib.hapiMod.UtilNs.HTTP_METHODS_PARTIAL
  /** the route path. */
  var path: java.lang.String
  /** the active realm associated with the route. */
  var realm: ServerRealm
  /** the route options object with all defaults applied. */
  var settings: RouteOptions
  /** the route vhost option if configured. */
  var vhost: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

