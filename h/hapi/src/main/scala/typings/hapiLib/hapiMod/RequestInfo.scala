package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInfo extends js.Object {
  /** the request preferred encoding. */
  var acceptEncoding: java.lang.String
  /** if CORS is enabled for the route, contains the following: */
  var cors: hapiLib.Anon_IsOriginMatch
  /** content of the HTTP 'Host' header (e.g. 'example.com:8080'). */
  var host: java.lang.String
  /** the hostname part of the 'Host' header (e.g. 'example.com'). */
  var hostname: java.lang.String
  /** a unique request identifier (using the format '{now}:{connection.info.id}:{5 digits counter}') */
  var id: java.lang.String
  /** request reception timestamp. */
  var received: scala.Double
  /** content of the HTTP 'Referrer' (or 'Referer') header. */
  var referrer: java.lang.String
  /** remote client IP address. */
  var remoteAddress: java.lang.String
  /** remote client port. */
  var remotePort: java.lang.String
  /** request response timestamp (0 is not responded yet). */
  var responded: scala.Double
}

