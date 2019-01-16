package typings
package isDashOnlineLib.isDashOnlineMod.isOnlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Milliseconds to wait for a server to respond.
    * @default 5000
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Internet Protocol version to use. This is an advanced option that is usually not necessary to be set,
    * but it can prove useful to specifically assert IPv6 connectivity.
    * @default 'v4'
    */
  var version: js.UndefOr[
    isDashOnlineLib.isDashOnlineLibStrings.v4 | isDashOnlineLib.isDashOnlineLibStrings.v6
  ] = js.undefined
}

