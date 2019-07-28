package typings.internalDashIp.internalDashIpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait v6 extends js.Object {
  /**
  	 * @returns The IPv6 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `null` will be returned.
  	 *
  	 * @example
  	 *
  	 * console.log(await internalIp.v6());
  	 * //=> 'fe80::1'
  	 */
  def apply(): js.Promise[String] = js.native
  /**
  	 * @returns The IPv6 address of the internet-facing interface, as determined from the default gateway. When the address cannot be determined for any reason, `null` will be returned.
  	 *
  	 * @example
  	 *
  	 * console.log(internalIp.v6.sync());
  	 * //=> 'fe80::1'
  	 */
  def sync(): String = js.native
}

