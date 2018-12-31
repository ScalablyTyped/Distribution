package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Socket extends js.Object {
  /**
    * Response timeout in milliseconds. Sets the maximum time allowed for the server to respond to an incoming request before giving up and responding with a Service Unavailable (503) error
    * response.
    */
  var server: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Default value: none (use node default of 2 minutes).
    * By default, node sockets automatically timeout after 2 minutes. Use this option to override this behavior. Set to false to disable socket timeouts.
    */
  var socket: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
}

