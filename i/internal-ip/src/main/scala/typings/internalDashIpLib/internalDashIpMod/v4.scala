package typings
package internalDashIpLib.internalDashIpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait v4 extends js.Object {
  /**
  	 * @returns The IPv4 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `null` will be returned.
  	 *
  	 * @example
  	 *
  	 * console.log(await internalIp.v4())
  	 * //=> '10.0.0.79'
  	 */
  def apply(): js.Promise[java.lang.String] = js.native
  /**
  	 * @returns The IPv4 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `null` will be returned.
  	 *
  	 * @example
  	 *
  	 * console.log(internalIp.v4.sync())
  	 * //=> '10.0.0.79'
  	 */
  def sync(): java.lang.String = js.native
}

